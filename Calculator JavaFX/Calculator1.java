import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator1 extends Application {
private TextField tf1 = new TextField();
private TextField tf2 = new TextField();
private TextField tf3 = new TextField();
private Button Addition = new Button("Addition");
private Button Subtraction = new Button("Subtraction");
private Button Multiplication= new Button("Multiplication");
private Button Division = new Button("Division");
private Button Concatenate = new Button("Concatenate");
private Button Exit = new Button("Exit");

@Override

public void start(Stage Stage) throws Exception {

// Create UI

GridPane pane = new GridPane();

pane.setVgap(5);

pane.setHgap(15);

pane.add(new Label("Enter First Number"), 0, 0);
pane.add(tf1, 1, 0);
pane.add(new Label("Enter Second Number"), 0, 1);
pane.add(tf2, 1, 1);

pane.add(new Label("Result"), 0, 2);
pane.add(tf3, 1, 2);
pane.add(Addition, 0, 3);
pane.add(Subtraction, 1, 3);
pane.add(Multiplication, 0, 4);
pane.add(Division, 1, 4);
pane.add(Concatenate, 0, 5);
pane.add(Exit, 1, 5);

// Set UI properties

pane.setAlignment(Pos.CENTER);
tf1.setAlignment(Pos.BOTTOM_RIGHT);
tf2.setAlignment(Pos.BOTTOM_RIGHT);
tf3.setAlignment(Pos.BOTTOM_RIGHT);
tf3.setEditable(false);

Addition.setPrefWidth(100);
Subtraction.setPrefWidth(100);
Multiplication.setPrefWidth(100);
Division.setPrefWidth(100);
Concatenate.setPrefWidth(100);

Exit.setPrefWidth(100);

pane.setHalignment(Addition, HPos.CENTER);
pane.setHalignment(Subtraction, HPos.CENTER);
pane.setHalignment(Multiplication, HPos.CENTER);
pane.setHalignment(Division, HPos.CENTER);
pane.setHalignment(Concatenate, HPos.CENTER);
pane.setHalignment(Exit, HPos.CENTER);
pane.setPadding(new Insets(20, 20, 20, 20));

// Button clicks handle events

Addition.setOnAction(e -> Add());
Subtraction.setOnAction(e -> Subtract());
Multiplication.setOnAction(e -> Multiply());
Division.setOnAction(e -> Divide());
Concatenate.setOnAction(e -> Concatenate());
Exit.setOnAction(e -> Exit());

// Create a scene and place it in the stage

Scene scene = new Scene(pane);
Stage.setTitle("My Calculator"); // Set the stage title
Stage.setScene(scene); // Place the scene in the stage
Stage.show(); // Display the stage

}

private void Add() {
int n1=Integer.parseInt(tf1.getText());
int n2=Integer.parseInt(tf2.getText());
int result=n1+n2;
tf3.setText(String.valueOf(result));

}

private void Subtract() {
int n1=Integer.parseInt(tf1.getText());
int n2=Integer.parseInt(tf2.getText());
int result=n1-n2;
tf3.setText(String.valueOf(result));

}

private void Multiply() {
int n1=Integer.parseInt(tf1.getText());
int n2=Integer.parseInt(tf2.getText());
int result=n1*n2;
tf3.setText(String.valueOf(result));

}

private void Divide() {
int n1=Integer.parseInt(tf1.getText());
int n2=Integer.parseInt(tf2.getText());
int result=n1/n2;
tf3.setText(String.valueOf(result));

}

private void Concatenate() {
String result=tf1.getText()+" "+tf2.getText();
tf3.setText(String.valueOf(result));
}

private void Exit() {
Platform.exit();
}

public static void main(String[] args) {
Application.launch(args);
}

}