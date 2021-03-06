package br.com.fiap.checkpoint.view;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.fiap.checkpoint.model.Bebidas;
import br.com.fiap.checkpoint.model.Doce;
import br.com.fiap.checkpoint.model.Estabelecimento;
import br.com.fiap.checkpoint.model.Frios;
import br.com.fiap.checkpoint.model.Lanches;
import br.com.fiap.checkpoint.model.Pao;
import br.com.fiap.checkpoint.model.Salgados;
import br.com.fiap.checkpoint.model.Vendas;

public class Padaria {

	public static void main(String[] args) {

		// Instanciando Scanner
		Scanner leitor = new Scanner(System.in);

		// Instanciando estabelecimento
		Estabelecimento padoca = new Estabelecimento("Rua Vergueiro", 100, " Vila Mariana", " S?o Paulo", 953461324);

		// Intanciando salgados
		Salgados salgados = new Salgados();

		// Instanciando doces
		Doce doces = new Doce();

		// Instanciando frios
		Frios frios = new Frios();

		// Intanciando bebidas
		Bebidas bebidas = new Bebidas();

		// Instanciando o pao
		Pao pao = new Pao();

		// Instanciando Lanches
		Lanches lanches = new Lanches();

		// Instanciando o pagamento
		Vendas vendas = new Vendas();

		// Ler os dados de uma Venda
		String cliente = JOptionPane.showInputDialog("Digite o nome do cliente");
		String formaPagamento = JOptionPane.showInputDialog("Digite a forma de pagamento");
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));

		// Instanciando o metodo de valor a ser pago pelo cliente
		double total = vendas.vendaFinalizada(9);

		System.out.println(vendas);

		// Exibir o estoque do doce
		System.out.println("Estoque atual: " + doces.getEstoque());

		// Exibir o estabelecimento
		System.out.println("Rua da padaria: " + padoca.getRua());
		System.out.println("Endereco da padaria: " + padoca.getNumero());
		System.out.println("Bairro : " + padoca.getBairro());
		System.out.println("Cidade: " + padoca.getCidade());
		System.out.println("Cidade: " + padoca.getTelefone());

	}

}
