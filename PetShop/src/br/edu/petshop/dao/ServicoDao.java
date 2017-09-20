package br.edu.petshop.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.petshop.entity.ItemServico;
import br.edu.petshop.entity.Produto;
import br.edu.petshop.entity.Servico;

public class ServicoDao implements InterfaceDao<Servico>{

	public void salvar(Servico servico) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(servico);
		em.getTransaction().commit();
		
		em.close();
		
	}

	@SuppressWarnings("unchecked")
	public List<Servico> listar() {
		EntityManager em = Conexao.getInstance().createEntityManager();
		
		Query q = em.createQuery("from Servico");
		
		List<Servico> servicos = q.getResultList();
		
		em.close();
		
		return servicos;
	}

	@Override
	public void Editar(Servico servico) {
EntityManager em = Conexao.getInstance().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(servico);
		em.getTransaction().commit();
		
		em.close();
		
	}
	
	@Override
	public Servico BuscarPorId (Long id) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		
		Servico servico = em.find(Servico.class, id);
		em.close();
		
		return servico;
	}

	@Override
	public void Excluir(Servico servico) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		
		em.getTransaction().begin();
		em.remove(servico);
		em.getTransaction().commit();
		
		em.close();
		
	}

}
