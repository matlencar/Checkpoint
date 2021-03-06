package br.com.checkpoint.model;

public class Venda  {

	// Atributos
	private String cliente;
	private Produto produto;
	private int quantidade;
	private VideoGame video;
	
	// Construtor vazio
	public Venda() {}
	
	//Construtor
	public Venda(String cliente, Produto produto, int quantidade, VideoGame video) {
		super();
		this.cliente = cliente;
		this.produto = produto;
		this.quantidade = quantidade;
		this.video = video;
	}

	// Getters and Setters
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public VideoGame getVideo() {
		return video;
	}

	public void setVideo(VideoGame video) {
		this.video = video;
	}

	public double vendaFinalizada(int quantidade) {
		
		return quantidade;
	}	
}
