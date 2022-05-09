package estruturaderepeticao;

import java.util.Scanner;

public class Exercicio5Atividade3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor impar: ");
		int valorImpar = sc.nextInt();
		
		for (int i = 1; i <= valorImpar; i++) {
			
			for (int j = 1; j <= valorImpar; j++) {
				
				for (int j2 = 0; j2 < valorImpar; j2++) {
					
				}
				
				if (i == 1) {
					System.out.print(j);
					for (int j2 = 1; j2 <= valorImpar - 1; j2++) {
						System.out.print("*");
						
					}
					System.out.print("\n");
				}else {
					
					if (i > 1) {
						System.out.print("*");
						System.out.print(i);
					}
				}
			}
			System.out.print("\n");
		}
		
	}

}
