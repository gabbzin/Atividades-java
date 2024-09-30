package Testes;
import java.util.Scanner;

public class exercicio06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor monetario: ");
		float moeda = sc.nextFloat();
		
		sc.close();
		
		System.out.printf("R$ %.2f", moeda);
	}
}
