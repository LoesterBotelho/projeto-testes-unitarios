package com.loester.projeto_testes_unitarios;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.loester.projeto_testes_unitarios.calculadora.Calc;

// Fazer todos os testes primeiro.
class CalcTest {

    @Test
    @DisplayName("Deve somar corretamente quando os valores forem válidos")
    void somarSimples() {

        // Arrange
        double num1 = 5;
        double num2 = 2;

        // Act
        double resultado = Calc.somar(num1, num2);

        // Assert
        // Atenção: usar apenas AssertJ.
        Assertions.assertThat(resultado)
                .isEqualTo(7);
    }
}