package br.edu.petshop.ws;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.petshop.business.BusinessException;
import br.edu.petshop.entity.Usuario;
import br.edu.petshop.facade.Facade;

@Path("/usuariorest")
public class UsuarioRest {

	Facade facade = new Facade();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void salvar(Usuario usuario) {			
		
		try {
			facade.cadastrarUsuario(usuario);			
		} catch(BusinessException e) {
			e.printStackTrace();
		}
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Usuario> listar() {
		return (ArrayList<Usuario>) facade.listarUsuario();
	}
}
