package com.mycompany.banc;
import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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
    TextField login;
    @FXML
    PasswordField password;
    
    //@FXML
    //Button login;
    @FXML
    TextField missatge;
    int intents = 0;
    final String Username = "eloy";

    final String contrasenya = "banc";
     
                

            
/*
* Aquest mètode autentica a l'usuari comparant el nom d'usuari i la contrasenya introduïts
* amb els registres d'usuaris registrats. Si l'autenticació és correcta, el
* usuari és redirigit al panell de control principal. Si l'autenticació falla, es mostra un missatge d'error.
* es mostra un missatge d'error.
* @throws IOException
*/

   public void login() throws IOException {
 ArrayList<Usuario> usuarios = App.banc.getUsuarios(); 
System.out.println("Usuari:");

        System.out.println("Password:");
  boolean trobat=false;
  for (Usuario u : usuarios) {
    if (user.getText().equals(u.getUsername()) && password.getText().equals(u.getPassword())) {
        trobat=true;
        App.banc.setUsuariActual(u);
        App.setRoot("secondry1");
    } else {
        System.out.println("Torna-ho a provar");
    }
    if (intents > 3) {
        System.out.println("Bloquejat, només tens 3 intents");
    }
    intents++;
    if (user.getText().equals(u.getUsername()) && password.getText().equals(u.getPassword())) {
        missatge.setText("login correcte");
    } else {
        missatge.setText("Torna-ho a intentar");
        
    }
    if (intents > 3) {
        missatge.setText("Bloquejat, només tens 3 intents");
        
          }
    
  }
  
       if (trobat==false) {
           Alert alert = new Alert(Alert.AlertType.ERROR, "El nom d'usuari o la contrasenya no són correctes. Torna-ho a intentar.");
            alert.showAndWait();
       }
  
        
   }
   }


   





    
   
    





       
    
   

    
  




 


       

    



            
   
        
    
        
    

             
            
       
   

