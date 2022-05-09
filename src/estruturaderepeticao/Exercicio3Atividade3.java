package estruturaderepeticao;

import java.util.Scanner;

public class Exercicio3Atividade3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int idade = 0;
		int maiorIdade = 0;
		int quant = 1;
		
		do {
			System.out.print("Digite " + quant + "º idade: ");
			idade = sc.nextInt();
			
			if (maiorIdade < idade) {
				maiorIdade = idade;
			}
			
			quant += 1;
			
		} while (idade != 0);
		
		System.out.println("A maior idade é: " + maiorIdade);
	}

}
