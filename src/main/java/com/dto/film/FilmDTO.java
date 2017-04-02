package com.dto.film;

import java.io.Serializable;

public class FilmDTO implements Serializable{

	private static final long serialVersionUID = -4400443452602956572L;
	
	private String title;
	private Integer year;
	
	public FilmDTO(){
		super();
	}
	
	public FilmDTO(String title, Integer year){
		super();
		this.setTitle(title);
		this.setYear(year);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

}
