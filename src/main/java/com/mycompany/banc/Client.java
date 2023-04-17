/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banc;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 *
 * @author alumne
 */

public class Client {
   @FXML
   TextField Nom;
    private TextField nom_client;
    private TextField cognoms_client;
    private TextField DNI_client;
    private TextField num_compte_client;
 public class clients{
   private boolean tarjeta = true;           
    private String nom_client="Joan";
   private String cognoms_client="García Fernàndez";
   private String DNI_client="54080799W";
   private String num_compte_client="EL9234013865102654781208";
   public clients(boolean tarjeta, String nom_client, String cognoms_clients,String DNI_client,String num_compte_client) {
    
       this.nom_client= "Joan";
       this.cognoms_client= "García Fernàndez";
       this.DNI_client="54080799W";
       this.num_compte_client="EL9234013865102654781208";
   
   
   }
   }

    public TextField getNom_client() {
        return nom_client;
    }

    public TextField getCognoms_client() {
        return cognoms_client;
    }

    public TextField getDNI_client() {
        return DNI_client;
    }

    public TextField getNum_compte_client() {
        return num_compte_client;
    }

    
 
}
