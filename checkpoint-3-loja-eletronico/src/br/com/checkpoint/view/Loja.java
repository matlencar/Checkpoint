package br.com.checkpoint.view;

import java.util.Scanner;

import br.com.checkpoint.model.Computador;
import br.com.checkpoint.model.Endereco;
import br.com.checkpoint.model.Jogos;
import br.com.checkpoint.model.Produto;
import br.com.checkpoint.model.Telefone;
import br.com.checkpoint.model.Venda;
import br.com.checkpoint.model.VideoGame;

public class Loja {
	
	public static void main(String[] args) {
		
		// Instanciando leitor
		Scanner leitor = new Scanner(System.in);

		// Instanciando endere?o
		Endereco endereco = new Endereco("Avenida Lins de Vasconcelos ", 1220, "Aclima??o", "S?o Paulo");

		// Instanciado telefone
		Telefone telefone = new Telefone(943302828, 40028000);

		// Instanciando produto
		Produto produto = new Produto();

		// Instanciando jogos
		Jogos game = new Jogos();

		// Instanciado computador
		Computador computador = new Computador();

		// Instanciado video game
		VideoGame video = new VideoGame();

		// Instanciado venda
		Venda venda = new Venda();
		
		String LojaEletronicos = "fiap conect";
		
		String tituloLoja = LojaEletronicos.toUpperCase();
		
		System.out.println("\t\t\t\t\t\tOLA SEJA BEM VINDO A "+ tituloLoja);
		
		System.out.println("Departamentos que possuimos: ");
		System.out.println("1 - Departamento de video-games.");
		System.out.println("2 - Departamento de jogos.");
		System.out.println("3 - Departamento de computadores.");
		
//		System.out.println("Antes de tudo entre com seu nome: ");
//		String nome = leitor.nextLine();
//		venda.setCliente(nome);
		
		//String nome = JOptionPane.showInputDialog("Digite seu nome");
		
		System.out.println("Entre com o numero do Departamento: ");
		byte departamento = leitor.nextByte();
		
		switch(departamento) {
		
		case 1: // Departamento video game
			
			System.out.println("Qual seu nome? ");
			String nome = leitor.nextLine();
			venda.setCliente(leitor.nextLine());
		
			System.out.println("Qual video game voc? quer comprar? ");
			String compra = leitor.nextLine();
			video.setConsole(compra);
			
			System.out.println("Qual a quantidade que deseja comprar? ");
			int qtd = leitor.nextInt();
			venda.setQuantidade(qtd);
			
			System.out.println("Quantidade no estoque ");
			int etq = leitor.nextInt();
			produto.setEstoque(etq);
			
			System.out.println("O valor do produto: ");
			double valor = leitor.nextDouble();
			produto.setPreco(valor);
			
			System.out.println("\t\t\t\t\t\tDADOS DA NOTA FISCAL DA LOJA: ");
			
			System.out.println("Nome do cliente: " + venda.getCliente());
			System.out.println("Nome do video-game: " + video.getConsole());
			System.out.println("Quantidade comprada: " + venda.getQuantidade());
			System.out.println("Pre?o pago pelo produto: " +"R$"+ produto.getPreco());
			System.out.println("Valor total da compra: "+venda.getQuantidade() * produto.getPreco());
			System.out.println("Produtos restantes em estoque: "+ ((produto.getEstoque() - venda.getQuantidade())));
			
			System.out.println("Nome da rua: " + endereco.getRua());
			System.out.println("N? : " + endereco.getNumero());
			System.out.println("Bairro: " + endereco.getBairro());
			System.out.println("Cidade: " + endereco.getCidade());
			System.out.println("Celular comercial para contato: " + telefone.getCelular());
			System.out.println("Telefone comercial para contato: " + telefone.getTelefone());
			
		
		break;
		
		case 2: // Departamento jogos
			
			System.out.println("\t\t\t\t\t\tDADOS DA NOTA FISCAL DA LOJA: ");
			
			System.out.println("Qual seu nome? ");
			String nome2 = leitor.nextLine();
			venda.setCliente(leitor.nextLine());
			
			System.out.println("Qual jogo voc? quer comprar? ");
			String compra2 = leitor.nextLine();
			game.setPlataforma(compra2);
			
			System.out.println("Qual a quantidade que deseja comprar? ");
			int qtd2 = leitor.nextInt();
			venda.setQuantidade(qtd2);
			
			System.out.println("Quantidade no estoque ");
			int etq2 = leitor.nextInt();
			produto.setEstoque(etq2);
			
			System.out.println("O valor do produto: ");
			double valor2 = leitor.nextDouble();
			produto.setPreco(valor2);
			
			
			System.out.println("Nome do cliente: " + venda.getCliente());
			System.out.println("Nome do jogo: " + game.getPlataforma());
			System.out.println("Quantidade obtida: " + venda.getQuantidade());
			System.out.println("Pre?o pago pelo produto: " +"R$"+ produto.getPreco());
			System.out.println("Valor total da compra: "+ venda.getQuantidade() * produto.getPreco());
			System.out.println("Produtos restantes em estoque: "+ ((produto.getEstoque() - venda.getQuantidade())));
			
			System.out.println("Nome da rua: " + endereco.getRua());
			System.out.println("N? : " + endereco.getNumero());
			System.out.println("Bairro: " + endereco.getBairro());
			System.out.println("Cidade: " + endereco.getCidade());
			System.out.println("Celular comercial para contato: " + telefone.getCelular());
			System.out.println("Telefone comercial para contato: " + telefone.getTelefone());
			break;
			
		case 3:
			
			System.out.println("\t\t\t\t\t\tDADOS DA NOTA FISCAL DA LOJA: ");
			
			System.out.println("Qual seu nome? ");
			String nome3 = leitor.nextLine();
			venda.setCliente(leitor.nextLine());
			
			System.out.println("Qual computador ou notebook deseja comprar? ");
			String compra3 = leitor.nextLine();
			computador.setMarca(compra3);
			
			System.out.println("Qual a quantidade que deseja comprar? ");
			int qtd3 = leitor.nextInt();
			venda.setQuantidade(qtd3);
			
			System.out.println("Quantidade no estoque ");
			int etq3 = leitor.nextInt();
			produto.setEstoque(etq3);
			
			System.out.println("O valor do produto: ");
			double valor3 = leitor.nextDouble();
			produto.setPreco(valor3);
			
			
			System.out.println("Cliente: " + venda.getCliente());
			System.out.println("Nome da marca: " + computador.getMarca());
			System.out.println("Quantidade obtida: " + venda.getQuantidade());
			System.out.println("Pre?o pago pelo produto: " +"R$"+ produto.getPreco());
			System.out.println("Valor total da compra: " + venda.getQuantidade() * produto.getPreco());
			System.out.println("Produtos restantes em estoque: "+ ((produto.getEstoque() - venda.getQuantidade())));
			
			System.out.println("Nome da rua: " + endereco.getRua());
			System.out.println("N? : " + endereco.getNumero());
			System.out.println("Bairro: " + endereco.getBairro());
			System.out.println("Cidade: " + endereco.getCidade());
			System.out.println("Celular comercial para contato: " + telefone.getCelular());
			System.out.println("Telefone comercial para contato: " + telefone.getTelefone());
			break;
				
			default:
			System.out.println("Departamento n?o encontrado, programa encerrado, inicie novamente.");
			
		}
		
		leitor.close();
		
	}

}
