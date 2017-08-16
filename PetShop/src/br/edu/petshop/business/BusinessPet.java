package br.edu.petshop.business;

import java.util.Date;

import org.hibernate.hql.ast.tree.BooleanLiteralNode;

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
		
		InterfaceDao<Usuario> usuarioDao = FactoryDao.createUsuario();
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
		
		InterfaceDao<Pet> petDao = FactoryDao.createPet();
		petDao.salvar(pet);
	}
}
