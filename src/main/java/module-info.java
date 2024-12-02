module live.denisdev.agenziaviaggi {
    requires javafx.controls;
    requires javafx.fxml;


    opens live.denisdev.agenziaviaggi to javafx.fxml;
    exports live.denisdev.agenziaviaggi;
}