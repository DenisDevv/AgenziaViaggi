package live.denisdev.agenziaviaggi;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class StaffController {
    @FXML
    protected TextField destinazione;
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
}
