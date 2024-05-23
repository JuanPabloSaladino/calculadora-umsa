package com.company;

public class Main {

	public static void main(String[] args) {
		GestorEntradaCalculadora gestorEntradaCalculadora = new GestorEntradaCalculadora();

		int operacion = gestorEntradaCalculadora.obtenerOperacion();
		double numero1 = gestorEntradaCalculadora.obtenerNumero1();
		double numero2 = gestorEntradaCalculadora.obtenerNumero2();

		Calculadora calculadora = new Calculadora();

		calculadora.ejecutarOperacion(operacion, numero1, numero2);
	}
}
