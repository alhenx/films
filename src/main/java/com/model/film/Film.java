package com.model.film;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.model.category.Category;
import com.model.evaluation.Evaluation;

@Entity
@Table(name="film")
public class Film implements Serializable{

	private static final long serialVersionUID = -2883329025872466612L;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String title;
	private Integer year;
	
	@ManyToOne
	private Category category;
	
	@OneToMany(mappedBy = "film", fetch = FetchType.LAZY)
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
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public List<Evaluation> getEvaluation() {
		return evaluation;
	}
	public void setEvaluation(List<Evaluation> evaluation) {
		this.evaluation = evaluation;
	}
	
	
}
