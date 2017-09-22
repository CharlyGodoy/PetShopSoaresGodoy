package br.edu.petshop.business;

import java.util.List;

import br.edu.petshop.dao.FactoryDao;
import br.edu.petshop.dao.InterfaceDao;
import br.edu.petshop.entity.Produto;

public class BusinessProduto {
	
	public void salvar(Produto produto) throws BusinessException {
		if (produto.getNome() == null || produto.getNome().equals("")) {
			throw new BusinessException("RN01 - Nome inválido.");
		}
		
		if (produto.getDescricao() == null || produto.getDescricao().equals("")) {
			throw new BusinessException("RN02 - Descrição inválida.");
		}
		
		if (produto.getEstoqueProduto() == null || produto.getEstoqueProduto() < 0) {
			throw new BusinessException("RN03 - Estoque de produto inválido");
		}
		
		if (produto.getValorProduto() == null || produto.getValorProduto() < 0) {
			throw new BusinessException("RN04 - Valor do produto inválido");
		}
		
		InterfaceDao<Produto> produtoDao = FactoryDao.createProdutoDao();
		produtoDao.salvar(produto);		
	}

	public List<Produto> listar(){
		
		InterfaceDao<Produto> produtoDao = FactoryDao.createProdutoDao();
		
		List<Produto> produtos = produtoDao.listar();
		
		return produtos;
	}

	public void excluir(Produto produto) throws BusinessException{
		if (produto.getProdutoId() == null || produto.getProdutoId().equals("")){
			throw new
			BusinessException("RN01 - ID inválido");
		}
		
		InterfaceDao<Produto> produtoDao = FactoryDao.createProdutoDao();//new UsuarioDao();
		produtoDao.Excluir(produto);
	}

	public Produto buscarPorId(Long id) {
		InterfaceDao<Produto> produtoDao = FactoryDao.createProdutoDao();
		
		Produto produto = produtoDao.BuscarPorId(id);
		return produto;
	}
}
