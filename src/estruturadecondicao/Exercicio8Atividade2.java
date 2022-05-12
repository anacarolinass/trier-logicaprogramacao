package estruturadecondicao;

import java.util.Scanner;

public class Exercicio8Atividade2 {

	// Ovos
	// 12 duzia = 10,00
	// 1 ovo = 1,50
	// 6 ovos = 1,00
	// 30 ovos = 21,00

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int quantidaDeOvos = 0;
		double bandeja = 21.00;
		double duzia = 10.00;
		double seis = 6.00;
		double unicoOvo = 1.50;
		double total = 0;

		System.out.print("Quantidade de ovos: ");
		quantidaDeOvos = sc.nextInt();

		int restante = 0;

		total += (quantidaDeOvos / 30) * bandeja;
		restante += quantidaDeOvos % 30;

		total += (restante / 12) * duzia;
		restante = restante % 12;

		total += (restante / 6) * seis;
		restante = restante % 6;

		total += restante * unicoOvo;

		System.out.println("Total da compra: R$" + String.format("%.2f", total) );

	}

}
