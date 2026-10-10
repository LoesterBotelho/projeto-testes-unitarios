package com.loester.projeto_testes_unitarios;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.loester.projeto_testes_unitarios.calculadora.Calculadora;

// Default: visível somente dentro do mesmo pacote.
// Não precisa declarar a classe e os métodos de teste como public.

class CalculadoraTest {

    // Uma função, um teste, um valor.
    // Arrange, Act e Assert (AAA)

    @Test
    @DisplayName("Deve somar quando os valores forem válidos")
    void deveSomarQuandoValoresForemValidos() {

        // Arrange (Arrumar)
        double num1 = 5;
        double num2 = 2;

        // Act (Agir)
        double resultado = Calculadora.somar(num1, num2);

        // Assert (Assegurar)
        Assertions.assertThat(resultado)
                .isEqualTo(7);
    }

    @Test
    @DisplayName("Deve subtrair quando os valores forem válidos")
    void deveSubtrairQuandoValoresForemValidos() {

        // Arrange
        double num1 = 5;
        double num2 = 1;

        // Act
        double resultado = Calculadora.subtrair(num1, num2);

        // Assert
        Assertions.assertThat(resultado)
                .isEqualTo(4);
    }

    @Test
    @DisplayName("Deve multiplicar quando os valores forem válidos")
    void deveMultiplicarQuandoValoresForemValidos() {

        // Arrange
        double num1 = 5;
        double num2 = 2;

        // Act
        double resultado = Calculadora.multiplicar(num1, num2);

        // Assert
        Assertions.assertThat(resultado)
                .isEqualTo(10);
    }

    @Test
    @DisplayName("Deve dividir quando os valores forem válidos")
    void deveDividirQuandoValoresForemValidos() {

        // Arrange
        double num1 = 10;
        double num2 = 2;

        // Act
        double resultado = Calculadora.dividir(num1, num2);

        // Assert
        Assertions.assertThat(resultado)
                .isEqualTo(5);
    }

    @Test
    @DisplayName("Deve lançar ArithmeticException ao dividir por zero")
    void deveLancarExceptionQuandoDividirPorZero() {

        // Arrange
        double num1 = 10;
        double num2 = 0;

        // Act e Assert
        Assertions.assertThatThrownBy(() -> Calculadora.dividir(num1, num2))
                .isInstanceOf(ArithmeticException.class);
    }

    @Test
    @DisplayName("Deve calcular corretamente o resto da divisão")
    void deveModQuandoValoresForemValidos() {

        // Arrange
        double num1 = 10;
        double num2 = 2;

        // Act
        double resultado = Calculadora.mod(num1, num2);

        // Assert
        // MOD é o resto da divisão: 10 % 2 resulta em 0, e não 5.
        Assertions.assertThat(resultado)
                .isEqualTo(0);
    }
}