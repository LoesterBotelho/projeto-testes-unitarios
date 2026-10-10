package com.loester.projeto_testes_unitarios;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.loester.projeto_testes_unitarios.calculadora.CalculadoraPotencia;

class CalculadoraPotenciaTest {

    @Test
    @DisplayName("Deve calcular corretamente a potência")
    void deveCalcularCorretamentePotencia() {

        // Arrange -> Arrumar
        double base = 2;
        double expoente = 3;

        // Act -> Agir
        double resultado = CalculadoraPotencia.potencia(base, expoente);

        // Assert -> Assegurar
        assertThat(resultado)
                .isEqualTo(8);
    }

    @Test
    @DisplayName("Deve calcular corretamente o quadrado de um número")
    void deveCalcularCorretamenteQuadrado() {

        // Arrange -> Arrumar
        double numero = 5;

        // Act -> Agir
        double resultado = CalculadoraPotencia.quadrado(numero);

        // Assert -> Assegurar
        assertThat(resultado)
                .isEqualTo(25);
    }

    @Test
    @DisplayName("Deve calcular corretamente o cubo de um número")
    void deveCalcularCorretamenteCubo() {

        // Arrange -> Arrumar
        double numero = 3;

        // Act -> Agir
        double resultado = CalculadoraPotencia.cubo(numero);

        // Assert -> Assegurar
        assertThat(resultado)
                .isEqualTo(27);
    }

    @Test
    @DisplayName("Deve calcular corretamente a função exponencial")
    void deveCalcularCorretamenteExponencial() {

        // Arrange -> Arrumar
        double numero = 1;

        // Act -> Agir
        double resultado = CalculadoraPotencia.exponencial(numero);

        // Assert -> Assegurar
        assertThat(resultado)
                .isEqualTo(Math.E);
    }
}