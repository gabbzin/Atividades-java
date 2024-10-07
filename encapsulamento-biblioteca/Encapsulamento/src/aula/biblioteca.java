package aula;

public class biblioteca {
	private String nome;
	private String endereco;
	private int numeroLivros;
	private String cep;

	// Nome
	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return nome;
	}

	// Endereço
	public void setEndereco(String endereco){
		this.endereco = endereco;
	}

	public String getEndereco(){
		return endereco;
	}

	// Número de Livros
	public void setNumeroLivros(int numeroLivros){
		this.numeroLivros = numeroLivros;
	}

	public int getNumeroLivros(){
		return numeroLivros;
	}

	// CEP
	public void setCEP(String cep){
		this.cep = cep;
	}

	public String getCEP(){
		return cep;
	}
}
