package br.com.fiap.checkpoint.model;

public class Lanches extends Produtos {

	// Atributos
	private String opcoes;
	private String recheio;

	// Construtor
	public Lanches(String nome, double preco, int estoque, String sabor, String opcoes, String recheio) {
		super(nome, preco, estoque, sabor);
		this.opcoes = opcoes;
		this.recheio = recheio;
	}

	// Construtor sobrecarga
	public Lanches() {
	}

	// Getters and Setters
	public String getOpcoes() {
		return opcoes;
	}

	public void setOpcoes(String opcoes) {
		this.opcoes = opcoes;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

}
