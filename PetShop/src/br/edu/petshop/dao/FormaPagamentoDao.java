package br.edu.petshop.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.petshop.entity.FormaPagamento;

public class FormaPagamentoDao {

	public void salvar(FormaPagamento formaPagamento) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(formaPagamento);
		em.getTransaction().commit();
		
		em.close();
		
	}

	public List<FormaPagamento> listar() {
		EntityManager em = Conexao.getInstance().createEntityManager();
		
		Query q = em.createQuery("from FormaPagamento");
		
		List<FormaPagamento> formasPagamento = q.getResultList();
		
		em.close();
		
		return formasPagamento;
	}
}
