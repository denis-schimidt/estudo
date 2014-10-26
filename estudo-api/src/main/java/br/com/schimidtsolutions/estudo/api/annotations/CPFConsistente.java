package br.com.schimidtsolutions.estudo.api.annotations;
 
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import br.com.schimidtsolutions.estudo.api.validator.CPFValidator;

@Documented
@Target({CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
@Constraint(validatedBy=CPFValidator.class)

public @interface CPFConsistente {
	 String message() default "{cpf.validation.message}";
	 Class<?>[] groups() default {};
	 Class<? extends Payload>[] payload() default {};
}
