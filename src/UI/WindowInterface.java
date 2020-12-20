package UI;
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class WindowInterface  extends Application{
    Button clearBtn;
    Button generateBtn;
    //TODO: add some "confirmation" things. If generating more than one file, ask if sure.
    //TODO: if the page count seems large, confirm.
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("The Abacus Problem Generator");
        
    }
}
