package application;


import java.util.ServiceLoader;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
public class Main extends Application {
	 
	
	public Main() {
		
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader=new FXMLLoader();
			loader.setLocation(Main.class.getResource("MainWindow.fxml"));
			
			BorderPane root = (BorderPane) loader.load();
			Scene scene = new Scene(root);
			
			primaryStage.setScene(scene);
			primaryStage.setMaximized(true);
			primaryStage.setTitle("TraderAI");
			primaryStage.show();
           
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	 
	ServiceLoader <interfacemodule.iViewWindow> iViewWindow =
    ServiceLoader.load(interfacemodule.iViewWindow.class);
	
	
	       
	 
	
	@FXML 
	private void QuitApplication() {
		System.exit(1);
	}
}