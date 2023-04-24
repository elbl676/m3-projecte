 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banc;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author jjavi
 */
public class comptes {
      

   

 
    
    @FXML
    private void comptecorrent() throws IOException {
        App.setRoot("compte_corrent");
    }
    
    
     @FXML
    private void compteestalvis() throws IOException {
        App.setRoot("compte_estalvis");
    }
   
}
    

