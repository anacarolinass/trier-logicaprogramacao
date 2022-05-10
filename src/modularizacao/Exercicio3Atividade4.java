package modularizacao;

import java.util.Scanner;

public class Exercicio3Atividade4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um valor positivo ou negativo: ");
		int valor = sc.nextInt();
		
		if (verificaNegativoPositivo(valor)) {
			System.out.println("O valor é positivo");
		}else {
			System.out.println("O valor é negativo");
		}
	}
	
	public static boolean verificaNegativoPositivo(int valorPN) {
		boolean negativoOuPositivo = true;
		
		if(valorPN >= 0) {
			negativoOuPositivo = true;
		}else {
			negativoOuPositivo = false;
		}
		
		return negativoOuPositivo;
	}

}
