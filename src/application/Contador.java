package application;

import java.util.Locale;
import java.util.Scanner;

import exception.ParametrosInvalidosException;

public class Contador {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Digite um número: ");
		int numero1 = sc.nextInt();

		System.out.println("Digite o segundo número: ");
		int numero2 = sc.nextInt();

		try {
			contar(numero1, numero2);
		} catch (ParametrosInvalidosException e) {
			System.out.println();
			System.out.println(e.getMessage());
		}

		sc.close();
	}

	public static void contar(int numero1, int numero2) {
		if (!(numero1 > numero2)) {
			int contador = numero2 - numero1;

			for (int i = 1; i <= contador; i++) {
				System.out.println();
				System.out.println("Imprimindo o número " + i);
			}

		} else {
			throw new ParametrosInvalidosException("O Segundo parâmetro deve ser maior que o primeiro");
		}
	}
}