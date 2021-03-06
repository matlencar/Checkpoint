package br.com.fiap.checkpoint.model;

public class Estabelecimento {

	// Atributos
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private int telefone;

	// Construtor
	public Estabelecimento(String rua, int numero, String bairro, String cidade, int telefone) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.telefone = telefone;
	}

	// Getters and Setters
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

}
