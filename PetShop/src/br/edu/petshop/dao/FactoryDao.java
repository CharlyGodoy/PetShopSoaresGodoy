package br.edu.petshop.dao;

import br.edu.petshop.entity.FormaPagamento;
import br.edu.petshop.entity.ItemProduto;
import br.edu.petshop.entity.ItemServico;
import br.edu.petshop.entity.Pedido;
import br.edu.petshop.entity.Pet;
import br.edu.petshop.entity.Produto;
import br.edu.petshop.entity.Servico;
import br.edu.petshop.entity.Usuario;

public class FactoryDao {

	public static InterfaceDao<FormaPagamento> createFormaPagamentoDao() {
		return new FormaPagamentoDao();
	}
	
	public static InterfaceDao<ItemProduto> createItemProdutoDao() {
		return new ItemProdutoDao();
	}
	
	public static InterfaceDao<ItemServico> createItemServicoDao() {
		return new ItemServicoDao();
	}
	
	public static InterfaceDao<Pedido> createPedidoDao() {
		return new PedidoDao();
	}
	
	public static InterfaceDao<Pet> createPetDao() {
		return new PetDao();
	}
	
	public static InterfaceDao<Produto> createProdutoDao() {
		return new ProdutoDao();
	}
	
	public static InterfaceDao<Servico> createServicoDao() {
		return new ServicoDao();
	}
	
	public static InterfaceDao<Usuario> createUsuarioDao() {
		return new UsuarioDao();
	}
}
