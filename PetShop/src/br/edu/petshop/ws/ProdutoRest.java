package br.edu.petshop.ws;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import br.edu.petshop.business.BusinessException;
import br.edu.petshop.entity.Produto;
import br.edu.petshop.facade.Facade;

@Path("/produtorest")
public class ProdutoRest {

	Facade facade = new Facade();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void salvar(Produto produto){
		try{
			facade.cadastrarProduto(produto);
		}catch(BusinessException e){
			e.printStackTrace();
		}
	}
	
	@POST
	@Path("/excluir")
	@Consumes(MediaType.APPLICATION_JSON)
	public void excluir(@QueryParam("id") Long id){
		Produto produto;
		produto = facade.buscarProdutoPorId(id);
		try{
			facade.excluirProduto(produto);
		}catch(BusinessException e){
			e.printStackTrace();
		}
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Produto> listar(){
		
		return (ArrayList<Produto>) facade.listarProduto();
	}
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Produto buscarPorId(@PathParam("id") Long id) {
		return (Produto) facade.buscarProdutoPorId(id);
	}
}
