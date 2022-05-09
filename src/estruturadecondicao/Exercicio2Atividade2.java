package estruturadecondicao;

import java.util.Scanner;

public class Exercicio2Atividade2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor para ser verificado: ");
		int parImpar = sc.nextInt();

		if (parImpar % 2 == 0) {
			System.out.println("Valor " + parImpar + " é Par");
		}else {
			System.out.println("Valor " + parImpar + " é Impar");
		}

	}

}
