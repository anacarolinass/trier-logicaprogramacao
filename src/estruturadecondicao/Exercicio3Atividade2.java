package estruturadecondicao;

import java.util.Scanner;

public class Exercicio3Atividade2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor: ");
		int valor = sc.nextInt();

		if (valor > 10) {
			int resultado = valor * 2;
			System.out.println("O valor " + valor + " multiplicado por 2 fica " + resultado);
		} else {
			System.out.println("Erro valor igual ou abaixo de 10");
		}

	}

}
