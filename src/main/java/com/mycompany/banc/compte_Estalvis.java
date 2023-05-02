/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banc;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 *
 * @author alumne
 */
public class compte_Estalvis {
    
     @FXML
    private TextField Nom; // camp de text per al nom del titular del compte
    @FXML
     private TextField Cognoms;  // camp de text per als cognoms del titular del compte
    @FXML
      private TextField DNI;  // camp de text per al DNI del titular del compte
    @FXML
       private TextField nºtarjeta;  // camp de text per al número de targeta de crèdit del titular del compte
    @FXML
       private TextField nºcompte;  // camp de text per al número de compte del titular del compte
     @FXML
       private TextField saldo_estalvis;  // camp de text per al saldo d'estalvi del titular del compte
     
     /*
* Inicialitza els camps de text amb la informació corresponent de l'usuari actual.
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
        saldo_estalvis.setText(String.valueOf(u.getSaldo()));

        
        u.getSaldo(); 
    }
    
/*
* Redirigeix a l'usuari a la pantalla secundaria1 quan es fa clic.
* @throws IOException if an I/O error occurs.
*/
     @FXML
    private void menu() throws IOException {
        App.setRoot("secondry1");
    }
    
}
