package com.mycompany.banc;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SecondaryController11 {
     @FXML
 private Button logout;
 @FXML
  private Button saldo;
 @FXML
  private Button retirar;
 @FXML
  private Button ingresar;
 @FXML
  private Button transferencia;
 @FXML
  private Button clau;
 @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    
}