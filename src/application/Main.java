package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	Stage window;
	
	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
