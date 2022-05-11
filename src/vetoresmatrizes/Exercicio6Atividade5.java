package vetoresmatrizes;

import java.util.Scanner;

public class Exercicio6Atividade5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double[] notas = new double[3];
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Insira a " + (i + 1) + "º nota do aluno: ");
			notas[i] = sc.nextDouble();
		}

		double media = calculaMedia(notas);
		mostraMedia(notas, media);

	}

	public static double calculaMedia(double[] nota) {

		double mediaDeNotas = 0;

		for (int i = 0; i < nota.length; i++) {

			mediaDeNotas += nota[i];
			if (i == nota.length - 1) {
				mediaDeNotas /= nota.length;
			}
		}

		return mediaDeNotas;
	}

	public static void mostraMedia(double[] notas, double media) {

		for (int i = 0; i < notas.length; i++) {
			if (notas[i] >= media) {
				System.out.println("Nota acima da média: "+notas[i]);
			}
		}

	}

}
