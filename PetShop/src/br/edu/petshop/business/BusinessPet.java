package br.edu.petshop.business;

import br.edu.petshop.dao.FactoryDao;
import br.edu.petshop.dao.InterfaceDao;
import br.edu.petshop.entity.Pet;
import br.edu.petshop.entity.Usuario;

public class BusinessPet {

	public void salvar (Pet pet) throws BusinessException{
		if (pet.getNome() == null || pet.getNome().equals("") )
		{
			throw new
			BusinessException("Nome inv�lido.");
		}
		if (pet.getTipo() == null || pet.getTipo().equals("") )
		{
			throw new
			BusinessException("Tipo inv�lido.");
		}
		if (pet.getRaca() == null || pet.getRaca().equals("") )
		{
			throw new
			BusinessException("Ra�a inv�lido.");
		}
		if (pet.getPeso() == null)
		{
			throw new
			BusinessException("Peso inv�lido.");
		}
		if (pet.getDataNascimento() == null)
		{
			throw new
			BusinessException("Data inv�lida.");
		}
		if (pet.getUsuario() == null)
		{
			throw new
			BusinessException("Usuario inv�lido.");
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
			BusinessException("Usuario n�o cadastrado.");
		}
		
		InterfaceDao<Pet> petDao = FactoryDao.createPetDao();
		petDao.salvar(pet);
	}
}
