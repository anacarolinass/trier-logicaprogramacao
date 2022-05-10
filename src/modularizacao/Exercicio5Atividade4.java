package modularizacao;

import java.util.Scanner;

public class Exercicio5Atividade4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor de A: ");
		int a = sc.nextInt();
		System.out.print("Digite o valor de N: ");
		int n = sc.nextInt();

		int resultado = multiplicaValor(a, n);

		System.out.println(resultado);
	}

	public static int multiplicaValor(int a, int b) {

		int multi = 0;

		for (int i = 1; i < b; i++) {

			multi += a + a;

		}

		return multi;
	}

}
