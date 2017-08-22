package br.edu.petshop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long produtoId;
	private String nome;
	private String descricao;
	private Long estoqueProduto;
	private Double valorProduto;
	
	public Long getProdutoId() {
		return produtoId;
	}
	public void setProdutoId(Long produtoId) {
		this.produtoId = produtoId;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Long getEstoqueProduto() {
		return estoqueProduto;
	}
	public void setEstoqueProduto(Long estoqueProduto) {
		this.estoqueProduto = estoqueProduto;
	}
	public Double getValorProduto() {
		return valorProduto;
	}
	public void setValorProduto(Double valorProduto) {
		this.valorProduto = valorProduto;
	}
	
}
