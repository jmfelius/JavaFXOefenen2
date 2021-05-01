package sample;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Controller extends Application {


    public void start(Stage primaryStage)
    {
        Pane root = new Pane();
        final int PANE_Width = 300;
        final int PANE_HEIGHT = 400;
        root.setMaxSize(PANE_Width, PANE_HEIGHT);

        Scene scene1 = new Scene(root);
        primaryStage.setScene(scene1);
        primaryStage.setTitle(("This is an empty pane"));
        primaryStage.show();
    }


    public static void main(String[] args) { launch(args);
    }
}

