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

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("secondry1");
}

    

   
}
     


 