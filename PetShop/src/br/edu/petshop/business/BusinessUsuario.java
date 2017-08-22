package br.edu.petshop.business;

import java.util.List;

import br.edu.petshop.dao.FactoryDao;
import br.edu.petshop.dao.InterfaceDao;
import br.edu.petshop.entity.Usuario;

public class BusinessUsuario {

	public void salvar (Usuario usuario) throws BusinessException{						
		if (usuario.getNome() == null || usuario.getNome().equals("")){
			throw new
			BusinessException("RN01 - Nome inválido");
		}
		
		if (usuario.getNome() == null || usuario.getNome().equals("")){
			throw new
			BusinessException("RN02 - Nome inválido");
		}
		
		if (usuario.getEndereco() == null || usuario.getEndereco().equals("")){
			throw new
			BusinessException("RN03 - Endereço inválido");
		}
		
		if (usuario.getTelefone() == null || usuario.getTelefone().equals("")){
			throw new
			BusinessException("RN04 - Telefone inválido");
		}
		
		if (usuario.getNome() == null || usuario.getNome().equals("")){
			throw new
			BusinessException("RN05 - Nome inválido");
		}
		
		if (usuario.getLogin() == null || usuario.getLogin().equals("")){
			throw new
			BusinessException("RN06 - Login inválido.");
		}
		
		if (usuario.getSenha() == null || usuario.getSenha().equals("")){
			throw new
			BusinessException("RN07 - Senha inválido.");
		}
		
		if (usuario.getSenha() == null || usuario.getSenha().equals("")){
			throw new
			BusinessException("RN08 - Senha inválido.");
		}
		
		if (usuario.getTipoUsuario() == null || usuario.getTipoUsuario() <= 0){
			throw new
			BusinessException("RN09 - Tipo usuário inválido.");
		}
		
		if (usuario.getCpf() == null || usuario.getCpf().equals("")){
			throw new
			BusinessException("RN10 - CPF inválido.");
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
