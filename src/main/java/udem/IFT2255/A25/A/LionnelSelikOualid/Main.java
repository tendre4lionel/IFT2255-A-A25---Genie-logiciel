package udem.IFT2255.A25.A.LionnelSelikOualid;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {launch(args);}
    public void start(Stage stage){
        var titre = "projet de gestion municipale : javafx test";
        var root = new BorderPane();
        var scene = new Scene(root, 400, 450);
        var text = new Text("this is a javafx test.");
        root.setCenter(text);
        stage.setTitle(titre);
        stage.setScene(scene);
        stage.show();
    }
}