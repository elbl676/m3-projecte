package com.mycompany.banc;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    TextField user;
    @FXML
    PasswordField password;
    @FXML
    Button login;
    @FXML
    TextField missatge;
    int intents = 0;

    final String Username = "eloy";

    final String contrasenya = "banc";
    boolean encerts = (true);

    @FXML
    public void login() {

        System.out.println("Usuari:");

        System.out.println("Password:");

        if (user.getText().equals(Username) && password.getText().equals(contrasenya)) {
            System.out.println("correcte");
        } else {
            System.out.println("Torna-ho a provar");

        }

        if (intents > 5) {
            System.out.println("Bloquejat,només tens 5 intents");
        }
        intents++;
        if (user.getText().equals(Username) && password.getText().equals(contrasenya)) {
            missatge.setText("login correcte");
        } 
        else {
 missatge.setText("login incorrecte");
 
        }
        
    }
}
       

    



            
   
        
    
        
    

             
            
       
   // public void opcions(){

