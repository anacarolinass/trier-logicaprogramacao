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

		int linha2 = 1;
		int coluna2 = 0;

		for (int linha = 0; linha < matrizDeInteiros.length; linha++) {
			for (int coluna = 0; coluna < matrizDeInteiros[linha].length; coluna++) {
				// System.out.print(matrizDeInteiros[linha][coluna]);

				if (linha >= linha2 && coluna == coluna2) {
					System.out.print(matrizDeInteiros[linha][coluna]);
					linha2++;
				}
			}
			
			System.out.println();

		}

	}

}
