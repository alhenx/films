package com.dao.evaluation;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.model.evaluation.Evaluation;

public interface EvaluationDao extends PagingAndSortingRepository<Evaluation, Integer>{
	
	public List<Evaluation> findByPointsGreaterThanEqual(Integer points);
	public List<Evaluation> findByPointsLessThanEqual(Integer points);
}
