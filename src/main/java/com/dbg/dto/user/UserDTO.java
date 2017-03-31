package com.dbg.dto.user;

import java.io.Serializable;

public class UserDTO implements Serializable{

	private static final long serialVersionUID = -6608062330490381145L;
	
	protected String name;
	
	public UserDTO(){
		super();
	}
	
	public UserDTO(String name){
		this.name=name;
	}

	public String getName() {
		return name;
	}

}
