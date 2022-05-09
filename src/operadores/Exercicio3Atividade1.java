package operadores;
import java.util.Scanner;

public class Exercicio3Atividade1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome do produto: ");
		String nomeProduto = sc.nextLine();
		System.out.print("Digite a base de calculo: ");
		double baseDeCalculo = sc.nextDouble();
		System.out.print("Alíquota do produto: ");
		double aliquota = sc.nextDouble();
		
		double icms = baseDeCalculo * aliquota / 100;
		
		System.out.println("********************");
		System.out.println("O produto que você comprou - " + nomeProduto + " - possui R$ " + icms + " de ICMS!");
		System.out.println("********************");
		
		sc.close();
	}

}
