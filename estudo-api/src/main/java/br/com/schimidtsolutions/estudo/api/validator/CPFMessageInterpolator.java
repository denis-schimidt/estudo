package br.com.schimidtsolutions.estudo.api.validator;

import java.util.Locale;

import javax.validation.MessageInterpolator;

import org.hibernate.validator.messageinterpolation.ResourceBundleMessageInterpolator;

public class CPFMessageInterpolator implements MessageInterpolator {
	private static final Locale BRASIL = new Locale( "pt", "BR" );
	private MessageInterpolator rb = new ResourceBundleMessageInterpolator();
	
	@Override
	public String interpolate(String messageTemplate, Context context) {
		return interpolate( messageTemplate, context, BRASIL );
	}

	@Override
	public String interpolate(String messageTemplate, Context context, Locale locale) {
		String mensagemRecuperadaBundle = rb.interpolate(messageTemplate, context);
		
		Object[] entrada = (Object[]) context.getValidatedValue();
		
		return String.format( mensagemRecuperadaBundle, entrada[ 0 ], entrada[ 1 ] );
	}
}
