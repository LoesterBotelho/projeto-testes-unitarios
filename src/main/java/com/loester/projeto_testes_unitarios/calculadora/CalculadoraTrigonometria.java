package com.loester.projeto_testes_unitarios.calculadora;

public class CalculadoraTrigonometria {

	public static double seno(double angulo) {
		return Math.sin(angulo);
	}

	public static double cosseno(double angulo) {
		return Math.cos(angulo);
	}

	public static double tangente(double angulo) {
		return Math.tan(angulo);
	}

	public static double arcoSeno(double numero) {
		return Math.asin(numero);
	}

	public static double arcoCosseno(double numero) {
		return Math.acos(numero);
	}

	public static double arcoTangente(double numero) {
		return Math.atan(numero);
	}

	public static double grausParaRadianos(double graus) {
		return Math.toRadians(graus);
	}

	public static double radianosParaGraus(double radianos) {
		return Math.toDegrees(radianos);
	}

}