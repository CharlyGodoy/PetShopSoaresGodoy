package br.edu.petshop.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.petshop.entity.ItemServico;

public class ItemServicoDao implements InterfaceDao<ItemServico>{

	public void salvar(ItemServico itemServico) {
		EntityManager em = Conexao.getInstance().createEntityManager();

		em.getTransaction().begin();
		em.persist(itemServico);
		em.getTransaction().commit();

		em.close();

	}

	@SuppressWarnings("unchecked")
	public List<ItemServico> listar() {
		EntityManager em = Conexao.getInstance().createEntityManager();

		Query q = em.createQuery("from ItemServico");

		List<ItemServico> itemServicos = q.getResultList();

		em.close();

		return itemServicos;
	}

	@Override
	public void Excluir(ItemServico itemServico) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		
		em.getTransaction().begin();
		em.remove(em.merge(itemServico));
		em.getTransaction().commit();
		
		em.close();
		
	}

	@Override
	public ItemServico BuscarPorId(Long t) {
		// TODO Auto-generated method stub
		return null;
	}
}
