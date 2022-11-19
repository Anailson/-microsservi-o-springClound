package br.com.alura.microservice.loja.controller.dto;

import java.util.List;

public class compraDTO {
	
	private List<ItemDaCOmpraDTO> itens;
	
	private EnderecoDTO endereco;

	public List<ItemDaCOmpraDTO> getItens() {
		return itens;
	}

	public void setItens(List<ItemDaCOmpraDTO> itens) {
		this.itens = itens;
	}

	public EnderecoDTO getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}
	
	

}
