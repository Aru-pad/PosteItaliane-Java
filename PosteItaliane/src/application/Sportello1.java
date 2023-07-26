package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

@SuppressWarnings("restriction")
public class Sportello1 extends Application implements Runnable {
	public Sportello1Controller controller;
		public void start(Stage primaryStage) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("Sportello1.fxml"));
				Parent root = loader.load();
				Scene scene = new Scene(root);
				primaryStage.setScene(scene);
				primaryStage.show();
				controller = loader.<Sportello1Controller>getController();
			} catch(Exception e) {
				e.printStackTrace();
			}
}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
}