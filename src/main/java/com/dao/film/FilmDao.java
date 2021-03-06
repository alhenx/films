package com.dao.film;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.dto.film.FilmDTO;
import com.model.film.Film;

public interface FilmDao extends PagingAndSortingRepository<Film, Integer>{
	public List<Film> findByTitleContaining(String name);
	public List<Film> findByYearGreaterThanEqual(Integer year);
	public List<Film> findByYearLessThanEqual(Integer year);
	public FilmDTO findById(Integer id);
}
