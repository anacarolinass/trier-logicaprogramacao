package operadores;
import java.util.Scanner;

public class Exercicio1Atividade1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int percorre = 10;

		System.out.print("Qual o pre�o da gasolina? ");
		double preco = sc.nextDouble();
		System.out.print("Qual a distancia percorrida? ");
		int distancia = sc.nextInt();
		double calculo = (preco / percorre) * distancia;

		System.out.println("Voc� ir� gastar: R$" + calculo);

		sc.close();

	}

}
