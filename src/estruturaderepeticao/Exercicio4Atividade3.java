package estruturaderepeticao;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio4Atividade3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int qtdPartidas;
		int qtdChutesParaOGol = 0;
		int qtdDeGols = 0;
		int seqDeGols = 0;
		double mediaChutesAGol, mediaDeGols;

		System.out.print("Quantidade de partidas: ");
		qtdPartidas = sc.nextInt();

		for (int i = 1; i <= qtdPartidas; i++) {

			System.out.print("Quantidade de Chutes para o Gol: ");
			qtdChutesParaOGol = sc.nextInt();
			System.out.print("Quantidade de Gols do Matador: ");
			qtdDeGols = sc.nextInt();

			mediaChutesAGol = qtdChutesParaOGol / qtdPartidas;
			mediaDeGols = qtdDeGols / qtdPartidas;

			System.out.println("Media de Chutes para o Gol da " + i + "º partida: " + mediaChutesAGol);
			System.out.println("Media de Gols do Matador da " + i + "º partida: " + mediaDeGols);

			if (qtdDeGols == 0) {
				seqDeGols += 1;
			} else {
				seqDeGols = 0;
			}

		}
		
		System.out.println("A maior sequencia que não fez gols: " + seqDeGols);

	}

}
