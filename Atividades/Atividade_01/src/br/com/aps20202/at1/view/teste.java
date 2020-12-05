package br.com.aps20202.at1.view;

import br.com.aps20202.at1.model.Produto;
import br.com.aps20202.at1.model.RevendaComArray;

public class teste {

	public static void main(String[] args) {
		RevendaComArray revenda = new RevendaComArray(2);
		revenda.inserirProduto(new Produto(1, 1, "arroz", 10, 5, 2));
		revenda.inserirProduto(new Produto(2, 1, "arroz", 10, 5, 2));
		revenda.comprar(1, 2);
		revenda.vender(1, 1);
		revenda.listaPreco(1, 1);
		revenda.consultaPreco(1);
	}

}
