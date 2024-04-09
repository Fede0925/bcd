package bcd;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class bcdMazzettiFederico extends Application{
	TextField tNumero = new TextField();
	Button calcola = new Button("converti");
	Label lRis = new Label();
	public void start(Stage finestra) {
		GridPane griglia = new GridPane();
		Scene scena = new Scene(griglia);
		
		griglia.add(tNumero, 0, 0);
		griglia.add(calcola, 0, 1);
		griglia.add(lRis, 0, 2);
		
		calcola.setOnAction(e->calcola());
		
		finestra.setScene(scena);
		finestra.setTitle("bcd");
		finestra.show();
	}
	private void calcola() {
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
