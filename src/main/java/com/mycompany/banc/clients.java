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
 *
 * @author alumne
 */
public class clients {

    public clients(String Nom, String cognoms, String DNI, String Nº_compte, String nº_tarjeta_client) {
    }
     @FXML
    TextField Nom;
     private ArrayList<clients> clients;

    public clients() {
        ArrayList<clients> clients = App.clients.getClients(); 
        clients = new ArrayList();
        clients.add(new clients("Joan", "García Fernàndez", "54080799W", "EL9234013865102654781208", "N\u00ba_tarjeta_client"));
        clients.add(new clients("Marc", "Gómez Martínez","46783456F","ES4520858343195898054937", "N\u00ba_tarjeta_client"));
        clients.add(new clients("Jordi", "Verges Jimenez", "54783457D", "ES7502391215116358414766", "N\u00ba_tarjeta_client"));
        clients.add(new clients("Alicia", "Marquez Sánchez", "46783456G", "ES4100119674480891876465", "N\u00ba_tarjeta_client"));
        clients.add(new clients("Marti", "contraseña1", "er", "fvhe", "N\u00ba_tarjeta_client"));
        
    }
    
   
    public void compte(){
        }
    public void comptecorrent(){
 
       
     
           
           
       
        
            
//if (Nom.getText().equals(nom){
    //System.out.println(nom);
   
         
    
        }

    public TextField getNom() {
        return Nom;
    }

    public void setNom(TextField Nom) {
        this.Nom = Nom;
    }

    public ArrayList<clients> getClients() {
        return clients;
    }

    public void setClients(ArrayList<clients> clients) {
        this.clients = clients;
    }
         private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
       
    }
        

  
   
   
   


    
    

