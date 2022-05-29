package br.com.fiap.checkpoint.model;

public class Jogos extends Produtos {
	
	//Atributos
	private String console;
	private boolean midia;
	private String genero;
	private String plataforma;
	private String acessorios;
	

	//Construtor
	public Jogos(String nome, int quantidade, int estoque, int entrega, String console, boolean midia, String genero,
			String plataforma, String acessorios) {
		super(nome, quantidade, estoque, entrega);
		this.console = console;
		this.midia = midia;
		this.genero = genero;
		this.plataforma = plataforma;
		this.acessorios = acessorios;
	}
	
	//Gettres and Setters
	public String getConsole() {
		return console;
	}
	public void setConsole(String console) {
		this.console = console;
	}
	public boolean isMidia() {
		return midia;
	}
	public void setMidia(boolean midia) {
		this.midia = midia;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public String getAcessorios() {
		return acessorios;
	}
	public void setAcessorios(String acessorios) {
		this.acessorios = acessorios;
	}
	
	
	
	
}
