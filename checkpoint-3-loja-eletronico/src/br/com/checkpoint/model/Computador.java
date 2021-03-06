package br.com.checkpoint.model;

public class Computador extends Produto {

	// Atributos
	private String marca;

	// Construtor
	public Computador(String nome, double preco, int estoque, String marca) {
		super(nome, preco, estoque);
		this.marca = marca;
	}

	// Construtor vazio
	public Computador() {}

	// Getters and Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
