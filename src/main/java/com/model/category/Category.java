package com.model.category;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.model.film.Film;

@Entity
@Table(name="category")
public class Category implements Serializable{

	private static final long serialVersionUID = -3394648215089058215L;

	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	@OneToMany(mappedBy="category", fetch = FetchType.LAZY)
	private List<Film> film = new ArrayList<Film>();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public List<Film> getFilm() {
		return film;
	}
	public void setFilm(List<Film> film) {
		this.film = film;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
