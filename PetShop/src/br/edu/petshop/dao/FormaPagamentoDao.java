package br.edu.petshop.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.petshop.entity.FormaPagamento;

 class FormaPagamentoDao implements InterfaceDao<FormaPagamento>{

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

	@Override
	public void Editar(FormaPagamento t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Excluir(FormaPagamento formaPagamento) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		
		em.getTransaction().begin();
		em.remove(formaPagamento);
		em.getTransaction().commit();
		
		em.close();
		
	}
}
