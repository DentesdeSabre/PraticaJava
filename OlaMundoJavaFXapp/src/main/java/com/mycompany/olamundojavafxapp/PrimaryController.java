package com.mycompany.olamundojavafxapp;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class PrimaryController {

    @FXML
    private TextField txtNome;
    @FXML
    private Text txtResultado;
    @FXML
    private void enviarNome() throws IOException {
        if (txtNome.getText()=="") {
            txtResultado.setText("Por favor, digite seu nome");
        }else{
            String nome = txtNome.getText();
            txtResultado.setText("Olá "+nome+", Tenha um bom dia");
        }
        
    }
}
