module com.mycompany.olamundojavafxmobile {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.olamundojavafxmobile to javafx.fxml;
    exports com.mycompany.olamundojavafxmobile;
}
