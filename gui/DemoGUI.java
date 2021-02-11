import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Pos;
public class DemoGUI extends Application {
    // Stage and scene interface
    // Stage class is the top level window
    // Scenes on a stage - container for content
    public void start(Stage primaryStage){
        primaryStage.setTitle("Demo GUI");
        Text greet = new Text("Hello World.");
        FlowPane pane = new FlowPane(greet);
        pane.setAlignment(Pos.CENTER);
        // Scene(pane, width, height)
        Scene scene = new Scene(pane, 200 , 100);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
