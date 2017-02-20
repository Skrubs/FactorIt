package application;
	
import application.display.DisplayScreen;
import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {
	
	Stage window;
	DisplayScreen displayscreen;
	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
		displayscreen = new DisplayScreen();
		window.setScene(displayscreen.getScene());
		window.setResizable(false);
		window.setTitle("FactorIt version 0.1");
		window.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
