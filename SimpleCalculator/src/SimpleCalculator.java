/**
 * Objective: Create a simple calculator with basic arithmetic operations and a square root function.
 * 
 * Created by: Gavin Guyote
 * Date: 7/11/2024
 * Version: 1.0
 */


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class SimpleCalculator extends Application {

	public void start(Stage primaryStage) {
		FlowPane pane = new FlowPane();
		pane.setHgap(2);
		
		TextField tfNumber1 = new TextField();
		TextField tfNumber2 = new TextField();
		TextField tfResult = new TextField();
		TextField tfSqrtResult = new TextField();
		
		tfNumber1.setPrefColumnCount(3);
		tfNumber2.setPrefColumnCount(3);
		tfResult.setPrefColumnCount(3);
		tfSqrtResult.setPrefColumnCount(3);
		
		pane.getChildren().addAll(new Label("Number 1"), tfNumber1, new Label("Number 2"), tfNumber2, new Label("Result"), tfResult, new Label("Square Root of Result"), tfSqrtResult); 
		
		HBox hBox = new HBox(5);
		Button btAdd = new Button("Add");
		Button btSubtract = new Button("Subtract");
		Button btMultiply = new Button("Multiply");
		Button btDivide = new Button("Divide");
		Button btSqRt = new Button("Square Root");
		
		hBox.setAlignment(Pos.CENTER);
		hBox.getChildren().addAll(btAdd, btSubtract, btMultiply, btDivide, btSqRt);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(pane);
		borderPane.setBottom(hBox);
		
		Scene scene = new Scene(borderPane, 550, 150);
		primaryStage.setTitle("Simple Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		btAdd.setOnAction(e -> {
			tfResult.setText(Double.parseDouble(tfNumber1.getText()) + 
					Double.parseDouble(tfNumber2.getText()) + "");
		});
		btSubtract.setOnAction(e -> {
			tfResult.setText(Double.parseDouble(tfNumber1.getText()) - 
					Double.parseDouble(tfNumber2.getText()) + "");
		});
		btMultiply.setOnAction(e -> {
			tfResult.setText(Double.parseDouble(tfNumber1.getText()) * 
					Double.parseDouble(tfNumber2.getText()) + "");
		});
		btDivide.setOnAction(e -> {
			tfResult.setText(Double.parseDouble(tfNumber1.getText()) / 
					Double.parseDouble(tfNumber2.getText()) + "");
		});
		btSqRt.setOnAction(e -> {
			double currentResult = Double.parseDouble(tfResult.getText());
			double sqrtResult = Math.sqrt(currentResult);
			tfSqrtResult.setText(Double.toString(sqrtResult));
		});
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
}
