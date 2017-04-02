package com.dao.category;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.model.category.Category;

public interface CategoryDao extends PagingAndSortingRepository<Category, Integer>{

	public List<Category> findByNameLike(String name);
}
