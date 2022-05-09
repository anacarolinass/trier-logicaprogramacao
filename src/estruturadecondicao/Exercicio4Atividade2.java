package estruturadecondicao;

import java.util.Scanner;

public class Exercicio4Atividade2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor: ");
		int valor = sc.nextInt();

		if (valor <= 10 && valor >= 5) {
			int resultado = valor * 2;
			System.out.println("O valor " + valor + " multiplicado por 2 fica " + resultado);
		} else if (valor < 5) {
			System.out.println("Valor não aceito, muito pequeno");
		} else {
			System.out.println("Valor não aceito, muito grande");
		}

	}

}
