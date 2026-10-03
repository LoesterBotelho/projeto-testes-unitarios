package com.loester.projeto_testes_unitarios;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import com.loester.projeto_testes_unitarios.calculadora.Calculadora;

// default visto somente no mesmo pacote boa pratica
// não precisa ser public  a class e metodos 
// igual no "@RestControllerAdvice" no "GlobalExceptionHandler"

class CalculadoraTest {

// uma função , um teste, um valor
	
//	Arrange , act e asserts (AAA)

//	Arrange (Arrumar)

//	act (Agir)

//	Assert (Assegurar)


	@Test
	void deveSomarQuandoValoresForemValidos() {

	// Arrange
	double num1 = 5;
	double num2 = 2;

	//Act 
	double resultado = Calculadora.somar(num1, num2);

	// Assert
	
	// atenção usar apenas o : org.assertj
	Assertions.assertThat(resultado).isEqualTo(7);

	}	
	
	@Test
	void deveSubtrairQuandoValoresForemValidos() {

	// Arrange
	double num1 = 5;
	double num2 = 1;

	//Act 
	double resultado = Calculadora.subtrair(num1, num2);

	// Assert
	// atenção usar apenas o : org.assertj	
	Assertions.assertThat(resultado).isEqualTo(4);

	}	
	
	@Test
	void deveMultiplicarQuandoValoresForemValidos() {

	// Arrange
	double num1 = 5;
	double num2 = 2;

	//Act 
	double resultado = Calculadora.multiplicar(num1, num2);

	// Assert
	// atenção usar apenas o : org.assertj	
	Assertions.assertThat(resultado).isEqualTo(10);

	}	
	
	@Test
	void deveDividirQuandoValoresForemValidos() {

	// Arrange
	double num1 = 10;
	double num2 = 2;

	//Act 
	double resultado = Calculadora.dividir(num1, num2);

	// Assert
	// atenção usar apenas o : org.assertj	
	Assertions.assertThat(resultado).isEqualTo(5);

	}	
	
	@Test
	void deveModQuandoValoresForemValidos() {

	    // Arrange
	    double num1 = 10;
	    double num2 = 2;

	    // Act
	    double resultado = Calculadora.mod(num1, num2);
	    // MOD é resto da divisão, então 10 % 2 resulta em 0, e não 5
	    
	    
		// Assert
		// atenção usar apenas o : org.assertj	
	    Assertions.assertThat(resultado).isEqualTo(0);
	}
	

	// Implementar validação divisão por 0
	// pendente aqui
	
}

