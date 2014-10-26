package br.com.schimidtsolutions.estudo.api.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import br.com.schimidtsolutions.estudo.api.validator.MeuNotNullValidator;

@Documented
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=MeuNotNullValidator.class)

public @interface MeuNotNull {
	 String message() default "Erro";
	 Class<?>[] groups() default {};
	 Class<? extends Payload>[] payload() default {};
	 boolean isAtivado() default true;
}
