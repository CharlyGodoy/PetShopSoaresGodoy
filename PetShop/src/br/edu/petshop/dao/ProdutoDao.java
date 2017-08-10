package br.edu.petshop.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.petshop.entity.Produto;

public class ProdutoDao {

	public void salvar(Produto produto) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(produto);
		em.getTransaction().commit();
		
		em.close();
		
	}

	public List<Produto> listar() {
		EntityManager em = Conexao.getInstance().createEntityManager();
		
		Query q = em.createQuery("from Produto");
		
		List<Produto> produtos = q.getResultList();
		
		em.close();
		
		return produtos;
	}
}
