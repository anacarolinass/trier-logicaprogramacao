package estruturaderepeticao;

import java.util.Scanner;

public class Exercicio1Atividade3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double nota;
		double media = 0;
		
		for (int i = 1; i <= 5; i++) {
			
			
			for (int j = 1; j <= 3; j++) {
				System.out.print("Digite a nota " + j +"º do aluno: ");
				nota = sc.nextDouble();
				media += nota;
			}
			
			media = media / 3;
			System.out.println("A media do aluno " + i + " é de " + media);
			
		}
		
	}

}
