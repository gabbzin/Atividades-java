package Testes;
import java.util.Scanner;

public class exercicio05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int numero1 = sc.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int numero2 = sc.nextInt();
		
		sc.close();
		
		float razao = numero1 / numero2;
		
		System.out.printf("%.2f", razao);
	}
}
