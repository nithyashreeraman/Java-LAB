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
public class temperature extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Temperature value conversion");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        Text scenetitle = new Text("Welcome");
        Label promt = new Label("Enter the temperature value");
        promt.setPrefSize(200, 30);
        TextField tempVal = new TextField();
        Button btn1 = new Button("Celsius to Fahrenheit ");
        Button btn2 = new Button("Fahrenheit to Celsius ");
        TextField res = new TextField();
        grid.add(scenetitle, 0, 0);
        grid.add(promt, 0, 1);
        grid.add(tempVal,1, 1);
        grid.add(btn1, 0, 2);
        grid.add(btn2, 1, 2);
        grid.add(res, 0, 3);
        
        //code for temerature conversion....
        
        Scene scene = new Scene(grid, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
} 

