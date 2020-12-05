package br.com.aps20202.at1.view;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

	private Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		initLogin();
	}

	public void initLogin() {
		try {
			// Carregar a tela de login.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("Menu.fxml"));
			BorderPane login = (BorderPane) loader.load();
			// Mostra a scene (ce na) contendo a tela de login.
			Scene scene = new Scene(login);
			// Dá ao controlador acesso à the main.
			primaryStage.setScene(scene);
			primaryStage.setMinHeight(450);
			primaryStage.setMinWidth(600);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
