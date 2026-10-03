package com.loester.projeto_testes_unitarios;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.loester.projeto_testes_unitarios.calculadora.CalculadoraGeometria;

class CalculadoraGeometriaTest {

	@Test
	void deveCalcularCorretamenteHipotenusa() {

		// Arrange -> Arrumar
		double cateto1 = 3;
		double cateto2 = 4;

		// Act -> Agir
		double resultado = CalculadoraGeometria.hipotenusa(cateto1, cateto2);

		// Assert -> Assegurar
		assertThat(resultado)
				.isEqualTo(5);
	}

	@Test
	void deveCalcularCorretamenteDistanciaEntreDoisPontos() {

		// Arrange -> Arrumar
		double x1 = 0;
		double y1 = 0;

		double x2 = 3;
		double y2 = 4;

		// Act -> Agir
		double resultado = CalculadoraGeometria.distancia(
				x1,
				y1,
				x2,
				y2);

		// Assert -> Assegurar
		assertThat(resultado)
				.isEqualTo(5);
	}

}