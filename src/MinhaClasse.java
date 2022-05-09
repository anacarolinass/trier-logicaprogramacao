import java.util.Scanner;

public class MinhaClasse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um texto: ");
		String texto = sc.next();
		System.out.println("Você digitou " + texto);
		
		sc.close();
		
	}
	
}
