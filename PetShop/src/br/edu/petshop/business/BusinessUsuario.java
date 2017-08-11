package br.edu.petshop.business;

import br.edu.petshop.dao.InterfaceDao;
import br.edu.petshop.dao.UsuarioDao;
import br.edu.petshop.entity.Usuario;

public class BusinessUsuario {

	public void salvar (Usuario a) throws BusinessException{
		if (a.getLogin() == null || a.getLogin().equals(""))
		{
			throw new
			BusinessException("RN01 - Matricula inválida.");
		}
		
		InterfaceDao<Usuario> alunoDao = new UsuarioDao();
		alunoDao.salvar(a);
	}
}
