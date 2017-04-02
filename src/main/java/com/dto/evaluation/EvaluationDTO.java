package com.dto.evaluation;

import java.io.Serializable;

public class EvaluationDTO implements Serializable{

	private static final long serialVersionUID = 6547927655556011477L;
	
	private Integer points;
	private String user;
	private String film;
	
	public EvaluationDTO(){
		super();
	}
	
	public EvaluationDTO(Integer points){
		super();
		this.points=points;
	}
	
	public EvaluationDTO(Integer points, String user, String film){
		super();
		this.points=points;
		this.user=user;
		this.film=film;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getFilm() {
		return film;
	}

	public void setFilm(String film) {
		this.film = film;
	}


}
