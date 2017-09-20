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
		businessProduto = new BusinessProduto();
		businessServico = new BusinessServico();
	}
	
//---------------------------------------------------------------------------------
	//PET
	
	public void cadastrarPet(Pet pet) throws BusinessException{
			businessPet.salvar(pet);
	}
	
	public void excluirPet(Pet pet) throws BusinessException{
		businessPet.excluir(pet);
	}
	
	public void editarPet(Pet pet) throws BusinessException{
		businessPet.editar(pet);
	}
	
	public Pet buscarPetPorId(Long id) {
		return businessPet.buscarPorId(id);
	}
	
	public List<Pet> listarPet(){
		return businessPet.listar();
	}
	
	
//---------------------------------------------------------------------------------
	// USUARIO
	
	public void cadastrarUsuario(Usuario usuario) throws BusinessException{
		businessUsuario.salvar(usuario);
	}
	
	public void excluirUsuario(Usuario usuario) throws BusinessException{
		businessUsuario.excluir(usuario);
	}
	
	public void editarUsuario(Usuario usuario) throws BusinessException{
		businessUsuario.editar(usuario);
	}
	
	public Usuario buscarUsuarioPorId(Long id) {
		return businessUsuario.buscarPorId(id);
	}
	
	public List<Usuario> listarUsuario() {
		return businessUsuario.listar();
	}

	
//---------------------------------------------------------------------------------
	//PRODUTO
	
	public void cadastrarProduto (Produto produto) throws BusinessException{
		businessProduto.salvar(produto);
	}
	
	public void excluirProduto (Produto produto) throws BusinessException{
		businessProduto.excluir(produto);
	}
	
	public void editarProduto (Produto produto) throws BusinessException{
		businessProduto.editar(produto);
	}
	
	public Produto buscarProdutoPorId(Long id) {
		return businessProduto.buscarPorId(id);
	}
	
	public List<Produto> listarProduto() {
		return businessProduto.listar();
	}
	
//-------------------------------------------------------------------------------
	//SERVICO
	
	public void cadastrarServico(Servico servico) throws BusinessException{
		businessServico.salvar(servico);
	}
	
	public void excluirServico(Servico servico) throws BusinessException{
		businessServico.excluir(servico);
	}
	
	public void editarServico(Servico servico) throws BusinessException{
		businessServico.editar(servico);
	}
	
	public Servico buscarServicoPorId(Long id) {
		return businessServico.buscarPorId(id);
	}
	
	public List<Servico> listarServico(){
		return businessServico.listar();
	}
}
