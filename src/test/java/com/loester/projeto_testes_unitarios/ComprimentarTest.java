package com.loester.projeto_testes_unitarios;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import com.loester.projeto_testes_unitarios.calculadora.Comprimento;

class ComprimentarTest {

	@Test
	void deveComprimentarCorretamente() {
		
		// Arrange
		String nome = "Loester";
		
		// Act
		var resultado = Comprimento.comprimentar(nome);
		
		
		// Assert
		// atenção usar apenas o : org.assertj	
		Assertions.assertThat(resultado)
		.isEqualTo("Olá, seja muito bem vindo Loester");
		
		// Implementar validação se for nullo e vazio
		// pendente aqui
	}
}
