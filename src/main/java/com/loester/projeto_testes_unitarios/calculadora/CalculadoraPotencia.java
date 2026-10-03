package com.loester.projeto_testes_unitarios.calculadora;

public class CalculadoraPotencia {

	public static double potencia(double base, double expoente) {
		return Math.pow(base, expoente);
	}

	public static double quadrado(double numero) {
		return Math.pow(numero, 2);
	}

	public static double cubo(double numero) {
		return Math.pow(numero, 3);
	}

	public static double exponencial(double numero) {
		return Math.exp(numero);
	}

}