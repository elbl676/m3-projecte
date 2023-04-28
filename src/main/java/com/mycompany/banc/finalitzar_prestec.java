/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banc;

import java.io.IOException;
import javafx.fxml.FXML;

/**
 *
 * @author jjavi
 */
public class finalitzar_prestec {
    @FXML
    private void menu() throws IOException {
        App.setRoot("secondry1");
    }
    @FXML
     private void peticions() throws IOException {
        App.setRoot("llista_peticions");
    }
}
 