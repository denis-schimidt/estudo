package br.com.schimidtsolutions.estudo.ejb.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraintvalidation.SupportedValidationTarget;
import javax.validation.constraintvalidation.ValidationTarget;

import br.com.schimidtsolutions.estudo.ejb.annotations.CPFConsistente;

@SupportedValidationTarget(value = ValidationTarget.PARAMETERS)
public class CPFValidator implements ConstraintValidator<CPFConsistente, Object[]>{

	@Override
	public void initialize(CPFConsistente annotation) {
		System.out.println( "Entrou aqui..." );
	}

	@Override
	public boolean isValid(Object[] objects, ConstraintValidatorContext context) {
	    boolean result = false;
	    
	    if (result) {
	        return true;
	    }

	    String msgDefault = context.getDefaultConstraintMessageTemplate();
	    String msgFormatada = String.format(msgDefault, "Erro");

	    context.disableDefaultConstraintViolation();
	    context.buildConstraintViolationWithTemplate(msgFormatada).addConstraintViolation();
	    
	    return false;
	}
}
