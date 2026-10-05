package com.loester.projeto_testes_unitarios;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import com.loester.projeto_testes_unitarios.calculadora.Calc;

// fazer todos tests primeiros
class CalcTest {

	@Test
	void somarSimples() {
		
		// Arrange
		double num1 = 5;
		double num2 = 2;

		//Act 
		double resultado = Calc.somar(num1, num2);

		// Assert		
		// atenção usar apenas o : org.assertj
		Assertions.assertThat(resultado).isEqualTo(7);
		
	}
	
}
