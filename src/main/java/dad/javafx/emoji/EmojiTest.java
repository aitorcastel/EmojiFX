package dad.javafx.emoji;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class EmojiTest extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		TextField textfield = new TextField(); 		
		textfield.setText("Hola emoji 😄👍😰");
		primaryStage.setScene(new Scene(new StackPane(textfield)));
		
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
		
	}

}
