import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class App extends Application {

    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }

    public void start(Stage stage) throws Exception {
        Label CurrentTime = new Label("00:00");
        Button SetTime = new Button("Set Time");
        GridPane root = new GridPane();
        Scene scene = new Scene(root);

        CurrentTime.setMinSize(10, 10);
        SetTime.setMinSize(10, 10);

        root.add(CurrentTime, 0, 0);
        root.add(SetTime, 0, 1);

        stage.setScene(scene);
        stage.setTitle("Clock");
        stage.setWidth(200);
        stage.setHeight(100);
        stage.show();
        LocalTime time = LocalTime.now();

        SetTime.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a");
                CurrentTime.setText(dtf.format(time));
            }
          });
    }
}
