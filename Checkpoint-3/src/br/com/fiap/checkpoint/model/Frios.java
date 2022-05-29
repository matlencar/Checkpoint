package br.com.fiap.checkpoint.model;

public class Frios extends Produtos {

	// Atributos
	private String embutidos;
	private String queijos;

	// Construtor
	public Frios(String nome, double preco, int estoque, String sabor, String embutidos, String queijos) {
		super(nome, preco, estoque, sabor);
		this.embutidos = embutidos;
		this.queijos = queijos;
	}

	// Construtor sobrecarga
	public Frios() {
	}

	// Getters and Setters
	public String getEmbutidos() {
		return embutidos;
	}

	public void setEmbutidos(String embutidos) {
		this.embutidos = embutidos;
	}

	public String getQueijos() {
		return queijos;
	}

	public void setQueijos(String queijos) {
		this.queijos = queijos;
	}

}
