package br.com.aps20202.at1.model;

public class Produto {
	// Declaração de variaveis.
	private int codigo, qtdEstoque;
	private String descricao;
	private double valorCompra, custo, margem;

	// Construtor sem parametro.
	public Produto() {

	}

	// Construtor com parametro codigo e descricao.
	public Produto(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	// Construtor com parametro codigo, descricao, valor da compra, custo e margem.
	public Produto(int codigo, String descricao, double valorCompra, double custo, double margem) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valorCompra = valorCompra;
		this.custo = custo;
		this.margem = margem;
	}

	/*
	 * Construtor com parametro codigo, quantidade de estoque, descricao, valor da
	 * compra, custo e margem.
	 */
	public Produto(int codigo, int qtdEstoque, String descricao, double valorCompra, double custo, double margem) {
		this.codigo = codigo;
		this.qtdEstoque = qtdEstoque;
		this.descricao = descricao;
		this.valorCompra = valorCompra;
		this.custo = custo;
		this.margem = margem;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getMargem() {
		return margem;
	}

	public void setMargem(double margem) {
		this.margem = margem;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public void compra(int quant) {
		this.qtdEstoque += quant;
	}

	public void venda(int quant) {
		if (quant <= this.qtdEstoque)
			this.qtdEstoque -= quant;
		else
			System.out.println("Error, estoque insuficiente.");
	}

	public double calculaPrecoVenda() {
		return valorCompra + custo + margem * (valorCompra + custo);
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", qtdEstoque=" + qtdEstoque + ", descricao=" + descricao
				+ ", valorCompra=" + valorCompra + ", custo=" + custo + ", margem=" + margem + "]";
	}

}
