import java.util.Optional;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
//import javafx.scene.control.Menu;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Menuexample extends Application{
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
   @Override
   public void start(Stage primaryStage) {
      MenuBar menubar = new MenuBar();
      Menu number = new Menu("Number");
      MenuItem add = new MenuItem("Addition");
      add.setOnAction(actionEvent -> this.onadd());
      MenuItem sub = new MenuItem("Subtraction");
      MenuItem mul = new MenuItem("Multiplication");
      MenuItem div = new MenuItem("Division");
      number.getItems().addAll(add,sub,mul,div);
      
      Menu str = new Menu("String");
      MenuItem copy = new MenuItem("Copy");
      MenuItem len = new MenuItem("Length");
      MenuItem concat = new MenuItem("Concatenate");
      MenuItem compare = new MenuItem("Compare");
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
