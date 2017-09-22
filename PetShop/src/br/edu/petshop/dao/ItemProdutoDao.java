package br.edu.petshop.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.petshop.entity.ItemProduto;

public class ItemProdutoDao implements InterfaceDao<ItemProduto>{

	public void salvar(ItemProduto itemProduto) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(itemProduto);
		em.getTransaction().commit();
		
		em.close();
		
	}

	@SuppressWarnings("unchecked")
	public List<ItemProduto> listar() {
		EntityManager em = Conexao.getInstance().createEntityManager();
		
		Query q = em.createQuery("from ItemProduto");
		
		List<ItemProduto> itemProdutos = q.getResultList();
		
		em.close();
		
		return itemProdutos;
	}

	@Override
	public void Excluir(ItemProduto itemProduto) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		
		em.getTransaction().begin();
		em.remove(em.merge(itemProduto));
		em.getTransaction().commit();
		
		em.close();
		
	}

	@Override
	public ItemProduto BuscarPorId(Long t) {
		// TODO Auto-generated method stub
		return null;
	}
}
