package br.edu.petshop.business;

import java.util.List;

import br.edu.petshop.dao.FactoryDao;
import br.edu.petshop.dao.InterfaceDao;
import br.edu.petshop.entity.Pet;
import br.edu.petshop.entity.Usuario;

public class BusinessPet {

	public void salvar (Pet pet) throws BusinessException{

		if (pet.getNome() == null || pet.getNome().equals("") )
		{
			throw new
			BusinessException("Nome inválido.");
		}
		if (pet.getTipo() == null || pet.getTipo().equals("") )
		{
			throw new
			BusinessException("Tipo inválido.");
		}
		if (pet.getRaca() == null || pet.getRaca().equals("") )
		{
			throw new
			BusinessException("Raça inválido.");
		}
		if (pet.getPeso() == null)
		{
			throw new
			BusinessException("Peso inválido.");
		}
		if (pet.getDataNascimento() == null)
		{
			throw new
			BusinessException("Data inválida.");
		}
		if (pet.getUsuario() == null)
		{
			throw new
			BusinessException("Usuario inválido.");
		}
		
		InterfaceDao<Usuario> usuarioDao = FactoryDao.createUsuarioDao();
		Boolean existe = false;
		
		for (Usuario item : usuarioDao.listar()) {
			if(item.getCpf().equals(pet.getUsuario().getCpf())){
				existe = true;
				pet.setUsuario(item);
				break;
			}
		}
		if (existe == false)
		{
			throw new
			BusinessException("Usuario não cadastrado.");
		}
		
		InterfaceDao<Pet> petDao = FactoryDao.createPetDao();
		petDao.salvar(pet);
	}

	public List<Pet> listar(){
		
		InterfaceDao<Pet> petDao = FactoryDao.createPetDao();
		
		List<Pet> pets = petDao.listar();
		
		return pets;
	}
	
	public void excluir(Pet pet) throws BusinessException{
		if (pet.getPetId() == null || pet.getPetId().equals("")){
			throw new
			BusinessException("RN01 - ID inválido");
		}
		
		InterfaceDao<Pet> petDao = FactoryDao.createPetDao();//new UsuarioDao();
		petDao.Excluir(pet);
	}

	public Pet buscarPorId(Long id) {
		InterfaceDao<Pet> petDao = FactoryDao.createPetDao();
		
		Pet pet = petDao.BuscarPorId(id);
		return pet;
	}
}
