/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 * Aquesta classe representa els clients del banc.
 * Conté una llista de clients i diversos mètodes per a gestionar-ne les dades.
 *
 * @author alumne
 */
public class clients {
/**
     * Constructor de la classe clients.
     * Inicialitza la llista de clients amb alguns clients de prova.
     *
     * @param Nom             el nom del client
     * @param cognoms         els cognoms del client
     * @param DNI             el DNI del client
     * @param Nº_compte       el número de compte del client
     * @param nº_tarjeta_client    el número de targeta del client
     */
    public clients(String Nom, String cognoms, String DNI, String Nº_compte, String nº_tarjeta_client) {
    }
    /**
     * Camp de text del nom del client.
     */
     @FXML
    TextField Nom;
     /**
     * Llista de clients.
     */
     private ArrayList<clients> clients;
 /**
     * Constructor per defecte de la classe clients.
     * Inicialitza la llista de clients amb alguns clients de prova.
     */
    public clients() {
        ArrayList<clients> clients = App.clients.getClients(); 
        clients = new ArrayList();
        clients.add(new clients("Joan", "García Fernàndez", "54080799W", "EL9234013865102654781208", "N\u00ba_tarjeta_client"));
        clients.add(new clients("Marc", "Gómez Martínez","46783456F","ES4520858343195898054937", "N\u00ba_tarjeta_client"));
        clients.add(new clients("Jordi", "Verges Jimenez", "54783457D", "ES7502391215116358414766", "N\u00ba_tarjeta_client"));
        clients.add(new clients("Alicia", "Marquez Sánchez", "46783456G", "ES4100119674480891876465", "N\u00ba_tarjeta_client"));
        clients.add(new clients("Marti", "contraseña1", "er", "fvhe", "N\u00ba_tarjeta_client"));
        
    }
    /**
     * Mètode per a gestionar el compte del client.
     */
   
    public void compte(){
        }
    /**
     * Mètode per a gestionar el compte corrent del client.
     */
    public void comptecorrent(){
 
       
     
           
           
       
        
            

         
    
        }
        /**
     * Retorna el camp de text del nom del client.
     *
     * @return el camp de text del nom del client
     */


    public TextField getNom() {
        return Nom;
    }
 /**
     * Estableix el camp de text del nom del client.
     *
     * @param Nom el camp de text del nom del client
     */
    public void setNom(TextField Nom) {
        this.Nom = Nom;
    }
/**
     * Retorna la llista de clients.
     *
     * @return la llista de clients
     */

    public ArrayList<clients> getClients() {
        return clients;
    }
/**
     * Estableix la llista de clients.
     *
     * @param clients la llista de clients
     */
    public void setClients(ArrayList<clients> clients) {
        this.clients = clients;
    }
         private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
       
    }
        

  
   
   
   


    
    

