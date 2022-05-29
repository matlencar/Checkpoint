package br.com.fiap.checkpoint.model;

public class Bebidas extends Produtos {

	// Atributos
	private String tipo;
	private int ml;

	// Construtor vazio
	public Bebidas() {
	}

	// Construtor
	public Bebidas(String nome, double preco, int estoque, String sabor, String tipo, int ml) {
		super(nome, preco, estoque, sabor);
		this.tipo = tipo;
		this.ml = ml;
	}

	// Getters and Setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getMl() {
		return ml;
	}

	public void setMl(int ml) {
		this.ml = ml;
	}
}
