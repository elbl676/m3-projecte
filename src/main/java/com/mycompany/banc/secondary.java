/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banc;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 *
 * @author alumne
 */

public class secondary {
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
