package br.com.fiap.checkpoint.model;

public class Produtos {

	private String nome;
	private int quantidade;
	private int estoque;
	private int entrega;


	//Construtor
	public Produtos(String nome, int quantidade, int estoque, int entrega) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.estoque = estoque;
		this.entrega = entrega;
	}

	//Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public int getEntrega() {
		return entrega;
	}

	public void setEntrega(int entrega) {
		this.entrega = entrega;
	}

}
