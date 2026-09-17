module com.mycompany.olamundojavafxapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.olamundojavafxapp to javafx.fxml;
    exports com.mycompany.olamundojavafxapp;
}
