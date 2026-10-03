package com.loester.projeto_testes_unitarios;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.loester.projeto_testes_unitarios.calculadora.CalculadoraRaiz;

class CalculadoraRaizTest {

	@Test
	void deveCalcularCorretamenteRaizQuadrada() {

		// Arrange -> Arrumar
		double numero = 25;

		// Act -> Agir
		double resultado = CalculadoraRaiz.raizQuadrada(numero);

		// Assert -> Assegurar
		assertThat(resultado)
				.isEqualTo(5);
	}

	@Test
	void deveCalcularCorretamenteRaizCubica() {

		// Arrange -> Arrumar
		double numero = 27;

		// Act -> Agir
		double resultado = CalculadoraRaiz.raizCubica(numero);

		// Assert -> Assegurar
		assertThat(resultado)
				.isEqualTo(3);
	}

	@Test
	void deveCalcularCorretamenteRaiz() {

		// Arrange -> Arrumar
		double numero = 16;
		double indice = 4;

		// Act -> Agir
		double resultado = CalculadoraRaiz.raiz(numero, indice);

		// Assert -> Assegurar
		assertThat(resultado)
				.isEqualTo(2);
	}

}