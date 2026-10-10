package com.loester.projeto_testes_unitarios;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.loester.projeto_testes_unitarios.calculadora.CalculadoraTrigonometria;

class CalculadoraTrigonometriaTest {

    @Test
    @DisplayName("Deve calcular corretamente o seno de 90 graus")
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
    @DisplayName("Deve calcular corretamente o cosseno de 0 grau")
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
    @DisplayName("Deve calcular corretamente a tangente de 45 graus")
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
    @DisplayName("Deve calcular corretamente o arco seno de 1")
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
    @DisplayName("Deve calcular corretamente o arco cosseno de 1")
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
    @DisplayName("Deve calcular corretamente o arco tangente de 1")
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
    @DisplayName("Deve converter corretamente graus para radianos")
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
    @DisplayName("Deve converter corretamente radianos para graus")
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