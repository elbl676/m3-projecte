/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banc;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import javafx.fxml.FXML;

/**
 *
 * @author alumne
 */
public class clau {
   private ArrayList<Usuario> usuarios;
   /*
* Canvia la clau de l'usuari corresponent al nom d'usuari donat.
* Si la clau actual coincideix amb la donada, s'actualitzarà la clau per la nova.
* En cas contrari, es mostrarà un missatge d'error.
* Si no es troba l'usuari, també es mostrarà un missatge d'error.
*
* @param Username el nom d'usuari de l'usuari al qual se li vol canviar la clau.
* @param contrasenya la clau actual de l'usuari.
* @param nuevaClave la nova clau que es vol establir.
*/
    public void cambiarClave(String Username, String contrasenya, String nuevaClave) {
        
    // Buscamos al usuario correspondiente al nombre de usuario dado
    for (Usuario usu : usuarios) {
        if (usu.getUsername().equals(Username)) {
            // Verificamos la clave actual
            if (usu.getPassword().equals(contrasenya)) {
                // Actualizamos la clave
                usu.setPassword(nuevaClave);
                // Mostramos mensaje de éxito
                System.out.println("La clave se ha actualizado correctamente.");
                return;
            } else {
                // Mostramos mensaje de error si la clave actual no coincide
                System.out.println("Error: La clave actual no es correcta.");
                return;
            }
        }
    }
    // Mostramos mensaje de error si no se encontró el usuario
    System.out.println("Error: No se encontró el usuario.");
}
/*
* Canvia l'escena a la pantalla principal.
*
* @throws IOException si hi ha un error en canviar l'escena.
*/
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("secondry1");
}

    

   
}
     


 