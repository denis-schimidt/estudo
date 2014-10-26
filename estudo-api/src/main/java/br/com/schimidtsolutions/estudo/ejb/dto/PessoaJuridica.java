package br.com.schimidtsolutions.estudo.ejb.dto;

import java.time.LocalDate;

import br.com.schimidtsolutions.estudo.ejb.constants.TipoTributacao;
import br.com.schimidtsolutions.estudo.ejb.interfaces.IdNacional;

public class PessoaJuridica extends Pessoa {
	private final String razaoSocial;
	private final LocalDate dataFundacao;
	private final TipoTributacao tipoTributacao;

	private PessoaJuridica( Builder builder ) {
		super( builder.idNacional);
		
		this.tipoTributacao = builder.tipoTributacao;
		this.razaoSocial = builder.razaoSocial;
		this.dataFundacao = builder.dataFundacao;
	}
	
	public TipoTributacao getTipoTributacao() {
		return tipoTributacao;
	}
	
	@Override
	public String toString() {
		return String.format("PessoaJuridica [idNacional(CNPJ)=%s, razaoSocial=%s, dataFundacao=%s, tipoTributacao=%s]",
			getIdNacional().getIdFormatado(), razaoSocial, dataFundacao, tipoTributacao);
	}

	public static class Builder{
		private String razaoSocial;
		private LocalDate dataFundacao;
		private TipoTributacao tipoTributacao;
		private IdNacional idNacional;
		
		public Builder cnpj( IdNacional idNacional ){
			this.idNacional = idNacional;
			
			return this;
		}
		
		public Builder comRazaoSocial( String razaoSocial ){
			this.razaoSocial = razaoSocial;
			
			return this;
		}
		
		public Builder fundadoEm( LocalDate dataFundacao ){
			this.dataFundacao = dataFundacao;
			
			return this;
		}
		
		public Builder tributadoComo( TipoTributacao tipoTributacao ){
			this.tipoTributacao = tipoTributacao;
			
			return this;
		}
		
		public PessoaJuridica newInstance(){
			return new PessoaJuridica( this );
		}
	}
}
