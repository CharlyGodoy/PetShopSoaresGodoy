package br.edu.petshop.business;

import java.util.List;

import br.edu.petshop.dao.FactoryDao;
import br.edu.petshop.dao.InterfaceDao;
import br.edu.petshop.entity.Usuario;

public class BusinessUsuario {

	public void salvar (Usuario usuario) throws BusinessException{						
		if (usuario.getNome() == null || usuario.getNome().equals("")){
			throw new
			BusinessException("RN01 - Nome inv�lido");
		}
		
		if (usuario.getNome() == null || usuario.getNome().equals("")){
			throw new
			BusinessException("RN02 - Nome inv�lido");
		}
		
		if (usuario.getEndereco() == null || usuario.getEndereco().equals("")){
			throw new
			BusinessException("RN03 - Endere�o inv�lido");
		}
		
		if (usuario.getTelefone() == null || usuario.getTelefone().equals("")){
			throw new
			BusinessException("RN04 - Telefone inv�lido");
		}
		
		if (usuario.getNome() == null || usuario.getNome().equals("")){
			throw new
			BusinessException("RN05 - Nome inv�lido");
		}
		
		if (usuario.getLogin() == null || usuario.getLogin().equals("")){
			throw new
			BusinessException("RN06 - Login inv�lido.");
		}
		
		if (usuario.getSenha() == null || usuario.getSenha().equals("")){
			throw new
			BusinessException("RN07 - Senha inv�lido.");
		}
		
		if (usuario.getSenha() == null || usuario.getSenha().equals("")){
			throw new
			BusinessException("RN08 - Senha inv�lido.");
		}
		
		if (usuario.getTipoUsuario() == null || usuario.getTipoUsuario() <= 0){
			throw new
			BusinessException("RN09 - Tipo usu�rio inv�lido.");
		}
		
		if (usuario.getCpf() == null || usuario.getCpf().equals("")){
			throw new
			BusinessException("RN10 - CPF inv�lido.");
		}
		
		InterfaceDao<Usuario> usuarioDao = FactoryDao.createUsuarioDao();//new UsuarioDao();
		usuarioDao.salvar(usuario);		
	}

	public List<Usuario> listar(){
		
		InterfaceDao<Usuario> usuarioDao = FactoryDao.createUsuarioDao();
		
		List<Usuario> usuarios = usuarioDao.listar();
		
		return usuarios;
	}
}
