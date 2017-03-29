package com.dbg.model.evaluation;

import java.io.Serializable;

public class Evaluation implements Serializable {

	private static final long serialVersionUID = 4061191158351890911L;

	private Integer id;
	private Integer points;
	
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
	
	
}