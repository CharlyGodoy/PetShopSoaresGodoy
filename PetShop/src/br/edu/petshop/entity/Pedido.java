package br.edu.petshop.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long pedidoIdId;
	private Date dataPedido;
	
	@Transient
	private FormaPagamento formaPagamento;
	
	@Transient
	private Usuario usuario;
	
	@Transient
	private List<ItemProduto> itensProduto;
	
	@Transient
	private List<ItemServico> itensServico;
	
	public Long getPedidoIdId() {
		return pedidoIdId;
	}
	public void setPedidoIdId(Long pedidoIdId) {
		this.pedidoIdId = pedidoIdId;
	}
	public Date getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public List<ItemProduto> getItensProduto() {
		return itensProduto;
	}
	public void setItensProduto(List<ItemProduto> itensProduto) {
		this.itensProduto = itensProduto;
	}
	public List<ItemServico> getItensServico() {
		return itensServico;
	}
	public void setItensServico(List<ItemServico> itensServico) {
		this.itensServico = itensServico;
	}
	
	
}
