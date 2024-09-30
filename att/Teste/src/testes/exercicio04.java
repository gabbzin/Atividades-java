package Testes;
import java.util.Scanner;

public class exercicio04 {
	public static void main(String[] args) {
		int numeros[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("Digite o %d número: ", i+1);
			numeros[i] = sc.nextInt();
		}
		sc.close();
		
		for (int i = 0; i < 5; i++) {
			System.out.printf("\t%05d\n", numeros[i]);
		}
		
	}
}
