import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

 

public class ListViewSimple extends Application  {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("ListView Program1...");
        ListView listView = new ListView();
        listView.getItems().add("Item 1");
        listView.getItems().add("Item 2");
        listView.getItems().add("Item 3");

 

        Button button = new Button("Read Selected Value");
        button.setOnAction(event -> {
            ObservableList selectedIndices = listView.getSelectionModel().getSelectedIndices();
            for(Object ob : selectedIndices){
                System.out.println("ob = " + ob + " (" + ob.getClass() + ")");
            }
            Object obj = listView.getSelectionModel().getSelectedItem();
            System.out.println(obj);
        });

 


        VBox vBox = new VBox(listView, button);
        Scene scene = new Scene(vBox, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

 

    public static void main(String[] args) {
        Application.launch(args);
    }
}