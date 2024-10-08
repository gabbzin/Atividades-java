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

    public void setCPF(String CPF){
        this.CPF = CPF;
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

