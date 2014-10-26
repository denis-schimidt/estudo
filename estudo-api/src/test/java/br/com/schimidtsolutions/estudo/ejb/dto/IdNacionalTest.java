package br.com.schimidtsolutions.estudo.ejb.dto;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import br.com.schimidtsolutions.estudo.api.dto.Cnpj;
import br.com.schimidtsolutions.estudo.api.dto.Cpf;
import br.com.schimidtsolutions.estudo.api.interfaces.IdNacional;

public class IdNacionalTest {

	@Test
	public void testNumeroCpfFormatado() {
		IdNacional idNacional = new Cpf(486923100L, (short) 0 );
		
		assertThat( idNacional.getIdFormatado(), equalTo( "486.923.100-00" ) );
	}
	
	@Test
	public void testNumeroCpfComoNumero() {
		IdNacional idNacional = new Cpf(486923100L, (short) 0 );
		
		assertThat( idNacional.getIdComoNumero(), equalTo( 48692310000L ) );
	}
	
	@Test
	public void testNumeroCnpjFormatado() {
		IdNacional idNacional = new Cnpj( 61721678L, (short) 1, (byte) 58 );
		
		assertThat( idNacional.getIdFormatado(), equalTo( "61.721.678/0001-58" ) );
	}
	
	@Test
	public void testNumeroCnpjComoNumero() {
		IdNacional idNacional = new Cnpj( 61721678L, (short) 1, (byte) 58 );
		
		assertThat( idNacional.getIdComoNumero(), equalTo( 61721678000158L ) );
	}
}
