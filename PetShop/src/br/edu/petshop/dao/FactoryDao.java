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

	public static InterfaceDao<FormaPagamento> createFormaPagamento() {
		return new FormaPagamentoDao();
	}
	
	public static InterfaceDao<ItemProduto> createItemProduto() {
		return new ItemProdutoDao();
	}
	
	public static InterfaceDao<ItemServico> createItemServico() {
		return new ItemServicoDao();
	}
	
	public static InterfaceDao<Pedido> createPedido() {
		return new PedidoDao();
	}
	
	public static InterfaceDao<Pet> createPet() {
		return new PetDao();
	}
	
	public static InterfaceDao<Produto> createProduto() {
		return new ProdutoDao();
	}
	
	public static InterfaceDao<Servico> createServico() {
		return new ServicoDao();
	}
	
	public static InterfaceDao<Usuario> createUsuario() {
		return new UsuarioDao();
	}
}
