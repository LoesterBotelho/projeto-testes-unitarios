package com.loester.projeto_testes_unitarios.calculadora;

public class CalculadoraLogaritmo {

	public static double logaritmoNatural(double numero) {
		return Math.log(numero);
	}

	public static double logaritmoBase10(double numero) {
		return Math.log10(numero);
	}

	public static double logaritmoBase2(double numero) {
		return Math.log(numero) / Math.log(2);
	}

	public static double logaritmo(double numero, double base) {
		return Math.log(numero) / Math.log(base);
	}

}