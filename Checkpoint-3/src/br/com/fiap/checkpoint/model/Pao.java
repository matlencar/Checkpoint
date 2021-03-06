package br.com.fiap.checkpoint.model;

public class Pao extends Produtos {

	private String tipos;

	// Construtor
	public Pao(String nome, double preco, int estoque, String sabor, String tipos) {
		super(nome, preco, estoque, sabor);
		this.tipos = tipos;
	}

	// Construtor sobrecarga
	public Pao() {
	}

	// Getters and Setters
	public String getTipos() {
		return tipos;
	}

	public void setTipos(String tipos) {
		this.tipos = tipos;
	}

}
