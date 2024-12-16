package live.denisdev.agenziaviaggi;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class StaffController {
    @FXML
    protected TextField destinazione;
    @FXML
    protected HBox barra;
    @FXML
    protected Label exDestinazione;
    @FXML
    protected TextField costo;
    @FXML
    protected Label exCosto;
    @FXML
    protected Label exDurata;
    @FXML
    protected DatePicker dataInizio;
    @FXML
    protected DatePicker dataFine;
    @FXML
    protected ComboBox<String> tipo;
    @FXML
    protected Label exTipo;
    @FXML
    protected void conferma() {

    }
    @FXML
    protected void destinazione() {
        exDestinazione.setText(destinazione.getText());
    }
    @FXML
    protected void costo() {
        exCosto.setText(costo.getText() + " €");
    }
    @FXML
    protected void dataFine() {
        exDurata.setText((java.time.temporal.ChronoUnit.DAYS.between(dataInizio.getValue(), dataFine.getValue())) + " Giorni");
    }
    @FXML
    protected void initialize() {
        tipo.getItems().addAll("Volo (Solo Andata)", "Volo (Andata e Ritorno)", "Pasti (Mezza Pensione)", "Pasti (Pensione Completa)", "Escursioni");
    }
    @FXML
    protected void tipo() {
        exTipo.setText(tipo.getValue());
        if (tipo.getValue().equals("Escursioni")) {
            TextField nEscursioni = new TextField();
            nEscursioni.setPromptText("N. Escursioni");
            nEscursioni.setId("nEscursioni");
            nEscursioni.setOnAction(e -> nEscursioni());
            barra.getChildren().add(nEscursioni);
        } else {
            barra.getChildren().removeIf(node -> node.getId() != null && node.getId().equals("nEscursioni"));
        }
    }
    @FXML
    protected void nEscursioni() {

    }
}
