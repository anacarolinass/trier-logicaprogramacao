package vetoresmatrizes;

import java.util.Scanner;

public class Exercicio1Atividade5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] valores = new int[10];
		
		for (int i = 0; i < valores.length; i++) {
			System.out.print("Digite o " + (i + 1)  + " valor: ");
			valores[i] = sc.nextInt();
		}
		
		for (int i = valores.length - 1; i >= 0; i--) {
			System.out.println(valores[i]);
		}
		
		
	}

}
