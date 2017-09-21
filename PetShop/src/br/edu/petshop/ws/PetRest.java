package br.edu.petshop.ws;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.petshop.business.BusinessException;
import br.edu.petshop.entity.Pet;
import br.edu.petshop.facade.Facade;

@Path("/petrest")
public class PetRest {

	Facade facade = new Facade();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void salvar(Pet pet){
		try{
			facade.cadastrarPet(pet);
		}catch(BusinessException e){
			e.printStackTrace();
		}
		
	}
	
	@POST
	@Path("/excluir")
	@Consumes(MediaType.APPLICATION_JSON)
	public void excluir(Pet pet){
		try{
			facade.excluirPet(pet);
		}catch(BusinessException e){
			e.printStackTrace();
		}
		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Pet> listar(){
		
		return (ArrayList<Pet>) facade.listarPet();
	}
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Pet buscarPorId(@PathParam("id") Long id) {
		return (Pet) facade.buscarPetPorId(id);
	}
}
