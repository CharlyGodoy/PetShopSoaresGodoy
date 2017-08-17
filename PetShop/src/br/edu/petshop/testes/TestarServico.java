package br.edu.petshop.testes;

import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.edu.petshop.business.BusinessException;
import br.edu.petshop.business.BusinessServico;
import br.edu.petshop.dao.FactoryDao;
import br.edu.petshop.dao.InterfaceDao;
import br.edu.petshop.entity.Pet;
import br.edu.petshop.entity.Servico;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestarServico {
	
	private Long servicoId;
	private String nome;
	private String descricao;
	private String tempoServico;
	private Double valorServico;
	
	@Test
	public void cadastrarServico() {
		
		Servico servico = new Servico();
		servico.setServicoId(null);
		servico.setNome("Escovar os dentes");
		servico.setDescricao("Escovar os dentes do pet com Colgate Luminous White");
		servico.setTempoServico("15 Minutos");
		servico.setValorServico(10.50);
		
		BusinessServico businessServico = new BusinessServico();
		
		try{
			businessServico.salvar(servico);
		}catch (BusinessException e){
			e.printStackTrace();
		}
		
		
		Assert.assertEquals(true, servico.getServicoId() != null);
		
	}
	
	@Test
	public void listarServicos() {
		
		InterfaceDao<Servico> servicoDao = FactoryDao.createServicoDao();
		
		List<Servico> servicos = servicoDao.listar();
		
		Assert.assertEquals(true, servicos.size() > 0);
		
	}
}
