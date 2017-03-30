package com.dbg.dao.evaluation;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.dbg.model.evaluation.Evaluation;

public interface EvaluationDao extends PagingAndSortingRepository<Evaluation, Integer>{
	
	public List<Evaluation> findByPointsEqual(String points);
	public List<Evaluation> findByPointsLessThan(String points);
	public List<Evaluation> findByPointsGreaterThan(String points);
	public List<Evaluation> findByPointsLessThanEqual(String points);
	public List<Evaluation> findByPointsGreaterThanEqual(String points);
}
