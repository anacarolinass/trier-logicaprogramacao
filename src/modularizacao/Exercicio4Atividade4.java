package modularizacao;

import java.util.Scanner;

public class Exercicio4Atividade4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro valor para multiplicar: ");
		int valor1 = sc.nextInt();
		System.out.print("Digite o segundo valor que sera multiplicado: ");
		int valor2 = sc.nextInt();

		int resultado = multiplicador(valor1, valor2);

		System.out.println("O valor multiplicado é: " + resultado);
	}

	public static int multiplicador(int a, int n) {

		int mult = 0;

		for (int i = 1; i <= a; i++) {
			mult += n;
		}

		return mult;
	}

}
