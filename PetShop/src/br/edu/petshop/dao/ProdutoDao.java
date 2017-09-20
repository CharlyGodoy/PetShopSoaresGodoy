package br.edu.petshop.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.petshop.entity.ItemServico;
import br.edu.petshop.entity.Produto;
import br.edu.petshop.entity.Usuario;

public class ProdutoDao implements InterfaceDao<Produto>{

	public void salvar(Produto produto) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(produto);
		em.getTransaction().commit();
		
		em.close();
		
	}

	@SuppressWarnings("unchecked")
	public List<Produto> listar() {
		EntityManager em = Conexao.getInstance().createEntityManager();
		
		Query q = em.createQuery("from Produto");
		
		List<Produto> produtos = q.getResultList();
		
		em.close();
		
		return produtos;
	}

	@Override
	public void Editar(Produto produto) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(produto);
		em.getTransaction().commit();
		
		em.close();
		
	}
	
	@Override
	public Produto BuscarPorId (Long id) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		
		Produto produto = em.find(Produto.class, id);
		em.close();
		
		return produto;
	}

	@Override
	public void Excluir(Produto produto) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		
		em.getTransaction().begin();
		em.remove(produto);
		em.getTransaction().commit();
		
		em.close();
		
	}

}
