package estruturadecondicao;

import java.util.Scanner;

public class Exercicio6Atividade2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de deputados presente: ");
		int deputadosPresente = sc.nextInt();

		if (deputadosPresente >= 100) {

			System.out.print("Quantidade de votos favoraveis: ");
			int quantidadeDeVotos = sc.nextInt();
			System.out.println("S - Simples \nQ - Maioria Qualificada");
			char tipo = sc.next().charAt(0);

			switch (tipo) {
			case 'S':
			case 's':
				int presente1 = deputadosPresente / 2;

				if (quantidadeDeVotos > presente1) {
					System.out.println("A lei foi aprovada");
				} else {
					System.out.println("A lei foi reprovada");
				}

				break;
			case 'Q':
			case 'q':

				int presente2 = deputadosPresente / 3;

				if (quantidadeDeVotos >= (presente2 + presente2)) {
					System.out.println("A lei foi aprovada");
				} else {
					System.out.println("A lei foi reprovada");
				}

				break;
			default:
				System.out.println("Dado invalido");

				break;
			}

		} else {
			System.out.println("Sessão Cancelada, a quantidade de deputados está abaixo de 100");
		}
	}

}
