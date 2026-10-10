package com.loester.projeto_testes_unitarios;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.loester.projeto_testes_unitarios.calculadora.CalculadoraUtil;

class CalculadoraUtilTest {

    @Test
    @DisplayName("Deve calcular corretamente o valor absoluto")
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
    @DisplayName("Deve retornar o maior número")
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
    @DisplayName("Deve retornar o menor número")
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
    @DisplayName("Deve retornar sinal positivo para número positivo")
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
    @DisplayName("Deve retornar sinal negativo para número negativo")
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
    @DisplayName("Deve retornar zero quando o número for zero")
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
    @DisplayName("Deve calcular corretamente o resto da divisão")
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
    @DisplayName("Deve retornar o valor de PI")
    void deveRetornarValorDePi() {

        // Act -> Agir
        double resultado = CalculadoraUtil.pi();

        // Assert -> Assegurar
        assertThat(resultado)
                .isEqualTo(Math.PI);
    }

    @Test
    @DisplayName("Deve retornar o valor da constante E")
    void deveRetornarValorDeE() {

        // Act -> Agir
        double resultado = CalculadoraUtil.e();

        // Assert -> Assegurar
        assertThat(resultado)
                .isEqualTo(Math.E);
    }

    @Test
    @DisplayName("Deve identificar um número finito")
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
    @DisplayName("Deve identificar um número infinito")
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
    @DisplayName("Deve identificar um valor NaN")
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