package br.com.schimidtsolutions.estudo.api.dto;

import br.com.schimidtsolutions.estudo.api.interfaces.IdNacional;


public class Cnpj implements IdNacional {
	private final long base;
	private short ordem;
	private byte digito;

	public Cnpj(final long base, final short ordem, final byte digito) {
		this.base = base;
		this.ordem = ordem;
		this.digito = digito;
	}

	@Override
	public String getIdFormatado() {
		return String.format( "%,d/%04d-%02d", base, ordem, digito );
	}

	@Override
	public Long getIdComoNumero() {
		return Long.valueOf( String.format( "%d%04d%02d", base, ordem, digito ) );
	}
}
