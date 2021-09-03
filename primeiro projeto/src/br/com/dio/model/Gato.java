package br.com.dio.model;

public class Gato {

	public String nome;
	public String cor;
	public Integer idade;
	
	public Gato() {

	}

	public Gato(String nome, String cor, Integer idade) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
