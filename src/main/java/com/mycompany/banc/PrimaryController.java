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
    int intents=5;
    
    final String Username="eloy";
    
    final String contrasenya="banc";
    //boolean encerts=(true);
    public int login(){
        
        do{
            
        System.out.println("Usuari:");
           
            System.out.println("Password:");
           
            if(user.getText().equals(Username)&&password.getText().equals(contrasenya)) {
            System.out.println("correcte");}
            if(!(user.getText().equals(Username)&&password.getText().equals(contrasenya))){
                    System.out.println("Torna-ho a provar");
                    intents++;
                    
                    }
            
             if (intents>5) {
                System.out.println("Bloquejat,només tens 5 intents");
             }
                intents++;
        }
            
while(intents<3&& !(user.getText().equals(Username)&&password.getText().equals(contrasenya)));
            intents++;
        return intents;
    }
}
       
        
       
            
        
        

                
            
       
   // public void opcions(){

        
    
        
    

