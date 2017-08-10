package br.edu.petshop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FormaPagamento {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long formaPagamentoId;
	private String nome;
	
	public Long getFormaPagamentoId() {
		return formaPagamentoId;
	}
	public void setFormaPagamentoId(Long formaPagamentoId) {
		this.formaPagamentoId = formaPagamentoId;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
