
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    URL loginFXML = getClass().getResource("layout.fxml");

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Gusta");

        Parent fxmlLogin = FXMLLoader.load(loginFXML);
        Scene loginScene = new Scene(fxmlLogin);

        primaryStage.setScene(loginScene);
        primaryStage.show();
    }
}
