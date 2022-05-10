package modularizacao;

import java.util.Scanner;

public class Exercicio1Atividade4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor para ver seu fatorial: ");
		int numeroFatorial = sc.nextInt();
		int totalFatorial = retornaFatorial(numeroFatorial);
		System.out.println("Resultado Fatorial: " + totalFatorial);

	}

	public static int retornaFatorial(int numero) {

		int decremento = numero;

		for (int i = decremento; i > 1; i--) {

			numero = numero * (i - 1);
		}

		return numero;
	}

}
