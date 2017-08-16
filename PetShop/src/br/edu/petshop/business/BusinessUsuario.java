package br.edu.petshop.business;

import br.edu.petshop.dao.FactoryDao;
import br.edu.petshop.dao.InterfaceDao;
import br.edu.petshop.entity.Usuario;

public class BusinessUsuario {

	public void salvar (Usuario usuario) throws BusinessException{						
		if (usuario.getNome() == null || usuario.getNome().equals("")){
			throw new
			BusinessException("RN02 - Nome inválido");
		}
		
		if (usuario.getNome() == null || usuario.getNome().equals("")){
			throw new
			BusinessException("RN02 - Nome inválido");
		}
		
		if (usuario.getEndereco() == null || usuario.getEndereco().equals("")){
			throw new
			BusinessException("RN02 - Endereço inválido");
		}
		
		if (usuario.getTelefone() == null || usuario.getTelefone().equals("")){
			throw new
			BusinessException("RN02 - Telefone inválido");
		}
		
		if (usuario.getNome() == null || usuario.getNome().equals("")){
			throw new
			BusinessException("RN02 - Nome inválido");
		}
		
		if (usuario.getLogin() == null || usuario.getLogin().equals("")){
			throw new
			BusinessException("RN01 - Login inválido.");
		}
		
		if (usuario.getSenha() == null || usuario.getSenha().equals("")){
			throw new
			BusinessException("RN01 - Senha inválido.");
		}
		
		if (usuario.getSenha() == null || usuario.getSenha().equals("")){
			throw new
			BusinessException("RN01 - Senha inválido.");
		}
		
		if (usuario.getTipoUsuario() == null || usuario.getTipoUsuario() <= 0){
			throw new
			BusinessException("RN01 - Tipo usuário inválido.");
		}
		
		if (usuario.getCpf() == null || usuario.getCpf().equals("")){
			throw new
			BusinessException("RN01 - CPF inválido.");
		}
		
		InterfaceDao<Usuario> alunoDao = FactoryDao.createUsuarioDao();//new UsuarioDao();
		alunoDao.salvar(usuario);		
	}
}
