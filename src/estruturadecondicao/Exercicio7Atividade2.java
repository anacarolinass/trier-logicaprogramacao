package estruturadecondicao;

import java.util.Scanner;

public class Exercicio7Atividade2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o Primeiro lado ");
		int lado1 = sc.nextInt();
		System.out.print("Digite o Segundo lado ");
		int lado2 = sc.nextInt();
		System.out.print("Digite o Terceiro lado ");
		int lado3 = sc.nextInt();

		if (lado1 <= 0 && lado2 <= 0 && lado3 <= 0) {
			System.out.println("N�o � possivel calcular se � um triangulo com os dados informados");
		} else if ((lado1 == lado2) && (lado1 == lado3) && (lado2 == lado3)) {
			System.out.println("Tri�ngulo Equil�tero");
		} else if ((lado1 != lado2) && (lado1 != lado3)) {
			System.out.println("Tri�ngulo Escaleno");
		} else {
			System.out.println("Tri�ngulo Is�scele");
		}

	}

}