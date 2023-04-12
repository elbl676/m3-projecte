package com.mycompany.banc;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class menu {
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
private Button saldoButton;
   
   
    @FXML
    private void switchToSaldo() throws IOException {
        App.setRoot("secondary");
    }
    
     @FXML
    private void switchTologout() throws IOException {
        App.setRoot("primary");
    }
 
 @FXML
    private void switchToclau() throws IOException {
        App.setRoot("clau");
    }

  







 


@FXML
   
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }  
 
 

    
}