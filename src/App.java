import java.time.Clock;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class App {

    


    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }

    public void setTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime time = LocalTime.now();
        System.out.println(dtf.format(time));
    }

    public void start(Stage stage) throws Exception {
        StackPane layout = new StackPane();
        Label CurrentTime = new Label();
        Button SetTime = new Button();
        GridPane root = new GridPane();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Clock");
        stage.setWidth(475);
        stage.setHeight(300);
        stage.show();
    }
}
