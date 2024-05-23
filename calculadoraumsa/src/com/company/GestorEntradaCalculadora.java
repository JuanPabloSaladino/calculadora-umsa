package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GestorEntradaCalculadora {
	private Scanner scanner;

	public GestorEntradaCalculadora() {
		this.scanner = new Scanner(System.in);
	}

	public int obtenerOperacion() {
		while (true) {
			try {
				System.out.println("\nSeleccione la operación a realizar:");
				System.out.println("1. Suma");
				System.out.println("2. Resta");
				System.out.println("3. Multiplicación");
				System.out.println("4. División\n");

				int operacion = scanner.nextInt();

				if (operacion >= 1 && operacion <= 4) {
					return operacion;
				} else {
					System.out.println("\nError: Por favor, ingrese un número de operación válido (1-4).\n");
				}
			} catch (InputMismatchException e) {
				System.out.println("\nError: Por favor, ingrese un número de operación válido.\n");
				scanner.next();
			}
		}
	}

	public double obtenerNumero1() {
		while (true) {
			try {
				System.out.println("\nIngrese el primer número:");
				return scanner.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("\nError: Por favor, ingrese un número válido.\n");
				scanner.next();
			}
		}
	}

	public double obtenerNumero2() {
		while (true) {
			try {
				System.out.println("\nIngrese el segundo número:");
				return scanner.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("\nError: Por favor, ingrese un número válido.");
				scanner.next();
			}
		}
	}
}
