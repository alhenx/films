package com.dbg.model.film;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.dbg.model.category.Category;
import com.dbg.model.evaluation.Evaluation;

@Entity
@Table(name="film")
public class Film implements Serializable{

	private static final long serialVersionUID = -2883329025872466612L;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String title;
	private Integer year;
	
	@OneToOne
	private Category category;
	
	@OneToMany(mappedBy = "film")
	private List<Evaluation> evaluation;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
