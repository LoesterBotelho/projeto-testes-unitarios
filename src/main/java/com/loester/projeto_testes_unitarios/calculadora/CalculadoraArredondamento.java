package com.loester.projeto_testes_unitarios.calculadora;

public class CalculadoraArredondamento {

	public static long arredondar(double numero) {
		return Math.round(numero);
	}

	public static double teto(double numero) {
		return Math.ceil(numero);
	}

	public static double piso(double numero) {
		return Math.floor(numero);
	}

	public static double truncar(double numero) {
		if (numero >= 0) {
			return Math.floor(numero);
		}

		return Math.ceil(numero);
	}

}