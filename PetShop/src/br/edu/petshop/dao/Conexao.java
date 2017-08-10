package br.edu.petshop.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("PetShop");
	
	public static EntityManagerFactory getInstance(){
		return emf;
	}
	
}
