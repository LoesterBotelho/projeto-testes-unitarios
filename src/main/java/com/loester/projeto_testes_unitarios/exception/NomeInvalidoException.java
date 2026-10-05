package com.loester.projeto_testes_unitarios.exception;

public class NomeInvalidoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NomeInvalidoException(String mensagem) {

        super(mensagem);

    }

}