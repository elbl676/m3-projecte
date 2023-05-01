/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
* La classe Client representa a un client bancari i les seves dades personals.
* Conté camps de text per al nom, cognoms, DNI i número de compte del client.
* La classe Clients representa a un client bancari i la seva informació personal.
* Conté un booleà per a la targeta del client, i cadenes de text per al seu nom, cognoms, DNI i número de compte.
*/
package com.mycompany.banc;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 *
 * @author alumne
 */

public class Client {
    /*
* El camp de text per al nom del client.
*/
   @FXML
   TextField Nom;
   
/*
* El camp de text per als cognoms del client.
*/
    private TextField nom_client;
    
/*
* El camp de text per als cognoms del client.
*/
    private TextField cognoms_client;
    /*
* El camp de text per al DNI del client.
*/
    private TextField DNI_client;
    
/*
* El camp de text per al número de compte del client.
*/
    private TextField num_compte_client;

    /**
     *
     */
    public class clients{
   private boolean tarjeta = true;           
    private String nom_client="Joan";
   private String cognoms_client="García Fernàndez";
   private String DNI_client="54080799W";
   private String num_compte_client="EL9234013865102654781208";

       
/*
* El constructor per a la classe de clients.
*
* @param targeta un booleà que indica si el client té targeta o no.
* @param nom_client el nom del client.
* @param cognoms_*clients els cognoms del client.
* @param DNI_client el DNI del client.
* @param num_*compte_client el número de compte del client.
*/
       public clients(boolean tarjeta, String nom_client, String cognoms_clients,String DNI_client,String num_compte_client) {
    
       this.nom_client= "Joan";
       this.cognoms_client= "García Fernàndez";
       this.DNI_client="54080799W";
       this.num_compte_client="EL9234013865102654781208";
   
   
   }
   }

  
/*
* Retorna el camp de text per al nom del client.
*
* @return el camp de text per al nom del client.
*/
    public TextField getNom_client() {
        return nom_client;
    }

    
/*
* Retorna el camp de text per als cognoms del client.
*
* @retorna el camp de text per als cognoms del client.
*/
    public TextField getCognoms_client() {
        return cognoms_client;
    }

   
/*
* Retorna el camp de text del DNI del client.
*
* @retorna el camp de text per al DNI del client.
*/
    public TextField getDNI_client() {
        return DNI_client;
    }

    
/*
* Retorna el camp de text per al número de compte del client.
*
* @retorna el camp de text per al número de compte del client.
*/
    public TextField getNum_compte_client() {
        return num_compte_client;
    }

    
 
}
