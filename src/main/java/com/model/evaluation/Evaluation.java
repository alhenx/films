package com.model.evaluation;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.model.film.Film;
import com.model.user.User;

@Entity
@Table(name="evaluation")
public class Evaluation implements Serializable {

	private static final long serialVersionUID = 4061191158351890911L;

	@Id
	@GeneratedValue
	private Integer id;
	
	private Integer points;
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private Film film;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPoints() {
		return points;
	}
	public void setPoints(Integer points) {
		this.points = points;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Film getFilm() {
		return film;
	}
	public void setFilm(Film film) {
		this.film = film;
	}
	
	
}
