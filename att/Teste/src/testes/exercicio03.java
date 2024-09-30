package Testes;
import java.util.Scanner;

public class exercicio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome e sobrenome: ");
		String nomeSobrenome = sc.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		
		System.out.printf("%20s", nomeSobrenome);
		System.out.printf("\n%3d", idade);
		
		sc.close();
	}
}
