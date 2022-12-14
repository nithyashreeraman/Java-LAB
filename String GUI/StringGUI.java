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
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StringGUI extends Application {
private TextField t1 = new TextField();
private TextField t2 = new TextField();
private TextField t3 = new TextField();
private Button Length = new Button("Length");
private Button copy = new Button("Copy");
private Button con= new Button("Concatenate");
private Button com = new Button("Compare");



@Override

public void start(Stage primaryStage) {


 primaryStage.setTitle("JavaFX Welcome");
GridPane grid = new GridPane();

grid.setVgap(10);

grid.setHgap(10);
 grid.setPadding(new Insets(25, 25, 25, 25));

 Label n1=new Label("Enter first String");
grid.add(n1, 0, 0);
grid.add(t1, 1, 0);
Label n2=new Label("Enter next(if NEEDED)");
grid.add(n2, 0, 1);
grid.add(t2, 1, 1);

Label r=new Label("Result");
grid.add(r, 0, 2);

grid.add(t3, 1, 2);
grid.add(Length, 0, 3);
grid.add(copy, 1, 3);
grid.add(con, 0, 4);
grid.add(com, 1, 4);



Length.setOnAction(e -> length());
copy.setOnAction(e -> copy());
con.setOnAction(e -> con());
com.setOnAction(e -> com());



Scene scene = new Scene(grid);

primaryStage.setTitle("GUI STRING OPERATION"); // Set the stage title
primaryStage.setScene(scene); // Place the scene in the stage
primaryStage.show(); // Display the stage

}

private void length() {
String s=t1.getText();
 
 int k = s.length();
 t3.setText("Length= " + String.valueOf(k));

}

private void copy() {

 String s =t1.getText();
t3.setText("Copied String= " + s);

}

private void con() {

 String s1 =t1.getText();
 String s2 =t2.getText();
 String s3 = s1+s2;

 t3.setText(s3);


}

private void com() {

 String s1=t1.getText();
 String s2=t2.getText();
 int a = s1.length();
 int b = s2.length();
 String c;
 if (a>b){
     c="1st is longer";
 }
 else if (a<b){
     c="2nd is longer";
 }
 else{
     c="Both are equal";
 }
 t3.setText(c);


}



public static void main(String[] args) {
Application.launch(args);
}

}

