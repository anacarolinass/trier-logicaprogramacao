package prova;

import java.util.Scanner;

public class JogoDaVelha {

	static int contVezDoJogador = 0;

	public static void main(String[] args) {

		String[][] posicoes = new String[][] { { "0", "1", "2" }, { "3", "4", "5" }, { "6", "7", "8" } };

		jogada(posicoes);

	}

	// JOGADA
	public static void jogada(String[][] posicoesJogada) {

		Scanner sc = new Scanner(System.in);

		boolean preencheu = false;
		boolean ganhou = false;

		System.out.println("Campos com numeros est�o vazio");
		System.out.println("Qual espa�o deseja jogar?");

		do {
			tabuleiro(posicoesJogada);
			String vezDeQualJogador = vezDeQualJogador();
			System.out.println(vezDeQualJogador);
			System.out.print("Digite a posi��o: ");
			Integer posicao = sc.nextInt();
			System.out.print("Digite  o " + vezDeQualJogador + ": ");
			String vezDoJogador = sc.next().toUpperCase();
			posicoesJogada = posicoesVazia(posicao, posicoesJogada, vezDoJogador);

			ganhou = ganhouPartida(posicoesJogada);
			preencheu = preencheuTudo(posicoesJogada);

			deuVelha(posicoesJogada, preencheu);
			
			if (ganhou) {
				System.err.println("O jogador " + vezDeQualJogador + " Venceu");
			}else if(preencheu) {
				System.err.println("Deu velha");
				ganhou = true;
			}
			
		} while (!(ganhou));
	}

	// VERIFICA SE PREENCHEU TODOS OS CAMPOS
	public static boolean preencheuTudo(String[][] posicoes) {
		boolean preencheu = false;

		for (int i = 0; i < posicoes.length; i++) {
			for (int j = 0; j < posicoes.length; j++) {
				if (posicoes[i][j] == "0") {
					preencheu = false;
				} else if (posicoes[i][j] == "1") {
					preencheu = false;
				} else if (posicoes[i][j] == "2") {
					preencheu = false;
				} else if (posicoes[i][j] == "3") {
					preencheu = false;
				} else if (posicoes[i][j] == "4") {
					preencheu = false;
				} else if (posicoes[i][j] == "5") {
					preencheu = false;
				} else if (posicoes[i][j] == "6") {
					preencheu = false;
				} else if (posicoes[i][j] == "7") {
					preencheu = false;
				} else if (posicoes[i][j] == "8") {
					preencheu = false;
				} else {
					preencheu = true;
				}
			}
		}

		return preencheu;

	}

	// PREENCHEU TUDO DEU VELHA
	public static void deuVelha(String[][] posicoes, boolean seForVelha) {

		if (seForVelha) {

		}
	}

	// VEZ DE QUAL JOGADOR
	public static String vezDeQualJogador() {

		String texto = "";

		if (contVezDoJogador % 2 == 0) {
			texto = "X";
			contVezDoJogador++;
		} else {
			texto = "O";
			contVezDoJogador++;
		}
		return texto;
	}

	// POSICAO VAZIA
	public static String[][] posicoesVazia(Integer posicoes, String[][] posicoesVazia, String letra) {

		int espaco = 0;

		for (int i = 0; i < posicoesVazia.length; i++) {
			for (int j = 0; j < posicoesVazia.length; j++) {

				if (posicoes.toString().equals(posicoesVazia[i][j])) {

					switch (posicoesVazia[i][j]) {
					case "0":
						// System.out.println("0");
						posicoesVazia[i][j] = letra;
						break;
					case "1":
						// System.out.println("1");
						posicoesVazia[i][j] = letra;
						break;
					case "2":
						// System.out.println("2");
						posicoesVazia[i][j] = letra;
						break;
					case "3":
						// System.out.println("3");
						posicoesVazia[i][j] = letra;
						break;
					case "4":
						// System.out.println("4");
						posicoesVazia[i][j] = letra;
						break;
					case "5":
						// System.out.println("5");
						posicoesVazia[i][j] = letra;
						break;
					case "6":
						// System.out.println("6");
						posicoesVazia[i][j] = letra;
						break;
					case "7":
						// System.out.println("7");
						posicoesVazia[i][j] = letra;
						break;
					case "8":
						// System.out.println("8");
						posicoesVazia[i][j] = letra;
						break;

					default:

						break;
					}
				}

			}
		}

		return posicoesVazia;

	}

	// TABULEIRO
	public static void tabuleiro(String[][] posicoesTabuleiro) {
		System.out.println();
		for (int i = 0; i < posicoesTabuleiro.length; i++) {
			for (int j = 0; j < posicoesTabuleiro.length; j++) {
				System.out.print(posicoesTabuleiro[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	// GANHOU PARTIDA
	public static boolean ganhouPartida(String[][] posicoesJogada) {

		boolean ganhou = false;

		// linha 0 1 2
		if (posicoesJogada[0][0].equals(posicoesJogada[0][1]) && posicoesJogada[0][0].equals(posicoesJogada[0][2])) {
			ganhou = true;
		}
		if (posicoesJogada[1][0].equals(posicoesJogada[1][1]) && posicoesJogada[1][0].equals(posicoesJogada[1][2])) {
			ganhou = true;
		}
		if (posicoesJogada[2][0].equals(posicoesJogada[2][1]) && posicoesJogada[2][0].equals(posicoesJogada[2][2])) {
			ganhou = true;
		}

		// coluna 0 1 2
		if (posicoesJogada[0][0].equals(posicoesJogada[1][0]) && posicoesJogada[0][0].equals(posicoesJogada[2][0])) {
			ganhou = true;
		}
		if (posicoesJogada[0][1].equals(posicoesJogada[1][1]) && posicoesJogada[0][1].equals(posicoesJogada[2][1])) {
			ganhou = true;
		}
		if (posicoesJogada[0][2].equals(posicoesJogada[1][2]) && posicoesJogada[0][2].equals(posicoesJogada[2][2])) {
			ganhou = true;
		}

		// diagonal
		if (posicoesJogada[0][0].equals(posicoesJogada[1][1]) && posicoesJogada[0][0].equals(posicoesJogada[2][2])) {
			ganhou = true;
		}
		if (posicoesJogada[0][2].equals(posicoesJogada[1][1]) && posicoesJogada[0][2].equals(posicoesJogada[2][0])) {
			ganhou = true;
		}

		return ganhou;
	}

}
