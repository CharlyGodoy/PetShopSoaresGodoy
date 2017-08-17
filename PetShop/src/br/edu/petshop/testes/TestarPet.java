package br.edu.petshop.testes;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.edu.petshop.business.BusinessException;
import br.edu.petshop.business.BusinessPet;
import br.edu.petshop.dao.FactoryDao;
import br.edu.petshop.dao.InterfaceDao;
import br.edu.petshop.entity.Pet;
import br.edu.petshop.entity.Usuario;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestarPet {

	public Usuario usuarioTeste() {
		Usuario usuario = new Usuario();
		usuario.setCpf("123"); 
		return usuario;
	}
	
	@Test
	public void cadastrarPet() {
		
		Pet pet = new Pet();
		pet.setPetId(null);
		pet.setNome("Tutubarão");
		pet.setTipo("Peixe");
		pet.setRaca("Dourado");
		pet.setPeso(0.5);
		pet.setDataNascimento(new Date());
		pet.setUsuario(usuarioTeste());
		
		BusinessPet businessPet = new BusinessPet();
		
		try{
			businessPet.salvar(pet);
		}catch (BusinessException e){
			e.printStackTrace();
		}
		
		
		Assert.assertEquals(true, pet.getPetId() != null);
		
	}
	
	@Test
	public void listarPet() {
		
		InterfaceDao<Pet> petDao = FactoryDao.createPetDao();
		
		List<Pet> pets = petDao.listar();
		
		Assert.assertEquals(true, pets.size() > 0);
		
	}

	
	@Test //Duvida, como fazer teste pra excluir?
	public void excluirPet() {
		
		InterfaceDao<Pet> petDao = FactoryDao.createPetDao();
		
		Pet pet = petDao.listar().get(1);
		
		petDao.Excluir(pet);
		
		//Assert.assertEquals(true, );
		
	}
	
}
