import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Optional;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class samemenu extends Application{
 void onadd()
 {
 //Reading first input for addition
 TextInputDialog ip1 = new TextInputDialog();
 ip1.setHeaderText("Give your input....");
 ip1.setContentText("Enter an integer ");
 Optional<String> val1 = ip1.showAndWait();
 //Reading second input for addition
 TextInputDialog ip2 = new TextInputDialog();
 ip2.setHeaderText("Give your input....");
 ip2.setContentText("Enter an integer ");
 Optional<String> val2 = ip2.showAndWait();
 //Converting string to int
 int i1=Integer.parseInt(val1.get());
 int i2=Integer.parseInt(val2.get());
 //Displaying sum
 Alert alert = new Alert(AlertType.INFORMATION);
 alert.setHeaderText("The result is...");
 alert.setContentText("Sum of the inputs is "+(i1+i2));
 alert.showAndWait();
 }

 void onsub()
 {
 //Reading first input for difference
 TextInputDialog ip1 = new TextInputDialog();
 ip1.setHeaderText("Give your input....");
 ip1.setContentText("Enter an integer ");
 Optional<String> val1 = ip1.showAndWait();
 //Reading second input for difference
 TextInputDialog ip2 = new TextInputDialog();
 ip2.setHeaderText("Give your input....");
 ip2.setContentText("Enter an integer ");
 Optional<String> val2 = ip2.showAndWait();
 //Converting string to int
 int i1=Integer.parseInt(val1.get());
 int i2=Integer.parseInt(val2.get());
 //Displaying diff
 Alert alert = new Alert(AlertType.INFORMATION);
 alert.setHeaderText("The result is...");
 alert.setContentText("Difference of the inputs is "+(i1-i2));
 alert.showAndWait();
 }

 void onmul()
 {
 //Reading first input for multiplication
 TextInputDialog ip1 = new TextInputDialog();
 ip1.setHeaderText("Give your input....");
 ip1.setContentText("Enter an integer ");
 Optional<String> val1 = ip1.showAndWait();
 //Reading second input for multiplication
 TextInputDialog ip2 = new TextInputDialog();
 ip2.setHeaderText("Give your input....");
 ip2.setContentText("Enter an integer ");
 Optional<String> val2 = ip2.showAndWait();
 //Converting string to int
 int i1=Integer.parseInt(val1.get());
 int i2=Integer.parseInt(val2.get());
 //Displaying mul
 Alert alert = new Alert(AlertType.INFORMATION);
 alert.setHeaderText("The result is...");
 alert.setContentText("Multiplication of the inputs is "+(i1*i2));
 alert.showAndWait();
 }

 void ondiv()
 {
 //Reading first input for division
 TextInputDialog ip1 = new TextInputDialog();
 ip1.setHeaderText("Give your input....");
 ip1.setContentText("Enter an integer ");
 Optional<String> val1 = ip1.showAndWait();
 //Reading second input for division
 TextInputDialog ip2 = new TextInputDialog();
 ip2.setHeaderText("Give your input....");
 ip2.setContentText("Enter an integer ");
 Optional<String> val2 = ip2.showAndWait();
 //Converting string to int
 int i1=Integer.parseInt(val1.get());
 int i2=Integer.parseInt(val2.get());
 //Displaying division
 Alert alert = new Alert(AlertType.INFORMATION);
 alert.setHeaderText("The result is...");
 alert.setContentText("Division of the inputs is "+(i1/i2));
 alert.showAndWait();
 }


 void oncopy()
 {
 //Reading the string to copy
 TextInputDialog ip1 = new TextInputDialog();
 ip1.setHeaderText("Give your String");
 ip1.setContentText("Enter an String ");
 Optional<String> val1 = ip1.showAndWait();
 String p = val1.get();
 Alert alert = new Alert(AlertType.INFORMATION);
 alert.setHeaderText("The result is...");
 alert.setContentText("String copied is "+ p);
 alert.showAndWait();
 }

 void onlen()
 {
 //Reading the string to copy
 TextInputDialog ip1 = new TextInputDialog();
 ip1.setHeaderText("Give your String");
 ip1.setContentText("Enter an String ");
 Optional<String> val1 = ip1.showAndWait();
 String p = val1.get();
 int k = p.length();
 Alert alert = new Alert(AlertType.INFORMATION);
 alert.setHeaderText("The result is...");
 alert.setContentText("String length is "+ k);
 alert.showAndWait();
 }

 void onconat()
 {
 //Reading first string
 TextInputDialog ip1 = new TextInputDialog();
 ip1.setHeaderText("Give your String");
 ip1.setContentText("Enter an String ");
 Optional<String> val1 = ip1.showAndWait();
 //Reading second string
 TextInputDialog ip2 = new TextInputDialog();
 ip2.setHeaderText("Give your String");
 ip2.setContentText("Enter an String ");
 Optional<String> val2 = ip2.showAndWait();
 //Converting string to int
 String i1=val1.get();
 String i2=val2.get();
 String s = i1+i2;
 //Displaying concatenation
 Alert alert = new Alert(AlertType.INFORMATION);
 alert.setHeaderText("The result is...");
 alert.setContentText("After Concatenation "+ s);
 alert.showAndWait();
 }

 void oncompare()
 {
 //Reading first string
 TextInputDialog ip1 = new TextInputDialog();
 ip1.setHeaderText("Give your String");
 ip1.setContentText("Enter an String ");
 Optional<String> val1 = ip1.showAndWait();
 //Reading second string
 TextInputDialog ip2 = new TextInputDialog();
 ip2.setHeaderText("Give your String");
 ip2.setContentText("Enter an String ");
 Optional<String> val2 = ip2.showAndWait();
 //Converting string to int
 String i1=val1.get();
 String i2=val2.get();
 int a = i1.length();
 int b = i2.length();
 String c = a>b? "First String is longer" : "Second String is Longer";
 //Displaying concatenation
 Alert alert = new Alert(AlertType.INFORMATION);
 alert.setHeaderText("The result is...");
 alert.setContentText("After Comaparing the length "+ c);
 alert.showAndWait();
 }


 @Override
 public void start(Stage primaryStage) {
 MenuBar menubar = new MenuBar();
 Menu number = new Menu("Number");
 MenuItem add = new MenuItem("Addition");
 add.setOnAction(actionEvent -> this.onadd());
 MenuItem sub = new MenuItem("Subtraction");
 sub.setOnAction(actionEvent -> this.onsub());
 MenuItem mul = new MenuItem("Multiplication");
 mul.setOnAction(actionEvent -> this.onmul());
 MenuItem div = new MenuItem("Division");
 div.setOnAction(actionEvent -> this.ondiv());
 number.getItems().addAll(add,sub,mul,div);

 Menu str = new Menu("String");
 MenuItem copy = new MenuItem("Copy");
 copy.setOnAction(actionEvent -> this.oncopy());
 MenuItem len = new MenuItem("Length");
 len.setOnAction(actionEvent -> this.onlen());
 MenuItem concat = new MenuItem("Concatenate");
 concat.setOnAction(actionEvent -> this.onconat());
 MenuItem compare = new MenuItem("Compare");
 compare.setOnAction(actionEvent -> this.oncompare());
 str.getItems().addAll(copy,len,concat,compare);

 Menu quit = new Menu("Quit");
 MenuItem exit = new MenuItem("Exit from the application");
 exit.setOnAction(actionEvent -> Platform.exit());
 quit.getItems().add(exit);

 menubar.getMenus().addAll(number,str,quit);
 BorderPane bp = new BorderPane();
 Scene scene = new Scene(bp, 300, 250, Color.WHITE);
 bp.setTop(menubar);
 primaryStage.setScene(scene);
 primaryStage.show();
 }
 public static void main(String[] args) {
 launch(args);
 }
}