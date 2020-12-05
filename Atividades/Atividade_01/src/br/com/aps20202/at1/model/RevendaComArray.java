package br.com.aps20202.at1.model;

public class RevendaComArray {
	private Produto[] produtos;
	private int indice = 0;

	public RevendaComArray() {
		// TODO Auto-generated constructor stub
	}

	public RevendaComArray(int quantdidade) {
		produtos = new Produto[quantdidade];
	}

	public void inserirProduto(Produto produto) {
		if (indice < produtos.length)
			produtos[indice++] = produto;
		else
			System.out.println("Error, array cheio.");
	}

	public void comprar(int codigo, int quantidade) {
		Produto produto = null;
		for (int i = 0; i < produtos.length; i++) {
			produto = produtos[i];
			if (produto.getCodigo() == codigo) {
				produto.compra(quantidade);
				return;
			}
		}
		System.out.println("Error, produto inexistente");
	}

	public void vender(int codigo, int quantidade) {
		Produto produto = null;
		for (int i = 0; i < produtos.length; i++) {
			produto = produtos[i];
			if (produto.getCodigo() == codigo) {
				produto.venda(quantidade);
				return;
			}
		}
		System.out.println("Error, produto inexistente");
	}

	public void consultaPreco(int codigo) {
		Produto produto = null;
		for (int i = 0; i < produtos.length; i++) {
			produto = produtos[i];
			if (produto.getCodigo() == codigo) {
				System.out.println("Valor: " + produto.calculaPrecoVenda());
				return;
			}
		}
		System.out.println("Error, produto inexistente");
	}

	public void listaPreco(int codigo, int quantidade) {
		for (int i = 0; i < produtos.length; i++) {
			Produto produto = produtos[i];
			System.out.println("Código: "+produto.getCodigo()+", Descição: "+produto.getDescricao()+", Valor: " + produto.calculaPrecoVenda());	
		}
	}
}
