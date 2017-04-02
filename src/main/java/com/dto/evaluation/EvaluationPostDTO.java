package com.dto.evaluation;

public class EvaluationPostDTO extends EvaluationDTO{

	private static final long serialVersionUID = -5700405773493223974L;
	
	private Integer idUser;
	private Integer idFilm;
	
	public EvaluationPostDTO(){
		super();
	}
	
	public EvaluationPostDTO(Integer points, Integer idUser, Integer idFilm){
		super(points);
		this.idUser=idUser;
		this.idFilm=idFilm;
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public Integer getIdFilm() {
		return idFilm;
	}

	public void setIdFilm(Integer idFilm) {
		this.idFilm = idFilm;
	}


}
