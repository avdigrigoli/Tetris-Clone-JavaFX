module com.example.tetrisclone {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires eu.hansolo.tilesfx;

    opens com.example.tetrisclone to javafx.fxml;
    exports com.example.tetrisclone;
}