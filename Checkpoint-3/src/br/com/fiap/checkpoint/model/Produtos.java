package br.com.fiap.checkpoint.model;

public class Produtos {

	private String nome;
	private double preco;
	private int estoque;
	private String sabor;

	// Construtor sobrecarga
	public Produtos() {
	}

	// Construtor
	public Produtos(String nomeString, double preco, int estoque, String sabor) {
		super();
		this.nome = nomeString;
		this.preco = preco;
		this.estoque = estoque;
		this.sabor = sabor;
	}

	// Getters and setters
	public String getNome() {
		return nome;
	}

	public void setNomeString(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

}
