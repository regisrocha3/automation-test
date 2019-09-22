package io.rr.labs.junit;

/**
 * Calculadora
 * 
 * @author regis
 *
 */
public class Calculadora {
	
	/**
	 * Realiza a soma de dois valores
	 * 
	 * @param valor1 - double
	 * @param valor2 - double
	 * 
	 * @return resultado da soma
	 */
	public Double soma(final Double valor1, final Double valor2) {
		if (valor1 == null) {
			throw new IllegalArgumentException("Valor1 para realizar a soma nao foi informado");
		}
		
		if (valor2 == null) {
			throw new IllegalArgumentException("Valor2 para realizar a soma nao foi informado");
		}
		
		return valor1 + valor2;
	}
	
	/**
	 * Realiza a subtracao de dois valores
	 * 
	 * @param valor1 - double
	 * @param valor2 - double
	 * 
	 * @return resultado da subtracao
	 */
	public Double subtrai(final Double valor1, final Double valor2) {
		if (valor1 == null) {
			throw new IllegalArgumentException("Valor1 para realizar a subtracao nao foi informado");
		}
		
		if (valor2 == null) {
			throw new IllegalArgumentException("Valor2 para realizar a subtracao nao foi informado");
		}
		
		return valor1 - valor2;
	}
	
	
	/**
	 * Realiza a divisao de dois valores
	 * 
	 * @param valor1 - double
	 * @param valor2 - double
	 * 
	 * @return resultado da divisao
	 */
	public Double divide(final Double valor1, final Double valor2) {
		if (valor1 == null) {
			throw new IllegalArgumentException("Valor1 para realizar a divisao nao foi informado");
		}
		
		if (valor2 == null) {
			throw new IllegalArgumentException("Valor2 para realizar a divisao nao foi informado");
		}
		
		if (valor2.equals(0D)) {
			throw new IllegalArgumentException("Valor2 nao pode ser 0");
		}
		
		return valor1 / valor2;
	}
	
	/**
	 * Realiza a multiplicacao de dois valores
	 * 
	 * @param valor1 - double
	 * @param valor2 - double
	 * 
	 * @return resultado da multiplicacao
	 */
	public Double multiplica(final Double valor1, final Double valor2) {
		if (valor1 == null) {
			throw new IllegalArgumentException("Valor1 para realizar a multiplicacao nao foi informado");
		}
		
		if (valor2 == null) {
			throw new IllegalArgumentException("Valor2 para realizar a multiplicacao nao foi informado");
		}
		
		return valor1 * valor2;
	}
}
