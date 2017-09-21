package br.edu.petshop.testes;

import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.edu.petshop.business.BusinessException;
import br.edu.petshop.entity.Usuario;
import br.edu.petshop.facade.Facade;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestarUsuario {

	Facade facade = new Facade();
	
	@Test
	public void cadastrarUsuario() {		
		
		Usuario usuario = new Usuario();
		usuario.setUsuarioId(null);
		usuario.setNome("Fulano");
		usuario.setEndereco("Rua Pedro Aleixo, 590");
		usuario.setTelefone("41998366259");
		usuario.setLogin("bugigaigas");
		usuario.setSenha("1234");
		usuario.setCpf("10301175698");
		usuario.setTipoUsuario(1);			
		
		try{
			facade.cadastrarUsuario(usuario);
		}catch (BusinessException e){
			e.printStackTrace();
		}		
		
		Assert.assertEquals(true, usuario.getUsuarioId() != null);		
	}
	
	@Test
	public void listarUsuarios() {
			
		List<Usuario> usuarios = facade.listarUsuario();
		
		Assert.assertEquals(true, usuarios.size() > 0);	
	}
	
	@Test
	public void excluirUsuario(Usuario usuario) {
		
		try {
			facade.excluirUsuario(usuario);
		} catch(BusinessException e) {
			e.printStackTrace();
		}
	}
}