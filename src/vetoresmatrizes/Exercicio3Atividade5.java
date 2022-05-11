package vetoresmatrizes;

import java.util.Scanner;

public class Exercicio3Atividade5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] diagonalPriSec = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 4 }, { 8, 5, 1, 5, 0 },
				{ 3, 5, 9, 8, 2 }, { 2, 5, 8, 4, 9 } };

		String principal = "", secundaria = "";
		int linha = 4;

		for (int i = 0; i < diagonalPriSec.length; i++) {
			for (int j = 0; j < diagonalPriSec.length; j++) {

				if (i == j) {
					principal += diagonalPriSec[i][j] + " ";
					
				}

				if (j == linha) {
					secundaria += diagonalPriSec[i][j] + " ";
					linha--;
				}

			}

		}

		System.out.print("Diagonal principal: " + principal +"\n");
		System.out.print("Diagonal secundaria: " + secundaria);
	}

}
