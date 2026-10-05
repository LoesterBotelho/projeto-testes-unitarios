package com.loester.projeto_testes_unitarios.calculadora;

import com.loester.projeto_testes_unitarios.exception.NomeInvalidoException;

public class Comprimento {

    public static String comprimentar(String nome) {

        if (nome == null) {

            throw new NomeInvalidoException("O nome não pode ser nulo.");

        }

        if (nome.isBlank()) {

            throw new NomeInvalidoException("O nome não pode ser vazio.");

        }

        return "Olá, seja muito bem vindo " + nome;

    }

}