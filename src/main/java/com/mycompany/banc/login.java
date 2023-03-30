package com.mycompany.banc;

import java.io.IOException;

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
     
    final String Username1 = "user1";

    final String contrasenya1 = "banc";
     final String Username2 = "user2";

    final String contrasenya2 = "banc";
     final String Username3 = "user3";

    final String contrasenya3 = "banc";
     final String Username4 = "user4";

    final String contrasenya4 = "banc";
    boolean encerts = (true);

    @FXML
    public void login() throws IOException {

        System.out.println("Usuari:");

        System.out.println("Password:");

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
        
       
    
    //inici sessió usuari 2
    
     System.out.println("Usuari:");

        System.out.println("Password:");

        if (user.getText().equals(Username2) && password.getText().equals(contrasenya2)) {
              App.setRoot("secondary1");
        } else {
            System.out.println("Torna-ho a provar");

        }

        if (intents > 3) {
            System.out.println("Bloquejat,només tens 3 intents");
        }
        intents++;
        if (user.getText().equals(Username2) && password.getText().equals(contrasenya2)) {
            missatge.setText("login correcte");
        } 
        else {
 missatge.setText("Torna-ho a intentar");
 
        }
        if (intents>3) {
            missatge.setText("Bloquejat,només tens 3 intents");
        }
        //inici sessio user 1
        System.out.println("Usuari:");

        System.out.println("Password:");

        if (user.getText().equals(Username1) && password.getText().equals(contrasenya1)) {
              App.setRoot("secondary");
        } else {
            System.out.println("Torna-ho a provar");

        }

        if (intents > 3) {
            System.out.println("Bloquejat,només tens 3 intents");
        }
        intents++;
        if (user.getText().equals(Username1) && password.getText().equals(contrasenya1)) {
            missatge.setText("login correcte");
        } 
        else {
 missatge.setText("Torna-ho a intentar");
 
        }
        if (intents>3) {
            missatge.setText("Bloquejat,només tens 3 intents");
        }
        //inici user 3
        
        System.out.println("Usuari:");

        System.out.println("Password:");

        if (user.getText().equals(Username3) && password.getText().equals(contrasenya3)) {
              App.setRoot("secondary");
        } else {
            System.out.println("Torna-ho a provar");

        }

        if (intents > 3) {
            System.out.println("Bloquejat,només tens 3 intents");
        }
        intents++;
        if (user.getText().equals(Username3) && password.getText().equals(contrasenya3)) {
            missatge.setText("login correcte");
        } 
        else {
 missatge.setText("Torna-ho a intentar");
 
        }
        if (intents>3) {
            missatge.setText("Bloquejat,només tens 3 intents");
        }
        //inici user 4
        System.out.println("Usuari:");

        System.out.println("Password:");

        if (user.getText().equals(Username4) && password.getText().equals(contrasenya4)) {
              App.setRoot("secondary");
        } else {
            System.out.println("Torna-ho a provar");

        }

        if (intents > 3) {
            System.out.println("Bloquejat,només tens 3 intents");
        }
        intents++;
        if (user.getText().equals(Username4) && password.getText().equals(contrasenya4)) {
            missatge.setText("login correcte");
        } 
        else {
 missatge.setText("Torna-ho a intentar");
 
        }
        if (intents>3) {
            missatge.setText("Bloquejat,només tens 3 intents");
        }
        
       

        
        
       }
    
     @FXML
    private void switchToclients() throws IOException {
      
    }
    /*
    @override
public void start(Stage primaryStage) {
    // Establece el tamaño preferido de la ventana
    primaryStage.setWidth(800);
    primaryStage.setHeight(600);
    
    // Resto del código de inicialización de la aplicación
}*/

}

 


       

    



            
   
        
    
        
    

             
            
       
   

