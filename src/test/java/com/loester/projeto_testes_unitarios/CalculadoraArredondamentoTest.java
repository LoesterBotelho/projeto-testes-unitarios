package com.loester.projeto_testes_unitarios;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.loester.projeto_testes_unitarios.calculadora.CalculadoraArredondamento;

class CalculadoraArredondamentoTest {

    @Test
    @DisplayName("Deve arredondar corretamente para cima")
    void deveArredondarCorretamenteParaCima() {

        // Arrange -> Arrumar
        double numero = 10.6;

        // Act -> Agir
        long resultado = CalculadoraArredondamento.arredondar(numero);

        // Assert -> Assegurar
        assertThat(resultado)
                .isEqualTo(11);
    }

    @Test
    @DisplayName("Deve arredondar corretamente para baixo")
    void deveArredondarCorretamenteParaBaixo() {

        // Arrange -> Arrumar
        double numero = 10.4;

        // Act -> Agir
        long resultado = CalculadoraArredondamento.arredondar(numero);

        // Assert -> Assegurar
        assertThat(resultado)
                .isEqualTo(10);
    }

    @Test
    @DisplayName("Deve calcular corretamente o teto")
    void deveCalcularCorretamenteTeto() {

        // Arrange -> Arrumar
        double numero = 10.1;

        // Act -> Agir
        double resultado = CalculadoraArredondamento.teto(numero);

        // Assert -> Assegurar
        assertThat(resultado)
                .isEqualTo(11);
    }

    @Test
    @DisplayName("Deve calcular corretamente o piso")
    void deveCalcularCorretamentePiso() {

        // Arrange -> Arrumar
        double numero = 10.9;

        // Act -> Agir
        double resultado = CalculadoraArredondamento.piso(numero);

        // Assert -> Assegurar
        assertThat(resultado)
                .isEqualTo(10);
    }

    @Test
    @DisplayName("Deve truncar corretamente um número positivo")
    void deveTruncarCorretamenteNumeroPositivo() {

        // Arrange -> Arrumar
        double numero = 10.9;

        // Act -> Agir
        double resultado = CalculadoraArredondamento.truncar(numero);

        // Assert -> Assegurar
        assertThat(resultado)
                .isEqualTo(10);
    }

    @Test
    @DisplayName("Deve truncar corretamente um número negativo")
    void deveTruncarCorretamenteNumeroNegativo() {

        // Arrange -> Arrumar
        double numero = -10.9;

        // Act -> Agir
        double resultado = CalculadoraArredondamento.truncar(numero);

        // Assert -> Assegurar
        assertThat(resultado)
                .isEqualTo(-10);
    }
}