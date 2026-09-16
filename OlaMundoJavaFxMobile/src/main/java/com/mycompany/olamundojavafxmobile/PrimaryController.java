package com.mycompany.olamundojavafxmobile;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PrimaryController {
    @FXML
    private Label lblMsg;
    @FXML
    private void mudar() throws IOException {
        lblMsg.setText("Olá Mundo");
    }
}
