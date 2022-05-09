package estruturaderepeticao;

import java.util.Scanner;

public class Exercicio2Atividade3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double nota = 0;
		int quant = 1;
		double media = 0;
		
		do {
			System.out.print("A nota do " + quant + " aluno");
			nota = sc.nextDouble();
			quant += 1;
			media += nota;
		} while (nota != 0);
		
		System.out.println("A media da sala é de: " + media / quant);
	}

}
