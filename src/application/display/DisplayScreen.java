package application.display;

import application.data.DataStorage;
import application.logic.Factor;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/*
 * filename: DisplayScreen
 * Author: Angelo Barcelona
 * intent: create a display for FactorIt
 */
public class DisplayScreen {
	
	
	private static final int WIDTH = 400;
	private static final int HEIGHT = 400;
	
	Group root;
	Group background;
	Button submitButton;
	Scene scene;
	Image img = new Image("/resources/planet.png");
	ImageView iV = new ImageView();
	TextField textField;
	Text factoredNumber;
	Text factoredNumbers;
	
	//no arg constructor
	public DisplayScreen(){
			initDisplay();
			createDisplay();
	}
	
	//initializes display objects
	public void initDisplay(){
		root = new Group();
		background = new Group();
		
		factoredNumber = new Text();
		
		factoredNumber.setTranslateX(170);
		factoredNumber.setTranslateY(125);
		factoredNumber.setStrokeWidth(5);
		factoredNumber.setFont(Font.font("New Times Roman", FontWeight.BOLD,55));
		factoredNumber.setStroke(Color.WHITE);
		
		iV.setImage(img);
		background.getChildren().add(iV);
		
		factoredNumbers = new Text();
		factoredNumbers.setTranslateX(10);
		factoredNumbers.setTranslateY(300);
		factoredNumbers.setStroke(Color.WHITE);
		factoredNumbers.setStrokeWidth(1);
		factoredNumbers.setFont(Font.font(null, FontWeight.BOLD, 25));
		
		submitButton = new Button("Submit");
		submitButton.setTranslateX(175);
		submitButton.setTranslateY(200);
		submitButton.setOnAction(e->{
			DataStorage.factoredList.clear();
			factoredNumber.setText(textField.getText());
			Factor.factor(Long.parseLong(textField.getText()));
			textField.clear();
			String numbers = "";
			for(long i : DataStorage.factoredList){
				factoredNumbers.setText(numbers = numbers + i + " ");
			}
			root.getChildren().add(factoredNumbers);
					
		});
		
		textField = new TextField();
		textField.setPromptText("Enter Number");
		textField.setTranslateX(155);
		textField.setTranslateY(170);
		textField.setPrefWidth(100);
		textField.setPrefHeight(20);
		textField.setAlignment(Pos.CENTER);
		
		
	
		
		scene = new Scene(root, WIDTH, HEIGHT);
	}
	
	//creates the display
	public void createDisplay(){
		
		root.getChildren().addAll(background, submitButton, textField, factoredNumber);
		
	}
	
	//returns a scene
	public Scene getScene(){
		return scene;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
