package br.com.schimidtsolutions.estudo.api.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.ConstraintValidatorContext.ConstraintViolationBuilder;
import javax.validation.constraintvalidation.SupportedValidationTarget;
import javax.validation.constraintvalidation.ValidationTarget;

import br.com.schimidtsolutions.estudo.api.annotations.CPFConsistente;

@SupportedValidationTarget(value = ValidationTarget.PARAMETERS)
public class CPFValidator implements ConstraintValidator<CPFConsistente, Object[]>{

	@Override
	public void initialize(CPFConsistente annotation) {
		System.out.println( "Inicializando CPFValidator..." );
	}

	@Override
	public boolean isValid(Object[] objects, ConstraintValidatorContext context) {
	    boolean result = false;
	    
	    if (result) {
	        return true;
	    }
	    
	    context.disableDefaultConstraintViolation();
	    ConstraintViolationBuilder buildConstraint = 
	    		context.buildConstraintViolationWithTemplate( context.getDefaultConstraintMessageTemplate() );
	    
	    buildConstraint.addConstraintViolation();
	    
	    return false;
	}
}
