package br.edu.petshop.business;

import br.edu.petshop.dao.FactoryDao;
import br.edu.petshop.dao.InterfaceDao;
import br.edu.petshop.entity.Servico;

public class BusinessServico {

	public void salvar(Servico servico) throws BusinessException{
		if (servico.getNome() == null || servico.getNome().equals("") )
		{
			throw new
			BusinessException("Nome inv�lido.");
		}
		if (servico.getDescricao() == null || servico.getDescricao().equals("") )
		{
			throw new
			BusinessException("Descri��o inv�lida.");
		}
		if (servico.getTempoServico() == null || servico.getTempoServico().equals("") )
		{
			throw new
			BusinessException("Tempo de servi�o inv�lido.");
		}
		if (servico.getValorServico() == null || servico.getValorServico() <0)
		{
			throw new
			BusinessException("Valor de servi�o inv�lido.");
		}
		
		InterfaceDao<Servico> servicoDao = FactoryDao.createServicoDao();
		servicoDao.salvar(servico);
	}
}
