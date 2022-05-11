package vetoresmatrizes;

import java.util.Scanner;

public class Exercicio5Atividade5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// int[linha][coluna]
		int[][] matrizDeInteiros = new int[][] { { 1, 9, 3, 4, 5, 6, 7, 8, 9 }, { 2, 1, 8, 9, 4, 8, 5, 6, 3 },
				{ 3, 5, 1, 5, 0, 8, 5, 6, 1 }, { 4, 5, 9, 1, 2, 8, 5, 8, 7 }, { 5, 5, 8, 4, 1, 8, 5, 5, 5 },
				{ 6, 7, 9, 4, 9, 1, 5, 2, 1 }, { 7, 5, 9, 8, 9, 8, 1, 7, 2 }, { 8, 4, 8, 1, 9, 8, 5, 1, 8 },
				{ 9, 5, 8, 7, 9, 8, 7, 6, 1 } };

		novePorNove(matrizDeInteiros);

	}

	public static void novePorNove(int[][] matrizDeInteiros) {

		String[] numeros = new String[9];

		for (int linha = 0; linha < matrizDeInteiros.length; linha++) {
			numeros[linha] = "";
			for (int coluna = 0; coluna < matrizDeInteiros[linha].length; coluna++) {
				System.out.print(matrizDeInteiros[linha][coluna]);

				if (linha >= 1 && coluna == 0) {
					numeros[linha] += matrizDeInteiros[linha][coluna] + ",";
				} else if ((linha >= 1 && coluna == 1) && !(linha == coluna)) {
					numeros[linha] += matrizDeInteiros[linha][coluna] + ",";
				} else if (linha >= 2 && coluna == 2 && !(linha == coluna)) {
					numeros[linha] += matrizDeInteiros[linha][coluna] + ",";
				} else if (linha >= 3 && coluna == 3 && !(linha == coluna)) {
					numeros[linha] += matrizDeInteiros[linha][coluna] + ",";
				} else if (linha >= 4 && coluna == 4 && !(linha == coluna)) {
					numeros[linha] += matrizDeInteiros[linha][coluna] + ",";
				} else if (linha >= 5 && coluna == 5 && !(linha == coluna)) {
					numeros[linha] += matrizDeInteiros[linha][coluna] + ",";
				} else if (linha >= 6 && coluna == 6 && !(linha == coluna)) {
					numeros[linha] += matrizDeInteiros[linha][coluna] + ",";
				} else if (linha >= 7 && coluna == 7 && !(linha == coluna) && (linha < 8 && coluna < 7)) {
					numeros[linha] += matrizDeInteiros[linha][coluna] + ",";
				} else if (linha >= 7 && coluna == 7 && !(linha == coluna)) {
					numeros[linha] += matrizDeInteiros[linha][coluna];
				}

			}
			System.out.println();

		}
		System.out.println();
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]);
		}
	}

}
