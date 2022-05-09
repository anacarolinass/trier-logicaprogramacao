package estruturaderepeticao;

import java.util.Scanner;

public class Exercicio5Atividade3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor impar: ");
		int valorImpar = sc.nextInt();
		
		for (int i = 1; i <= valorImpar; i++) {
			for (int j = 1; j <= valorImpar; j++) {
				
				if (i == j) {
					System.out.print(j);
				}else {
					if ((i == 1) || (i == valorImpar)) {
						System.out.print("*");
					}else {
						if((j == 1) || (j == valorImpar)) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						}
					}
				}
			}
			System.out.println();
		}

	}

}
