package br.com.schimidtsolutions.estudo.api.dto;

import java.time.LocalDate;

import br.com.schimidtsolutions.estudo.api.interfaces.IdNacional;

public class PessoaFisica extends Pessoa {
	private final String nome;
	private final LocalDate dataNascimento;
	private double peso;
	private double altura;

	private PessoaFisica( Builder builder ) {
		super( builder.idNacional );
		
		this.nome = builder.nome;
		this.dataNascimento = builder.dataNascimento;
		this.peso = builder.peso;
		this.altura = builder.altura;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return String.format("PessoaFisica [idNacional(CPF)=%s, nome=%s, dataNascimento=%3$dd/3$dm/3$dY, peso=%.2fKg, altura=%.2fm]",
			getIdNacional().getIdFormatado(), getNome(), getDataNascimento(), peso, altura);
	}

	public static class Builder{
		private IdNacional idNacional;
		private String nome;
		private LocalDate dataNascimento;
		private double peso;
		private double altura;
		
		public Builder comId( IdNacional idNacional ){
			this.idNacional = idNacional;
			
			return this;
		}
		
		public Builder comNome( String nome ){
			this.nome = nome;
			
			return this;
		}
		
		public Builder nascidoEm( LocalDate dataNascimento ){
			this.dataNascimento = dataNascimento;
			
			return this;
		}
		
		public Builder pesando( double peso ){
			this.peso = peso;
			
			return this;
		}
		
		public Builder medindo( double altura ){
			this.altura = altura;
			
			return this;
		}
		
		public PessoaFisica newInstance(){
			return new PessoaFisica( this );
		}
	}
}
