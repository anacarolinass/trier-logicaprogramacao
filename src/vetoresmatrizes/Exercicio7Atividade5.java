package vetoresmatrizes;

import java.util.Scanner;

public class Exercicio7Atividade5 {

	public static void main(String[] args) {

		int[] posicoes = new int[2];

		int[] posicoesRetorno = verificarPosicoes(posicoes);
		
		for (int i = 0; i < posicoesRetorno.length; i++) {
			System.out.print(posicoesRetorno[i] + " ");
		}

	}

	public static int[] verificarPosicoes(int[] posicoesVazia) {
		
		Scanner sc = new Scanner(System.in);
		boolean vazia = false;
		int valorDigitado = 0;
		int posicaoInserida;

		do {

			for (int i = 0; i < posicoesVazia.length; i++) {
				if (posicoesVazia[i] == 0) {
					System.out.println("Posi��o: " + i + " est� vazia");
					vazia = true;
				}
				

				if (i == posicoesVazia.length - 1 && vazia) {
					System.out.print("\ndigite um valor: ");
					valorDigitado = sc.nextInt();
					System.out.print("Qual a posi��o que deseja inserir? ");
					posicaoInserida = sc.nextInt();
					posicoesVazia[posicaoInserida] = valorDigitado;

				}else {
					vazia = false;
				}
				
				for (int j = 0; j < posicoesVazia.length; j++) {
					if (posicoesVazia[j] == 0) {
						vazia = true;
					}
					
				}
			
			}

		} while (vazia);
		

		return posicoesVazia;
	}

}
