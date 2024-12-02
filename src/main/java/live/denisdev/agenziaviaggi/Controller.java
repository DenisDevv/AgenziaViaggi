package live.denisdev.agenziaviaggi;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    protected void staff() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(AgenziaViaggi.class.getResource("staff.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Agenzia Viaggi | STAFF");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setX(stage.getX() + 10);
        stage.setY(stage.getY() + 10);
        stage.show();
    }

    @FXML
    protected void utente() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(AgenziaViaggi.class.getResource("utente.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Agenzia Viaggi | UTENTE");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setX(stage.getX() + 10);
        stage.setY(stage.getY() + 10);
        stage.show();
    }
}
