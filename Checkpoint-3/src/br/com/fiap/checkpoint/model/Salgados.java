package br.com.fiap.checkpoint.model;

public class Salgados extends Produtos {

	// Atributos
	private String recheio;

	// Construtor
	public Salgados(String nome, double preco, int estoque, String sabor, String recheio) {
		super(nome, preco, estoque, sabor);
		this.recheio = recheio;
	}

	// Construtor sobrecarga
	public Salgados() {
	}

	// Getters and Setters
	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

}
