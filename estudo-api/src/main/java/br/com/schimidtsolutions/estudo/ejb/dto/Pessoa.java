package br.com.schimidtsolutions.estudo.ejb.dto;

import br.com.schimidtsolutions.estudo.ejb.interfaces.IdNacional;

public abstract class Pessoa {
	private final IdNacional idNacional;
	
	Pessoa(IdNacional idNacional) {
		this.idNacional = idNacional;
	}
	
	public IdNacional getIdNacional() {
		return idNacional;
	}
}
