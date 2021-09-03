package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato("Maurico", "Cinza", 1);
		Livro livro = new Livro();
		
		System.out.println("Hello World");
		System.out.println("Gato " + gato.nome);
		System.out.println(livro);
	}

}

class Livro{
	public String nome;
	public Integer nPag;
}