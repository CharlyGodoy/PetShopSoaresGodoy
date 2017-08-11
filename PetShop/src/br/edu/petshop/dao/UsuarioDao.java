package br.edu.petshop.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.petshop.entity.ItemServico;
import br.edu.petshop.entity.Usuario;

public class UsuarioDao implements InterfaceDao<Usuario>{

	public void salvar(Usuario usuario) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
		
		em.close();
		
	}

	public List<Usuario> listar() {
		EntityManager em = Conexao.getInstance().createEntityManager();
		
		Query q = em.createQuery("from Usuario");
		
		List<Usuario> usuarios = q.getResultList();
		
		em.close();
		
		return usuarios;
	}
}
