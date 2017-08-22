package br.edu.petshop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class ItemServico {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long itemServicoId;
	private Servico servico;
	private Pet pet;
	
	public Long getItemServicoId() {
		return itemServicoId;
	}
	public void setItemServicoId(Long itemServicoId) {
		this.itemServicoId = itemServicoId;
	}
	public Servico getServico() {
		return servico;
	}
	public void setServico(Servico servico) {
		this.servico = servico;
	}
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}

	
	
}
