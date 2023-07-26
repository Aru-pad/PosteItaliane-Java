package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;


@SuppressWarnings("restriction")
public class Main extends Application {

	public PosteController controller;
	Sportello1 Sportello1;
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("PosteIta_Project.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			primaryStage.setTitle("Totem");
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
			controller = loader.<PosteController>getController();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try
		{
			Sportello1 = new Sportello1();
			Thread thSportello1 = new Thread(Sportello1);
			
			thSportello1.start();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		/*try
		{
			Dispenser dispenser = new Dispenser(this,Sportello1);
			Thread thDispenser = new Thread(dispenser);
			
			thDispenser.start();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			*/
	}

	public static void main(String[] args) {
		Sportello1 sportello1 = new Sportello1();
		launch(args);
	}
}
