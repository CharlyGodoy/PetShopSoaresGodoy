package br.edu.petshop.testes;

import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.edu.petshop.business.BusinessException;
import br.edu.petshop.business.BusinessProduto;
import br.edu.petshop.dao.FactoryDao;
import br.edu.petshop.dao.InterfaceDao;
import br.edu.petshop.entity.Produto;
import br.edu.petshop.entity.Usuario;
import br.edu.petshop.facade.Facade;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestarProduto {

	Facade facade = new Facade();
	
	@Test
	public void cadastrarProduto() {			
		
		Produto produto = new Produto();
		produto.setProdutoId(null);
		produto.setNome("Shampoo");
		produto.setDescricao("Para limpar os pêlos do pet.");
		produto.setEstoqueProduto((long)10);
		produto.setValorProduto(20.00);			
		
		try{
			facade.cadastrarProduto(produto);
		}catch (BusinessException e){
			e.printStackTrace();
		}
		
		
		Assert.assertEquals(true, produto.getProdutoId() != null);
		
	}
	
	@Test
	public void listarProdutos() {
		
		List<Produto> produtos = facade.listarProduto();
		
		Assert.assertEquals(true, produtos.size() > 0);
		
	}
}
