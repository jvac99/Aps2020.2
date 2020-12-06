package br.com.aps.at1.view;

import java.util.Scanner;

import br.com.aps.at1.model.Produto;
import br.com.aps.at1.model.RevendaComArray;
// João Victor Aquino Correia - 470914.
public class teste {

	private static Scanner tc;

	public static void main(String[] args) {
		int tam, codigo, quantidade;
		double custo, margem, valor;
		tc = new Scanner(System.in);
		System.out.println("Digite o tamanho do array!");
		tam = tc.nextInt();
		if (tam > 0) {
			boolean j = true;
			RevendaComArray revenda = new RevendaComArray(2);
			while (j) {
				System.out.println("***************************************\n" + "Digite 0 para finalizar o programa.\n"
						+ "Digite 1 para inserir.\n" + "Digite 2 para alterar.\n"
						+ "Digite 3 para consultar os preços.\n" + "Digite 4 para Listar os preços.\n"
						+ "Digite 5 para comprar.\n" + "Digite 6 para vender.\n"
						+ "***************************************\n");
				int key = tam = tc.nextInt();
				switch (key) {
				case 0:
					j = false;
					break;
				case 1:
					System.out.print("Digite o código do produto: ");
					codigo = tc.nextInt();
					System.out.print("Digite a Descrição do produto: ");
					String des = tc.next();
					System.out.print("Digite a quantidade do produto: ");
					quantidade = tc.nextInt();
					System.out.print("Digite o custo do produto: ");
					custo = tc.nextDouble();
					System.out.print("Digite a margem de lucro do produto: ");
					margem = tc.nextDouble();
					System.out.print("Digite o valor do produto: ");
					valor = tc.nextDouble();
					Produto produto = new Produto(codigo, quantidade, des, valor, custo, margem);
					revenda.inserirProduto(produto);
					break;

				case 2:
					System.out.print("Digite o código do produto: ");
					codigo = tc.nextInt();
					Produto pro = null;
					int i = revenda.listar(codigo);
					if (i != -1) {
						Produto[] produtos = revenda.getProdutos();
						pro = produtos[i];
						boolean k = true;
						while (k) {
							System.out.println("***************************************\n" + "Digite 0 para cancelar"
									+ "Digite 1 para salvar.\n" + "Digite 2 para mudar o código.\n"
									+ "Digite 2 para mudar a descrição.\n"
									+ "Digite 4 para mudar a quantidade de produtos.\n"
									+ "Digite 5 para mudar o custo do produto.\n"
									+ "Digite 6 para mudar a margem de lucro do produto.\n"
									+ "Digite 7 para mudar o valor do produto.\n"
									+ "***************************************\n");
							int opc = tam = tc.nextInt();

							switch (opc) {
							case 0:
								k = false;
								break;
							case 1:
								revenda.alterar(i, pro);
								k = false;
								break;
							case 2:
								System.out.print("Digite o código do produto: ");
								codigo = tc.nextInt();
								pro.setCodigo(codigo);
								break;
							case 3:
								System.out.print("Digite a Descrição do produto: ");
								des = tc.next();
								pro.setDescricao(des);
								break;
							case 4:
								System.out.print("Digite a quantidade do produto: ");
								quantidade = tc.nextInt();
								pro.setQtdEstoque(quantidade);
								break;
							case 5:
								custo = tc.nextDouble();
								System.out.print("Digite a margem de lucro do produto: ");
								pro.setCusto(custo);
								break;
							case 6:
								margem = tc.nextDouble();
								System.out.print("Digite o valor do produto: ");
								pro.setMargem(margem);
								break;
							case 7:
								System.out.print("Digite o valor do produto: ");
								valor = tc.nextDouble();
								pro.setValorCompra(valor);
								break;
							default:
								break;
							}
						}
					}
					break;
				case 3:
					System.out.print("Digite o código do produto: ");
					codigo = tc.nextInt();
					revenda.consultaPreco(codigo);
					break;
				case 4:
					revenda.listaPreco();
					break;
				case 5:
					System.out.print("Digite o código do produto: ");
					codigo = tc.nextInt();
					System.out.print("Digite a quantidade do produto: ");
					quantidade = tc.nextInt();
					revenda.comprar(codigo, quantidade);
					break;
				case 6:
					System.out.print("Digite o código do produto: ");
					codigo = tc.nextInt();
					System.out.print("Digite a quantidade do produto: ");
					quantidade = tc.nextInt();
					revenda.vender(codigo, quantidade);
					break;

				default:
					break;
				}

			}
		}
		System.out.print("Até mais.");
	}

}
