package br.com.aps.at1.view;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import br.com.aps.at1.model.Produto;
import br.com.aps.at1.model.RevendaComArray;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ControleMenu {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private TableView<Produto> tbProdutos;

	@FXML
	private TableColumn<Produto, String> cDescricao;

	@FXML
	private TableColumn<Produto, Double> cValor;

	@FXML
	private TableColumn<Produto, Double> cCusto;

	@FXML
	private TableColumn<Produto, Double> cMargem;

	@FXML
	private TableColumn<Produto, Integer> cQuantidade;

	@FXML
	private TableColumn<Produto, Integer> cCodigo;

	@FXML
	private TextField tfCodigo;

	@FXML
	private TextField tfDescricao;

	@FXML
	private TextField tfValorCompra;

	@FXML
	private TextField tfCusto;

	@FXML
	private TextField tfMargem;

	@FXML
	private TextField tfQuantidade;

	@FXML
	private void btAdicionar() {
		RevendaComArray revenda = new RevendaComArray();
		String des = tfDescricao.getText();
		int codigo = Integer.parseInt(tfCodigo.getText());
		int quantidade = Integer.parseInt(tfQuantidade.getText());
		double custo = Double.parseDouble(tfCusto.getText());
		double margem = Double.parseDouble(tfMargem.getText());
		double valor = Double.parseDouble(tfValorCompra.getText());
		Produto produto = new Produto(codigo, quantidade, des, valor, custo, margem);
		revenda.inserirProduto(produto);
	}

	@FXML
	void btAlterar(ActionEvent event) {

	}

	@FXML
	void btConsultar(ActionEvent event) {

	}

	@FXML
	void btListar(ActionEvent event) {

	}

	@FXML
	void initialize() {
		String numero;
		numero = JOptionPane.showInputDialog(null, " Entre com o numero: ");
		int num = Integer.parseInt(numero); // Converte String em Int
		RevendaComArray revenda = new RevendaComArray(num);
	}
}
