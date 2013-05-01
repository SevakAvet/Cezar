package com.sevak_avet.GUI;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import com.sevak_avet.Cryption.DecryptionCezar;

public class DecryptionFrame extends Application implements EventHandler<MouseEvent>{

	private static TextField inputField;
	//private static TextField fieldShift;
	private static TextArea outputArea;
	private static Button btn;
	
	private static int width = CONST.WIDTH.getSize();
	private static int height = CONST.HEIGHT.getSize();
	
	@Override
	public void start(Stage stage) throws Exception {
		Group root = new Group();
		Scene scene = new Scene(root, width, height);
		
		inputField = new TextField();
		root.getChildren().add(inputField);
		inputField.setMinWidth(width - 10);
		inputField.setLayoutX(10);
		inputField.setLayoutY(10);
		
		/*fieldShift = new TextField();
		root.getChildren().add(fieldShift);
		fieldShift.setLayoutX(width - 40);
		fieldShift.setLayoutY(10);
		fieldShift.setMaxWidth(40);*/
		
		
		outputArea = new TextArea();
		root.getChildren().add(outputArea);	
		outputArea.setEditable(false);
		outputArea.setMaxWidth(width - 10);
		outputArea.setMinHeight(height - 70);
		outputArea.setLayoutX(10);
		outputArea.setLayoutY(40);
		
		btn = new Button("Decrypt");
		root.getChildren().add(btn);
		btn.setLayoutX(width - 65);
		btn.setLayoutY(height - 20);
		
		stage.setTitle(CONST.VERSION_DECRYPT.getVersion());
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
		
		btn.setOnMouseClicked(this);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	//Обработчик кнопки, кодирующей текст
	@Override
	public void handle(MouseEvent arg0) {
		String input = inputField.getText();
		int k = 7;
		
		DecryptionCezar dec = new DecryptionCezar(input, k);
		outputArea.setText(dec.getDecText());			
	}

}
