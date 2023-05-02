/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banc;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


/**
 *
 * @author jjavi
 */
public class compte_corrent {
    
    @FXML
    private TextField Nom;
    @FXML
     private TextField Cognoms;
    @FXML
      private TextField DNI;
    @FXML
       private TextField nºtarjeta;
    @FXML
       private TextField nºcompte;
     @FXML
       private TextField total1;
     
    double saldoActual;
    /**
 * Inicialitza els camps del compte corrent de l'usuari actual.
 */
     @FXML
    void initialize() {
        Usuario u = App.banc.getUsuariActual();
        u.getPassword();
        u.getUsername();
        Nom.setText(u.getNom_client());
        
        Cognoms.setText(u.getCognoms_client());
        DNI.setText(u.getDNI_client());
        nºtarjeta.setText(u.getNº_tarjeta());
        nºcompte.setText(u.getNº_compteclient());
        u.getCognoms_client();
        u.getDNI_client();
        u.getNº_compteclient();
        u.getNom_client();
        u.getNº_tarjeta();
         
        u.getPassword();
        u.getUsername();
        total1.setText(String.valueOf(u.getSaldo()));

        
        u.getSaldo(); 
    }
    /**
 * Afegeix una quantitat de diners al saldo del compte corrent.
 * @param event l'event que es produeix al prémer el botó 'Ingressar'.
 */
    public void sou(ActionEvent event) {
     double Saldo_client=App.banc.getUsuariActual().getSaldo();

   
double saldo_Final=Saldo_client+saldoActual;  
 total1.setText(" €" + saldo_Final);
   }
    /**
 * Canvia la pantalla a la pantalla principal del programa.
 * @throws IOException si hi ha un error amb la càrrega de la pantalla.
 */
  
   @FXML
    private void menu() throws IOException {
        App.setRoot("secondry1");
    }   
    
}
