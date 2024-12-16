module live.denisdev.agenziaviaggi {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens live.denisdev.agenziaviaggi to javafx.fxml;
    exports live.denisdev.agenziaviaggi;
}