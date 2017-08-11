package br.edu.petshop.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.petshop.entity.FormaPagamento;
import br.edu.petshop.entity.ItemProduto;

public class ItemProdutoDao implements InterfaceDao<ItemProduto>{

	public void salvar(ItemProduto itemProduto) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(itemProduto);
		em.getTransaction().commit();
		
		em.close();
		
	}

	public List<ItemProduto> listar() {
		EntityManager em = Conexao.getInstance().createEntityManager();
		
		Query q = em.createQuery("from ItemProduto");
		
		List<ItemProduto> itemProdutos = q.getResultList();
		
		em.close();
		
		return itemProdutos;
	}
}
