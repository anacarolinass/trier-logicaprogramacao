package modularizacao;

import java.util.Scanner;

public class Exercicio6Atividade4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a horas em segundo: ");
		int horaSegundo = sc.nextInt();
		
		mostrarHoras(horaSegundo);
		
	}
	
	public static void mostrarHoras(int segundosParaHoras) {
		
        int horas = segundosParaHoras / 3600;
        int restoHoras = segundosParaHoras % 3600;
       
        int minutos = restoHoras / 60;
        int restoMinutos = restoHoras % 60;
       
        int segundos = restoMinutos;
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);

	}

}
