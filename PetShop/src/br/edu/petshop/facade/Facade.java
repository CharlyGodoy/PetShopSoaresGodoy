package br.edu.petshop.facade;

import java.util.List;

import br.edu.petshop.business.BusinessException;
import br.edu.petshop.business.BusinessPet;
import br.edu.petshop.business.BusinessProduto;
import br.edu.petshop.business.BusinessServico;
import br.edu.petshop.business.BusinessUsuario;
import br.edu.petshop.entity.Pet;
import br.edu.petshop.entity.Produto;
import br.edu.petshop.entity.Servico;
import br.edu.petshop.entity.Usuario;

public class Facade {

	private BusinessUsuario businessUsuario;
	private BusinessPet businessPet;
	private BusinessProduto businessProduto;
	private BusinessServico businessServico;
	
	public Facade(){
		businessUsuario = new BusinessUsuario();
		businessPet = new BusinessPet();
	}
	
	public void cadastrarPet(Pet pet) throws BusinessException{
			businessPet.salvar(pet);
	}
	
	public List<Pet> listarPet(){
		return businessPet.listar();
	}
	
	public void cadastrarUsuario(Usuario usuario) throws BusinessException{
		businessUsuario.salvar(usuario);
	}
	
	public void cadastrarProduto (Produto produto) throws BusinessException{
		businessProduto.salvar(produto);
	}
	
	public void cadastrarServico(Servico servico) throws BusinessException{
		businessServico.salvar(servico);
	}
	
	public List<Servico> listarServico(){
		return businessServico.listar();
	}
}
