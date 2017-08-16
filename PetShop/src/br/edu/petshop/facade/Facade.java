package br.edu.petshop.facade;

import br.edu.petshop.business.BusinessException;
import br.edu.petshop.business.BusinessPet;
import br.edu.petshop.business.BusinessUsuario;
import br.edu.petshop.entity.Pet;
import br.edu.petshop.entity.Usuario;

public class Facade {

	private BusinessUsuario businessUsuario;
	private BusinessPet businessPet;
	
	public Facade(){
		businessUsuario = new BusinessUsuario();
		businessPet = new BusinessPet();
	}
	
	public void cadastrarPet(Pet pet) throws BusinessException{
			businessPet.salvar(pet);
	}
	
	public void cadastrarUsuario(Usuario usuario) throws BusinessException{
		businessUsuario.salvar(usuario);
	}
}
