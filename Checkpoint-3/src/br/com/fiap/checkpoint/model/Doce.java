package br.com.fiap.checkpoint.model;

public class Doce extends Produtos {

	// Atributos
	private String recheio;

	// Construtor sobrecarga
	public Doce() {
	}

	// Construtor
	public Doce(String nome, double preco, int estoque, String sabor, String recheio) {
		super(nome, preco, estoque, sabor);
		this.recheio = recheio;
	}

	// Getters and Setters
	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

}
