package com.company;

public class Calculadora {
	public Calculadora() {
	}

	public void ejecutarOperacion(int operacion, double numero1, double numero2) {
		double resultado = 0;

		switch (operacion) {
			case 1:
				resultado = numero1 + numero2;
				break;
			case 2:
				resultado = numero1 - numero2;
				break;
			case 3:
				resultado = numero1 * numero2;
				break;
			case 4:
				if (numero1 != 0) {
					resultado = numero1 / numero2;
				}

				if (numero2 == 0) {
					System.out.println("\nError: No se puede dividir por cero.");
					return;
				}

				break;
			default:
				System.out.println("\nError: Operación no válida.");

				return;
		}

		System.out.println("\nEl resultado es: " + resultado);
	}
}
