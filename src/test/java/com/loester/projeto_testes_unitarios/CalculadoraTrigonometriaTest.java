package com.loester.projeto_testes_unitarios;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.loester.projeto_testes_unitarios.calculadora.CalculadoraTrigonometria;

class CalculadoraTrigonometriaTest {

	@Test
	void deveCalcularCorretamenteSeno() {

		// Arrange -> Arrumar
		double angulo = Math.toRadians(90);

		// Act -> Agir
		double resultado = CalculadoraTrigonometria.seno(angulo);

		// Assert -> Assegurar
		assertThat(resultado)
				.isCloseTo(1, within(0.000001));
	}

	@Test
	void deveCalcularCorretamenteCosseno() {

		// Arrange -> Arrumar
		double angulo = Math.toRadians(0);

		// Act -> Agir
		double resultado = CalculadoraTrigonometria.cosseno(angulo);

		// Assert -> Assegurar
		assertThat(resultado)
				.isCloseTo(1, within(0.000001));
	}

	@Test
	void deveCalcularCorretamenteTangente() {

		// Arrange -> Arrumar
		double angulo = Math.toRadians(45);

		// Act -> Agir
		double resultado = CalculadoraTrigonometria.tangente(angulo);

		// Assert -> Assegurar
		assertThat(resultado)
				.isCloseTo(1, within(0.000001));
	}

	@Test
	void deveCalcularCorretamenteArcoSeno() {

		// Arrange -> Arrumar
		double numero = 1;

		// Act -> Agir
		double resultado = CalculadoraTrigonometria.arcoSeno(numero);

		// Assert -> Assegurar
		assertThat(resultado)
				.isCloseTo(Math.PI / 2, within(0.000001));
	}

	@Test
	void deveCalcularCorretamenteArcoCosseno() {

		// Arrange -> Arrumar
		double numero = 1;

		// Act -> Agir
		double resultado = CalculadoraTrigonometria.arcoCosseno(numero);

		// Assert -> Assegurar
		assertThat(resultado)
				.isCloseTo(0, within(0.000001));
	}

	@Test
	void deveCalcularCorretamenteArcoTangente() {

		// Arrange -> Arrumar
		double numero = 1;

		// Act -> Agir
		double resultado = CalculadoraTrigonometria.arcoTangente(numero);

		// Assert -> Assegurar
		assertThat(resultado)
				.isCloseTo(Math.PI / 4, within(0.000001));
	}

	@Test
	void deveConverterCorretamenteGrausParaRadianos() {

		// Arrange -> Arrumar
		double graus = 180;

		// Act -> Agir
		double resultado = CalculadoraTrigonometria.grausParaRadianos(graus);

		// Assert -> Assegurar
		assertThat(resultado)
				.isCloseTo(Math.PI, within(0.000001));
	}

	@Test
	void deveConverterCorretamenteRadianosParaGraus() {

		// Arrange -> Arrumar
		double radianos = Math.PI;

		// Act -> Agir
		double resultado = CalculadoraTrigonometria.radianosParaGraus(radianos);

		// Assert -> Assegurar
		assertThat(resultado)
				.isCloseTo(180, within(0.000001));
	}

}