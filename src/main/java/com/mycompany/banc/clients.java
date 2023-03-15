/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banc;

import java.io.IOException;
import java.util.Scanner;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 *
 * @author alumne
 */
public class clients {
     @FXML
    TextField Nom;
   
    public void compte(){
        }
    public void comptecorrent(){
        
      boolean tarjeta = false;  
      final String nom="Joan"; 
           String[] cognoms={"García Fernàndez"};
           String[] DNI={"54080799W"};
           String[] num_compte={"EL9234013865102654781208"};
        if (tarjeta==true) {
            System.out.println("Entra al compte corrent");
           
         }
        else{
            System.out.println("Accés denegat");
        }
        
            
if (Nom.getText().equals(nom)){
    System.out.println(nom);
    
        }
        System.out.println("Nom del client:"+nom);
        System.out.println("Cognoms del client:"+cognoms);
        System.out.println("DNI del client"+DNI);
        System.out.println("El nº de compte es:"+num_compte);
    }

    public clients() {
    }
    public void compteestalvis(){
        
    }
    public void saldo(){
        
    }
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
   
   
}
    
    

