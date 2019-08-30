package exam02;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMain extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent login = FXMLLoader.load(getClass().getResource("Image.fxml"));
		Scene scene = new Scene(login);
		
		primaryStage.setTitle("JavaFX");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);

	}


}
