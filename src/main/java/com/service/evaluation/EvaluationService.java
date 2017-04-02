package com.service.evaluation;

import java.util.List;

import com.dto.evaluation.EvaluationDTO;
import com.dto.evaluation.EvaluationPostDTO;
import com.exceptions.NotFoundException;
import com.model.evaluation.Evaluation;

public interface EvaluationService {
	EvaluationDTO transform(Evaluation e);
	Evaluation transform(EvaluationDTO e);
	Evaluation transform(EvaluationPostDTO e);
	Evaluation transformWithId(Integer id, EvaluationPostDTO e);
	public EvaluationDTO findById(Integer id) throws NotFoundException;
	public List<EvaluationDTO> findByParams(Integer cat, Integer user, Integer film) throws NotFoundException;;
	public EvaluationDTO create(EvaluationPostDTO e);
	public EvaluationDTO update(Integer id, EvaluationPostDTO e) throws NotFoundException;
	public void delete(Integer id) throws NotFoundException;

}
