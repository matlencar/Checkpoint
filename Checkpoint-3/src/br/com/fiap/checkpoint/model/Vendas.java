package br.com.fiap.checkpoint.model;

public class Vendas {

	// Atributos
	private String cliente;
	private Produtos produtos;
	private String formaPagamento;
	private int quantidade;

	// Construtor sobrecarga
	public Vendas() {
	}

	// Construtor
	public Vendas(String cliente, Produtos produtos, String formaPagamento, int quantidade) {
		super();
		this.cliente = cliente;
		this.produtos = produtos;
		this.formaPagamento = formaPagamento;
		this.quantidade = quantidade;
	}
	
	// Tirar a quantidade do estoque e retornar o valor a ser pago
	public int vendaFinalizada( ) {
		getProdutos().setEstoque(getProdutos().getEstoque() - quantidade);
		return quantidade;
	}

	// sobrescrever o m?todo toString()
	@Override
	public String toString() {
		return cliente + " - Produto: " + produtos.getNome() + " quantidade: " + quantidade;
	}

	// getters and Setters
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Produtos getProdutos() {
		return produtos;
	}

	public void setProdutos(Produtos produtos) {
		this.produtos = produtos;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double vendaFinalizada(int i) {
		
		return 100 - quantidade;
	}

}
