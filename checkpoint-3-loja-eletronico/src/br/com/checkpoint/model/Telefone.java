package br.com.checkpoint.model;

public class Telefone {

	// Atributos
	private int celular;
	private int telefone;

	// Construtor
	public Telefone(int celular, int telefone) {
		this.celular = celular;
		this.telefone = telefone;
	}

	// Getters and Setters
	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

}
