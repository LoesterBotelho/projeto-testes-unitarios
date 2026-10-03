package com.loester.projeto_testes_unitarios.calculadora;

public class CalculadoraRaiz {

	public static double raizQuadrada(double numero) {
		return Math.sqrt(numero);
	}

	public static double raizCubica(double numero) {
		return Math.cbrt(numero);
	}

	public static double raiz(double numero, double indice) {
		return Math.pow(numero, 1.0 / indice);
	}

}