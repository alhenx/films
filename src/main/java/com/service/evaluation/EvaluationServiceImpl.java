package com.service.evaluation;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.evaluation.EvaluationDao;
import com.dao.film.FilmDao;
import com.dao.user.UserDao;
import com.dto.evaluation.EvaluationDTO;
import com.dto.evaluation.EvaluationPostDTO;
import com.exceptions.NotFoundException;
import com.model.evaluation.Evaluation;

@Service
public class EvaluationServiceImpl implements EvaluationService{
	
	private static final Logger log = LoggerFactory.getLogger(EvaluationService.class);
	
	@Autowired
	private EvaluationDao evaluationDao;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private FilmDao filmDao;
	
	@Override
	public EvaluationDTO transform(Evaluation e) {
		return new EvaluationDTO(e.getPoints(), e.getUser().getName(), e.getFilm().getTitle());
	}

	@Override
	public Evaluation transform(EvaluationDTO e) {
		final Evaluation evaluation = new Evaluation();
		evaluation.setPoints(e.getPoints());
		return evaluation;
	}
	
	@Override
	public Evaluation transform(EvaluationPostDTO e){
		final Evaluation evaluation = new Evaluation();
		evaluation.setPoints(e.getPoints());
		evaluation.setUser(userDao.findOne(e.getIdUser()));
		evaluation.setFilm(filmDao.findOne(e.getIdFilm()));
		return evaluation;
	}
	
	@Override
	public Evaluation transformWithId(Integer id, EvaluationPostDTO e){
		final Evaluation evaluation = new Evaluation();
		evaluation.setPoints(e.getPoints());
		evaluation.setId(id);
		evaluation.setUser(userDao.findOne(e.getIdUser()));
		evaluation.setFilm(filmDao.findOne(e.getIdFilm()));
		return evaluation;
	}


	@Override
	public EvaluationDTO findById(Integer id) throws NotFoundException{
		final Evaluation e = evaluationDao.findOne(id);
		if(e!=null){
			log.debug("Entidad encontrada");
			return transform(e);
		}
		log.error("La entidad buscada no existe");
		throw new NotFoundException();
	}

	@Override
	public List<EvaluationDTO> findByParams(Integer cat, Integer user, Integer film) throws NotFoundException {
		List<EvaluationDTO> allEvaluation = new ArrayList<EvaluationDTO>();
		evaluationDao.findAll().forEach(e -> {
			if((e.getUser().getId()==user || user==null) && (e.getFilm().getId()==film || film==null) && (e.getFilm().getCategory().getId()==cat || cat==null)) 
				allEvaluation.add(transform(e));});
		if(!allEvaluation.isEmpty()){
			log.debug("Alguna entidad encontrada");
			return allEvaluation;
		}
		log.error("No existe entidad con estos parametros");
		throw new NotFoundException("No existe entidad con estos parametros");
	}

	@Override
	public EvaluationDTO create(EvaluationPostDTO e) {
		return transform(evaluationDao.save(transform(e)));
	}

	@Override
	public EvaluationDTO update(Integer id, EvaluationPostDTO e) throws NotFoundException{
		if(evaluationDao.findOne(id)!=null){
			log.debug("La entidad se va a actualizar");
			return transform(evaluationDao.save(transformWithId(id,e)));
		}
		log.error("La entidad a modificar no existe");
		throw new NotFoundException("La entidad a modificar no existe");
	}

	@Override
	public void delete(Integer id)  throws NotFoundException{
		if(evaluationDao.findOne(id)!=null){
			log.debug("La entidad se va a borrar");
			evaluationDao.delete(id);
		}else{
			log.error("La entidad buscada no existe");
			throw new NotFoundException();
		}
		
	}

}
