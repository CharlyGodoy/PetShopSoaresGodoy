package br.edu.petshop.business;

public class BusinessException extends Exception{

	private static final long serialVersionUID = 1L;
	public BusinessException(String errorMessage){
		super(errorMessage);
	}
}
