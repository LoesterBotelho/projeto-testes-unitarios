package com.loester.projeto_testes_unitarios;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.loester.projeto_testes_unitarios.calculadora.CalculadoraLogaritmo;

class CalculadoraLogaritmoTest {

	@Test
	void deveCalcularCorretamenteLogaritmoNatural() {

		// Arrange -> Arrumar
		double numero = Math.E;

		// Act -> Agir
		double resultado = CalculadoraLogaritmo.logaritmoNatural(numero);

		// Assert -> Assegurar
		assertThat(resultado)
				.isEqualTo(1);
	}

	@Test
	void deveCalcularCorretamenteLogaritmoBase10() {

		// Arrange -> Arrumar
		double numero = 100;

		// Act -> Agir
		double resultado = CalculadoraLogaritmo.logaritmoBase10(numero);

		// Assert -> Assegurar
		assertThat(resultado)
				.isEqualTo(2);
	}

	@Test
	void deveCalcularCorretamenteLogaritmoBase2() {

		// Arrange -> Arrumar
		double numero = 8;

		// Act -> Agir
		double resultado = CalculadoraLogaritmo.logaritmoBase2(numero);

		// Assert -> Assegurar
		assertThat(resultado)
				.isEqualTo(3);
	}

	@Test
	void deveCalcularCorretamenteLogaritmoComBaseInformada() {

		// Arrange -> Arrumar
		double numero = 100;
		double base = 10;

		// Act -> Agir
		double resultado = CalculadoraLogaritmo.logaritmo(numero, base);

		// Assert -> Assegurar
		assertThat(resultado)
				.isEqualTo(2);
	}

}