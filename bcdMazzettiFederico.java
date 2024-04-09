package bcd;

import java.util.Dictionary;
import java.util.Hashtable;

import javafx.application.Application;
import javafx.geometry.Insets;
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
	Dictionary dNumeri = new Hashtable();
	
	public void start(Stage finestra) {
		GridPane griglia = new GridPane();
		Scene scena = new Scene(griglia);
		
		griglia.setPadding(new Insets(10));
		griglia.setHgap(10);
		griglia.setVgap(10);
		griglia.add(tNumero, 0, 0);
		griglia.add(calcola, 0, 1);
		griglia.add(lRis, 0, 2);
		dNumeri.put("0", "0000");
		dNumeri.put("1", "0001");
		dNumeri.put("2", "0010");
		dNumeri.put("3", "0011");
		dNumeri.put("4", "0100");
		dNumeri.put("5", "0101");
		dNumeri.put("6", "0110");
		dNumeri.put("7", "0111");
		dNumeri.put("8", "1000");
		dNumeri.put("9", "1001");
		dNumeri.put("10", "1010");
		dNumeri.put("11", "1011");
		dNumeri.put("12", "1100");
		dNumeri.put("13", "1101");
		dNumeri.put("14", "1110");
		dNumeri.put("15", "1111");
		
		calcola.setOnAction(e->calcola());
		
		finestra.setScene(scena);
		finestra.setTitle("bcd");
		finestra.show();
	}
	private void calcola() {
		String numero = tNumero.getText();
		String array[] = numero.split("");
		String risultato = "";
		
		for(int i=0; i<array.length ; i++) {
			array[i]= (String) dNumeri.get(array[i]);
		}
		
		for(int i=0; i<array.length ; i++) {
			risultato += array[i] + "  ";
		}
		
		lRis.setText(risultato);
	}
	public static void main(String[] args) {
		launch(args);
	}
}
