package br.edu.petshop.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.petshop.entity.Pet;

public class PetDao implements InterfaceDao<Pet>{

	public void salvar(Pet pet) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(pet);
		em.getTransaction().commit();
		
		em.close();
		
	}

	@SuppressWarnings("unchecked")
	public List<Pet> listar() {
		EntityManager em = Conexao.getInstance().createEntityManager();
		
		Query q = em.createQuery("from Pet");
		
		List<Pet> pets = q.getResultList();
		
		em.close();
		
		return pets;
	}
	
	@Override
	public Pet BuscarPorId (Long id) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		
		Pet pet = em.find(Pet.class, id);
		em.close();
		
		return pet;
	}

	@Override
	public void Excluir(Pet pet) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		
		em.getTransaction().begin();
		em.remove(em.merge(pet));
		em.getTransaction().commit();
		
		em.close();
	}

}
