import javafx.application.*;
import javafx.scene.*;
import javafx.scene.shape.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.paint.*;
import javafx.stage.*;

public class DraftLogo extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		Pane myLogo = new Pane();
		
		Rectangle backRect = new Rectangle(75, 25, 25, 200);
		Ellipse midOval = new Ellipse(88, 125, 50, 75);
		Rectangle frontRect = new Rectangle(25, 100, 125, 50);
		
		Text logoName = new Text(26, 125, "Quill Programming");
		logoName.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 15));
		
		backRect.setFill(Color.GREEN);
		midOval.setFill(Color.LIGHTGREEN);
		frontRect.setFill(Color.DARKSEAGREEN);
		
		myLogo.getChildren().addAll(backRect, midOval, frontRect, logoName);
		
		Scene scene = new Scene(myLogo, 175, 250);
		primaryStage.setTitle("NFL draft logo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main (String[] args) {
		launch(args);
	}
	
}
