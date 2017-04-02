package com.model.user;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.model.evaluation.Evaluation;

@Entity
@Table(name="user")
public class User implements Serializable{
	
	private static final long serialVersionUID = -7791561173017059843L;

	@Id
	@GeneratedValue
	private Integer id;

	@Column(unique=true)
	private String name;

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private List<Evaluation> evaluation;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Evaluation> getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(List<Evaluation> evaluation) {
		this.evaluation = evaluation;
	}
	
	
}
