package aula;

public class Aluno {
    private String nome;
    private int idade;
    private String sobrenome;
    private String CPF;
    
    public void setNome(String nome) {
    	this.nome = nome;
    }
    public String getNome() {
    	return nome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public void setCPF(String cpf){
        if (cpf.length() == 11){
            this.CPF = cpf;
            System.out.println("CPF cadastrado com sucesso!");
        } else {
            System.out.println("CPF invalido, digite somente os 11 números");
        }
    }

    public String getCPF(){
        return CPF;
    }

    public void setIdade(int idade) {
    	if (idade > 0 && idade < 130) {
    		this.idade = idade;
    		System.out.println("Idade cadastrada com sucesso!");
    	}
    	else {
    		System.out.println("Erro! Idade inválida");
    	}
    }
    public int getIdade(){
        return idade;
    }
}

