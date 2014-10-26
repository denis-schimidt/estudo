package br.com.schimidtsolutions.estudo.ejb.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import br.com.schimidtsolutions.estudo.ejb.annotations.MeuNotNull;

public class MeuNotNullValidator implements ConstraintValidator<MeuNotNull, Object> {
	private boolean ativado;
	
	@Override
	public void initialize(MeuNotNull annotation) {
		ativado = annotation.isAtivado();
	}

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		
		if( ativado ){
			return value!= null;
		}
		
		return true;
	}
}
