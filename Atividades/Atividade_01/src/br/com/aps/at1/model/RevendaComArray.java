package br.com.aps.at1.model;

public class RevendaComArray {
	private Produto[] produtos;
	private int indice = 0;

	public Produto[] getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}

	public RevendaComArray() {
		// TODO Auto-generated constructor stub
	}

	public RevendaComArray(int quantdidade) {
		produtos = new Produto[quantdidade];
	}

	public void inserirProduto(Produto produto) {
		if (indice < produtos.length) {
			produtos[indice++] = produto;
			System.out.print("\n" + produto + "\n");
		} else
			System.out.println("Error, array cheio.");
	}

	public void comprar(int codigo, int quantidade) {
		Produto produto = null;
		try {
			for (int i = 0; i < produtos.length; i++) {
				produto = produtos[i];
				if (produto.getCodigo() == codigo) {
					produto.compra(quantidade);
					return;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Error, produto inexistente.");
	}

	public void vender(int codigo, int quantidade) {
		Produto produto = null;
		try {
			for (int i = 0; i < produtos.length; i++) {
				produto = produtos[i];
				if (produto.getCodigo() == codigo) {
					produto.venda(quantidade);
					return;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Error, produto inexistente.");
	}

	public void consultaPreco(int codigo) {
		Produto produto = null;
		try {
			for (int i = 0; i < produtos.length; i++) {
				produto = produtos[i];
				if (produto.getCodigo() == codigo) {
					System.out.println("Valor: " + produto.calculaPrecoVenda());
					return;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Error, produto inexistente.");
	}

	public void listaPreco() {
		try {
			for (int i = 0; i < produtos.length; i++) {
				Produto produto = produtos[i];
				if (produto != null)
					System.out.println("Código: " + produto.getCodigo() + ", Descição: " + produto.getDescricao()
							+ ", Valor: " + produto.calculaPrecoVenda());
			}
		} catch (Exception e) {
			System.out.println("Error, produtos inexistentes.");
		}
	}

	public int listar(int codigo) {
		Produto produto = null;
		try {
			for (int i = 0; i < produtos.length; i++) {
				produto = produtos[i];
				if (produto.getCodigo() == codigo) {
					return i;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Error, produto inexistente.");
		return -1;
	}

	public void alterar(int i, Produto pro) {
		produtos[i] = pro;
	}
}
