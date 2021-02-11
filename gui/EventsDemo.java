import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;

public class EventsDemo extends Application {
    private Text greet;
    private int count;
    public void start(Stage primaryStage){
        primaryStage.setTitle("Events demo");
        count = 0;
        greet = new Text();
        Button display = new Button("Display Greeting");
        display.setOnAction(this::processButtonPress);
        FlowPane pane = new FlowPane(display, greet);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20); //horizontal gap
        Scene scene = new Scene(pane, 300 , 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void processButtonPress(ActionEvent event){
        count++;
        switch (count){
            case 1: greet.setText("Hello world");
                    break;
            case 2: greet.setText("Hi there!");
                    break;
            case 3: greet.setText("Good day!");
                    break;
            case 4:
                    greet.setText("Ola amigo.");
                    count = 0;
                    break;
        }

    }
}
