package com.loester.projeto_testes_unitarios.calculadora;

public class CalculadoraUtil {

	public static double absoluto(double numero) {
		return Math.abs(numero);
	}

	public static double maior(double num1, double num2) {
		return Math.max(num1, num2);
	}

	public static double menor(double num1, double num2) {
		return Math.min(num1, num2);
	}

	public static double sinal(double numero) {
		return Math.signum(numero);
	}

	public static double resto(double num1, double num2) {
		return Math.IEEEremainder(num1, num2);
	}

	public static double aleatorio() {
		return Math.random();
	}

	public static int aleatorio(int minimo, int maximo) {
		return (int) (Math.random() * (maximo - minimo + 1)) + minimo;
	}

	public static double pi() {
		return Math.PI;
	}

	public static double e() {
		return Math.E;
	}

	public static boolean numeroFinito(double numero) {
		return Double.isFinite(numero);
	}

	public static boolean infinito(double numero) {
		return Double.isInfinite(numero);
	}

	public static boolean nan(double numero) {
		return Double.isNaN(numero);
	}

}