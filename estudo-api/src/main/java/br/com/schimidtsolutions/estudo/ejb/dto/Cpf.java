package br.com.schimidtsolutions.estudo.ejb.dto;

import br.com.schimidtsolutions.estudo.ejb.annotations.MeuNotNull;
import br.com.schimidtsolutions.estudo.ejb.interfaces.IdNacional;

public class Cpf implements IdNacional {
	private Long base;
	private Short digito;

	
	public Cpf( @MeuNotNull final Long base, final Short digito) {
		this.base = base;
		this.digito = digito;
	}

	@Override
	public String getIdFormatado() {
		return String.format( "%,d-%02d", base, digito );
	}

	@Override
	public Long getIdComoNumero() {
		return Long.valueOf( String.format( "%d%02d", base, digito ) );
	}

	public long getBase() {
		return base;
	}

	public Short getDigito() {
		return digito;
	}
}
