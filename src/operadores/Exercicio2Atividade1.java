package operadores;
import java.util.Scanner;

public class Exercicio2Atividade1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double valorFixo = 17.90;
		
		System.out.print("Informe o peso da balança: ");
		double peso = sc.nextDouble();
		double mostrarValorPagar = peso * valorFixo;
		
		System.out.println("O valor do prato deu: R$" + mostrarValorPagar);
		
		sc.close();
	}

}
