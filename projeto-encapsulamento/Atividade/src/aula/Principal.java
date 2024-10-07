package aula;
import java.util.Scanner;

public class Principal {
	private static final Scanner leitor = new Scanner(System.in);
	public static void main(String[] args) {
		AlunoService alunoService = new AlunoService(leitor);
		boolean continuar = true;

		while(continuar){
			alunoService.AdicionarAluno();
			continuar = alunoService.continuarCadastro();
		}

		alunoService.exibirAlunos();
	}
}
