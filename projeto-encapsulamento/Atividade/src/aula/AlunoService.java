package aula;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlunoService {
    private List<Aluno> ListaAlunos = new ArrayList<>();
    private final Scanner leitor;

    public AlunoService(Scanner leitor){
        this.leitor = leitor;
    }

    public void AdicionarAluno(){
        Aluno aluno = new Aluno(); // Criação do objeto aluno

        System.out.print("\n"); // Espaço entre as linhas do terminal

        aluno.setNome(capturarNome());
        aluno.setIdade(capturarIdade());
        
        ListaAlunos.add(aluno); // Adição do objeto Aluno (com os atributos) no ARRAY
        System.out.println("Aluno adicionado com sucesso\n");
    }

    private String capturarNome(){
        System.out.print("Digite o nome do aluno: ");
        return leitor.nextLine();
    }

    private int capturarIdade(){
        int idade = 0;
        boolean validarIdade = false;

        while (!validarIdade){
            System.out.print("Digite a idade do aluno: ");

            try{
                idade = Integer.parseInt(leitor.nextLine());
                System.out.print("\n");
                if (idade > 0 && idade < 130){
                    validarIdade = true;
                } else {
                    System.out.print("Digite uma idade válida!");
                }
            } catch (NumberFormatException e) {
                System.out.print("Digite um número!");
            }
        }

        return idade; // Retorno da função capturarIdade
    }

    public void exibirAlunos(){
        System.out.println("\nAlunos cadastrados: ");

        for (Aluno aluno : ListaAlunos){
            System.out.println("Nome: " + aluno.getNome() + ", Idade: " + aluno.getIdade());
        }
    }

    public boolean continuarCadastro(){
        String resposta;

        while(true){
            System.out.print("Deseja continuar cadastrando alunos? [s/n]  ");
            resposta = leitor.nextLine().toLowerCase();

            if (resposta.equals("s")){
                return true;
            } else if (resposta.equals("n")){
                return false;
            }
            else {
                System.out.print("Digite S para sim ou N para não");
            }
        }
    }

}
