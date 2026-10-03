package com.loester.projeto_testes_unitarios.calculadora;

public class CalculadoraGeometria {

	public static double hipotenusa(double cateto1, double cateto2) {
		return Math.hypot(cateto1, cateto2);
	}

	public static double distancia(
			double x1,
			double y1,
			double x2,
			double y2) {

		double deltaX = x2 - x1;
		double deltaY = y2 - y1;

		return Math.hypot(deltaX, deltaY);
	}

}