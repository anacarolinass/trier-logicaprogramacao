package vetoresmatrizes;

import java.util.Scanner;

public class Exercicio2Atividade5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] parImpar = new int[10];
		int par = 0, impar = 0;

		for (int i = 0; i < parImpar.length; i++) {
			System.out.print("Digite o " + (i + 1) + " valor: ");
			parImpar[i] = sc.nextInt();

			if (parImpar[i] % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		
		System.out.println("Par: " + par+"\nImpar: " + impar);

	}

}
