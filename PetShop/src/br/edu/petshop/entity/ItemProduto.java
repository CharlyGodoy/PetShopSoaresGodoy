package br.edu.petshop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItemProduto {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long itemProdutoId;
	private Long quantidadeProduto;
	private Produto produto;
	public Long getItemProdutoId() {
		return itemProdutoId;
	}
	public void setItemProdutoId(Long itemProdutoId) {
		this.itemProdutoId = itemProdutoId;
	}
	public Long getQuantidadeProduto() {
		return quantidadeProduto;
	}
	public void setQuantidadeProduto(Long quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
}
