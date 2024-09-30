package Testes;
import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int numero01 = leitor.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int numero02 = leitor.nextInt();

		leitor.close();

		System.out.println("Primeiro número digitado: " + numero01);
		System.out.printf("Segundo número digitado: %05d", numero02);
	}

}
