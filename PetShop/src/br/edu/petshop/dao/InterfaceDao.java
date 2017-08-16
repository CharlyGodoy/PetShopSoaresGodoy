package br.edu.petshop.dao;

import java.util.List;

public interface InterfaceDao<T> {

	public void salvar(T t);
	
	public List<T> listar();
	
	public void Editar(T t);
	
	public void Excluir(T t);
}
