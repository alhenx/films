package com.controller.evaluation;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dto.evaluation.EvaluationDTO;
import com.dto.evaluation.EvaluationPostDTO;
import com.exceptions.NotFoundException;
import com.service.evaluation.EvaluationService;

@RestController
@RequestMapping(value = "/evaluation")
public class EvaluationController {
	
	@Autowired
	private EvaluationService evaluationService;
	
	private static final Logger log = LoggerFactory.getLogger(EvaluationController.class);
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public EvaluationDTO findById(@PathVariable("id") Integer id) throws NotFoundException{
		log.debug("Buscando evaluacion con id %s", id);
		return evaluationService.findById(id);
	}
	
	
	@RequestMapping(method = RequestMethod.GET)
	public List<EvaluationDTO> findByParams(
			@RequestParam(name="IdCategory", required=false) Integer idcat, 
			@RequestParam(name="IdUser", required=false) Integer iduser, 
			@RequestParam(name="IdFilm", required=false) Integer idfilm
			) throws NotFoundException{
		log.debug("Buscando todas las evaluaciones con los parametros indicados");
		return evaluationService.findByParams(idcat,iduser,idfilm);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public EvaluationDTO create(@RequestBody EvaluationPostDTO e){
		log.debug("Creando nueva evaluacion");
		return evaluationService.create(e);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") Integer id) throws NotFoundException{
		log.debug("Borrando evaluacion");
		evaluationService.delete(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public EvaluationDTO update(@PathVariable("id") Integer id, @RequestBody EvaluationPostDTO e) throws NotFoundException{
		log.debug("Actualizando la evaluacion %s", id);
		return evaluationService.update(id,e);
	}

}
