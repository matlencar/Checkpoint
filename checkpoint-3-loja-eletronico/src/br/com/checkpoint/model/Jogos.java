package br.com.checkpoint.model;

public class Jogos extends Produto {

	private String plataforma;

	// Construtor
	public Jogos(String nome, double preco, int estoque, String plataforma) {
		super(nome, preco, estoque);
		this.plataforma = plataforma;
	}

	// Construtor vazio
	public Jogos() {}

	// Getters and Setters
	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

}
