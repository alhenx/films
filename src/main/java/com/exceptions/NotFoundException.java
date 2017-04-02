package com.exceptions;

public class NotFoundException extends Exception{

	private static final long serialVersionUID = -910530005960752581L;
	
	private static final String MSG = "La entidad buscada no existe.";
	
	public NotFoundException(){
		super(MSG);
	}
	
	public NotFoundException(String message){
		super(message);
		
	}

}
