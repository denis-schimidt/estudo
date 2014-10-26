package br.com.schimidtsolutions.estudo.ejb.dto;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.executable.ExecutableValidator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CpfConsistenteTest {
	private static ValidatorFactory vf;
	private static Validator validator;

	@BeforeClass
	public static void init() {
		vf = Validation.buildDefaultValidatorFactory();
		validator = vf.getValidator();
	}
 
	
	@AfterClass
	public static void close() {
		vf.close();
	}
	
	@Test
	public void testCpfPeloConstrutorInvalido() throws NoSuchMethodException, SecurityException {
		Constructor<Cpf> constructor = Cpf.class.getConstructor( Long.class, Short.class );
		ExecutableValidator methodValidator = validator.forExecutables();
		Set<ConstraintViolation<Cpf>> violations = methodValidator.validateConstructorParameters(constructor, new Object[]{null,null});
		assertEquals(1, violations.size());
	}
}
