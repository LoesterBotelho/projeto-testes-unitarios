package com.loester.projeto_testes_unitarios;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.loester.projeto_testes_unitarios.calculadora.Comprimento;
import com.loester.projeto_testes_unitarios.exception.NomeInvalidoException;

class ComprimentarTest {

    @Test
    @DisplayName("Deve cumprimentar corretamente quando o nome for válido")
    void deveComprimentarCorretamente() {

        // Arrange
        String nome = "Loester";

        // Act
        var resultado = Comprimento.comprimentar(nome);

        // Assert
        // Atenção: usar apenas AssertJ
        Assertions.assertThat(resultado)
                .isEqualTo("Olá, seja muito bem vindo Loester");
    }

    @Test
    @DisplayName("Deve lançar exceção quando o nome for nulo")
    void deveLancarExceptionQuandoNomeForNulo() {

        // Arrange
        String nome = null;

        // Act e Assert
        // Atenção: usar apenas AssertJ
        Assertions.assertThatThrownBy(() -> Comprimento.comprimentar(nome))
                .isInstanceOf(NomeInvalidoException.class)
                .hasMessage("O nome não pode ser nulo.");
    }
}