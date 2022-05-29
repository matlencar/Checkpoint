package br.com.checkpoint.model;

public class VideoGame extends Produto {

	// Atributo
	private String console;

	// Construtor
	public VideoGame(String nome, double preco, int estoque, String console) {
		super(nome, preco, estoque);
		this.console = console;
	}

	// Construtor vazio
	public VideoGame() {}

	// Getters and Setters
	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

}
