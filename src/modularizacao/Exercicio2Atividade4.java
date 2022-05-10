package modularizacao;

import java.util.Scanner;

public class Exercicio2Atividade4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor 1: ");
		int n1 = sc.nextInt();
		System.out.print("Digite o valor 2: ");
		int n2 = sc.nextInt();
		System.out.print("Digite o valor 3: ");
		int n3 = sc.nextInt();

		ordemCrescente(n1, n2, n3);

	}

	public static void ordemCrescente(int valor1, int valor2, int valor3) {

		if (valor1 > valor2 && valor1 > valor3) {
			System.out.println(valor1);
			if (valor2 > valor3) {
				System.out.println(valor2);
				System.out.println(valor3);
			} else {
				System.out.println(valor3);
				System.out.println(valor2);
			}

		} else if (valor2 > valor1 && valor2 > valor3) {
			System.out.println(valor2);
			if (valor1 > valor3) {
				System.out.println(valor1);
				System.out.println(valor3);
			} else {
				System.out.println(valor3);
				System.out.println(valor1);
			}
		} else if (valor3 > valor1 && valor3 > valor2) {
			System.out.println(valor3);
			if (valor2 > valor1) {
				System.out.println(valor2);
				System.out.println(valor1);
			} else {
				System.out.println(valor1);
				System.out.println(valor2);
			}
		}

	}

}
