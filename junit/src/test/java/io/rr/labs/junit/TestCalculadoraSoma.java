package io.rr.labs.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * 
 * Testa a funcao soma da calculadora
 *
 */
public class TestCalculadoraSoma {
	
	/**
	 * Teste de validacao informando valor1 como null para soma.
	 * 
	 * Resultado esperado IllegalArgumentException, com mensagem informando que valor1 nao foi preenchido
	 * 
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testValor1Null() {
		Calculadora c = new Calculadora();
		
		c.soma(null, 2D);
	}
	
	
	/**
	 * Teste de validacao informando valor2 como null para soma.
	 * 
	 * Resultado esperado IllegalArgumentException, com mensagem informando que valor2 nao foi preenchido
	 * 
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testValor2Null() {
		Calculadora c = new Calculadora();
		
		c.soma(null, 2D);
	}
	
	
	/**
	 * Teste de soma.
	 * 
	 * Resultado esperado 
	 * 
	 */
	@Test
	public void testSoma() {
		Calculadora c = new Calculadora();
		
		Double resultado = c.soma(1D, 1D);
		
		assertNotNull(resultado);
		
		assertEquals(2D, resultado, Double.NaN);
	}

}
