package com.loester.projeto_testes_unitarios;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.loester.projeto_testes_unitarios.calculadora.CalculadoraUtil;

class CalculadoraUtilTest {

	@Test
	void deveCalcularCorretamenteValorAbsoluto() {

		// Arrange -> Arrumar
		double numero = -10;

		// Act -> Agir
		double resultado = CalculadoraUtil.absoluto(numero);

		// Assert -> Assegurar
		assertThat(resultado)
				.isEqualTo(10);
	}

	@Test
	void deveRetornarMaiorNumero() {

		// Arrange -> Arrumar
		double num1 = 10;
		double num2 = 20;

		// Act -> Agir
		double resultado = CalculadoraUtil.maior(num1, num2);

		// Assert -> Assegurar
		assertThat(resultado)
				.isEqualTo(20);
	}

	@Test
	void deveRetornarMenorNumero() {

		// Arrange -> Arrumar
		double num1 = 10;
		double num2 = 20;

		// Act -> Agir
		double resultado = CalculadoraUtil.menor(num1, num2);

		// Assert -> Assegurar
		assertThat(resultado)
				.isEqualTo(10);
	}

	@Test
	void deveRetornarSinalPositivo() {

		// Arrange -> Arrumar
		double numero = 10;

		// Act -> Agir
		double resultado = CalculadoraUtil.sinal(numero);

		// Assert -> Assegurar
		assertThat(resultado)
				.isEqualTo(1);
	}

	@Test
	void deveRetornarSinalNegativo() {

		// Arrange -> Arrumar
		double numero = -10;

		// Act -> Agir
		double resultado = CalculadoraUtil.sinal(numero);

		// Assert -> Assegurar
		assertThat(resultado)
				.isEqualTo(-1);
	}

	@Test
	void deveRetornarZeroQuandoNumeroForZero() {

		// Arrange -> Arrumar
		double numero = 0;

		// Act -> Agir
		double resultado = CalculadoraUtil.sinal(numero);

		// Assert -> Assegurar
		assertThat(resultado)
				.isEqualTo(0);
	}

	@Test
	void deveCalcularCorretamenteResto() {

		// Arrange -> Arrumar
		double num1 = 10;
		double num2 = 3;

		// Act -> Agir
		double resultado = CalculadoraUtil.resto(num1, num2);

		// Assert -> Assegurar
		assertThat(resultado)
				.isCloseTo(1, within(0.000001));
	}

	@Test
	void deveRetornarValorDePi() {

		// Act -> Agir
		double resultado = CalculadoraUtil.pi();

		// Assert -> Assegurar
		assertThat(resultado)
				.isEqualTo(Math.PI);
	}

	@Test
	void deveRetornarValorDeE() {

		// Act -> Agir
		double resultado = CalculadoraUtil.e();

		// Assert -> Assegurar
		assertThat(resultado)
				.isEqualTo(Math.E);
	}

	@Test
	void deveIdentificarNumeroFinito() {

		// Arrange -> Arrumar
		double numero = 100;

		// Act -> Agir
		boolean resultado = CalculadoraUtil.numeroFinito(numero);

		// Assert -> Assegurar
		assertThat(resultado)
				.isTrue();
	}

	@Test
	void deveIdentificarNumeroInfinito() {

		// Arrange -> Arrumar
		double numero = Double.POSITIVE_INFINITY;

		// Act -> Agir
		boolean resultado = CalculadoraUtil.infinito(numero);

		// Assert -> Assegurar
		assertThat(resultado)
				.isTrue();
	}

	@Test
	void deveIdentificarNaN() {

		// Arrange -> Arrumar
		double numero = Double.NaN;

		// Act -> Agir
		boolean resultado = CalculadoraUtil.nan(numero);

		// Assert -> Assegurar
		assertThat(resultado)
				.isTrue();
	}

}