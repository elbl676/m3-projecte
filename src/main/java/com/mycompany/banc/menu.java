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
    
/*
* Element botó que tanca la sessió de l'aplicació.
*/
     @FXML
 private Button logout;
     
/*
*  botó que mostra el saldo de l'usuari.
*/
 @FXML
  private Button saldo;
  /*
* botó que retira diners del compte de l'usuari.
*/
 @FXML
  private Button retirar;
 
/*
*  botó que diposita diners en el compte de l'usuari.
*/
 @FXML
  private Button ingresar;
 /*
*  botó que canvia la contrasenya de l'usuari.
*/
  @FXML
  private Button clau;
 /*
*  botó que mostra el saldo de l'usuari.
*/
   @FXML
private Button saldoButton;
   
/*
* Canvia la vista a la vista de balanç.
*
* Aquest mètode és anomenat quan l'usuari prem el botó "saldo". Estableix l'arrel de l'aplicació a
* la vista "secundària", que mostra el saldo de l'usuari.
*
* @throws IOException if the view cannot be loaded
*/
   
    @FXML
    private void switchToSaldo() throws IOException {
        App.setRoot("secondary");
    }
    
/*
* Canvia la vista a la vista primària.
*
* Aquest mètode és anomenat quan l'usuari fa clic en el botó "logout". Estableix l'arrel de l'aplicació a
* la vista "primària", que és la pantalla d'inici de sessió.
*
* @throws IOException if the view cannot be loaded
*/
     @FXML
    private void switchTologout() throws IOException {
        App.setRoot("primary");
    }
 
/*
* Canvia la vista a la vista de canvi de contrasenya.
*
* Aquest mètode és anomenat quan l'usuari fa clic en el botó "clau". Estableix l'arrel de l'aplicació a
* la vista "clau", que permet a l'usuari canviar la seva contrasenya.
*
* @throws IOException if the view cannot be loaded
*/
 @FXML
       private void switchToclau() throws IOException {
        App.setRoot("clau");
    }
       /*
* Switches the view to the deposit view.
*
* This method is called when the user clics on the "ingressar" button. It sets the root of the application to
* the "ingres" view, which allows the user to deposit money into their account.
*
* @throws IOException if the view cannot be loaded
*/
    @FXML
    private void switchtoingres() throws IOException {
        App.setRoot("ingres");
    }
    
/*
* Canvia la vista a la vista de retirada.
*
* Aquest mètode és anomenat quan l'usuari fa clic en el botó "retirar". Posa l'arrel de l'aplicació en
* la vista "retirar", que permet a l'usuari retirar diners del seu compte.
*
* @throws IOException if the view cannot be loaded
*/
    @FXML
    private void extreu() throws IOException {
        App.setRoot("retirar");
    }
    /*
* Canvia la vista a la vista de transferencia.
*
* Aquest mètode és anomenat quan l'usuari fa clic en el botó "transferir". Posa l'arrel de l'aplicació en
* la vista "transferir", que permet a l'usuari transferir diners del seu compte.
*
* @throws IOException if the view cannot be loaded
*/
    @FXML
    private void transfer() throws IOException {
        App.setRoot("transferencia");
    }

/*
* Canvia la vista a la vista de saldoclient.
*
* Aquest mètode és anomenat quan l'usuari fa clic en el botó "saldoclient". Posa l'arrel de l'aplicació en
* la vista "saldoclient", que permet a l'usuari consulti el seu saldo.
*
* @throws IOException if the view cannot be loaded
*/
@FXML
   
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }  
 
 

    
}