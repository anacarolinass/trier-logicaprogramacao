package vetoresmatrizes;

import java.util.Scanner;

public class Exercicio4Atividade5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma frase: ");
		String frase = sc.nextLine();
		int quantidade = 0;

		for (char f : frase.toCharArray()) {

			if (f == 'a' || f == 'A') {
				quantidade++;
			}
		}

		System.out.println("A quantidade de letras (A) é de: " + quantidade);
	}

}
