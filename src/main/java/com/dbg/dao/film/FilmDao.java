package com.dbg.dao.film;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.dbg.model.film.Film;

public interface FilmDao extends PagingAndSortingRepository<Film, Integer>{
	public List<Film> findByNameContaining(String name);
	public List<Film> findByYearEqual(String year);
	public List<Film> findYearLessThan(String year);
	public List<Film> findYearGreaterThan(String year);
	public List<Film> findYearLessThanEqual(String year);
	public List<Film> findYearGreaterThanEqual(String year);

}
