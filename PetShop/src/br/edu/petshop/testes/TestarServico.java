package br.edu.petshop.testes;

import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.edu.petshop.business.BusinessException;
import br.edu.petshop.entity.Servico;
import br.edu.petshop.facade.Facade;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestarServico {
	
	Facade facade = new Facade();
	
	@Test
	public void cadastrarServico() {
		
		Servico servico = new Servico();
		servico.setServicoId(null);
		servico.setNome("Escovar os dentes");
		servico.setDescricao("Escovar os dentes do pet com Colgate Luminous White");
		servico.setTempoServico("15 Minutos");
		servico.setValorServico(10.50);
				
		try{
			facade.cadastrarServico(servico);
		}catch (BusinessException e){
			e.printStackTrace();
		}
				
		Assert.assertEquals(true, servico.getServicoId() != null);		
	}
	
	@Test
	public void listarServicos() {
		
		List<Servico> servicos = facade.listarServico();
		
		Assert.assertEquals(true, servicos.size() > 0);
		
	}
}
