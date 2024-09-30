package Testes;
import java.util.Scanner;

public class exercicio02 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o número: ");
		
		float numero = leitor.nextFloat();
		
		leitor.close();
		
		System.out.printf("Primeira formatação: %10.2f", numero);
		System.out.printf("\nSegunda formatação: %10.4f", numero);
		System.out.printf("\nNúmero completo: %f", numero);
	}
}
