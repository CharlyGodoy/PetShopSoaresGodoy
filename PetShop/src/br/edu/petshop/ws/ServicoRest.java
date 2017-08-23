package br.edu.petshop.ws;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.petshop.business.BusinessException;
import br.edu.petshop.entity.Servico;
import br.edu.petshop.facade.Facade;

@Path("/servicorest")
public class ServicoRest {

	Facade facade = new Facade();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void salvar(Servico servico){
		try{
			facade.cadastrarServico(servico);
		}catch(BusinessException e){
			e.printStackTrace();
		}
		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Servico> listar(){
		
		return (ArrayList<Servico>) facade.listarServico();
	}
}
