package com.mycompany.banc;

import java.io.IOException;
import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class login {

  
    @FXML
    TextField user;
    @FXML
    PasswordField password;
    
    //@FXML
    //Button login;
    @FXML
    TextField missatge;
    int intents = 0;

    final String Username = "eloy";

    final String contrasenya = "banc";
     
   
    boolean encerts = (true);

    @FXML
    public void login() throws IOException {
        
        

        System.out.println("Usuari:");

        System.out.println("Password:");
 ArrayList<Usuario> usuarios = App.banc.getUsuarios();
        if (user.getText().equals(Username) && password.getText().equals(contrasenya)) {
              App.setRoot("secondry1");
        } else {
            System.out.println("Torna-ho a provar");

        }

        if (intents > 3) {
            System.out.println("Bloquejat,només tens 3 intents");
        }
        intents++;
        if (user.getText().equals(Username) && password.getText().equals(contrasenya)) {
            missatge.setText("login correcte");
        } 
        else {
 missatge.setText("Torna-ho a intentar");
 
        }
        if (intents>3) {
            missatge.setText("Bloquejat,només tens 3 intents");
        }
        
       
    
   

    
    
}
}

 


       

    



            
   
        
    
        
    

             
            
       
   

