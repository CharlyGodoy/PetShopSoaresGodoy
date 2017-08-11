package br.edu.petshop.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.petshop.entity.ItemServico;
import br.edu.petshop.entity.Pedido;

public class PedidoDao implements InterfaceDao<Pedido>{

	public void salvar(Pedido pedido) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(pedido);
		em.getTransaction().commit();
		
		em.close();
		
	}

	public List<Pedido> listar() {
		EntityManager em = Conexao.getInstance().createEntityManager();
		
		Query q = em.createQuery("from Pedido");
		
		List<Pedido> pedidos = q.getResultList();
		
		em.close();
		
		return pedidos;
	}
}
