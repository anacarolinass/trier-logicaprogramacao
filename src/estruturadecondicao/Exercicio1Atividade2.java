package estruturadecondicao;

import java.util.Scanner;

public class Exercicio1Atividade2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a nota 1: ");
		double nota1 = sc.nextDouble();
		System.out.print("Digite a nota 2: ");
		double nota2 = sc.nextDouble();
		System.out.print("Digite a nota 3: ");
		double nota3 = sc.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		if (media >= 9.0) {
			System.out.println("A média do aluno é: " + media + "\tA");
		} else if(media < 9.0 && media >= 7.0) {
			System.out.println("A média do aluno é: " + media + "\tB");
		} else if(media < 7.0 && media >= 5.0) {
			System.out.println("A média do aluno é: " + media + "\tC");
		} else if(media < 5.0 && media >= 3.0) {
			System.out.println("A média do aluno é: " + media + "\tD");
		} else {
			System.out.println("A média do aluno é: " + media + "\tE");
		}
		
	}

}
