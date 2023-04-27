/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banc;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author jjavi
 */
public class extreure_diners {
     @FXML
   public Button Depositar;
    @FXML
   public Button ingres;
    
    @FXML
   public ComboBox quantitat20;
     @FXML
   public ComboBox quantitat50;
      @FXML
   public ComboBox quantitat100;
      @FXML
      public TextField total;
       @FXML
      public TextField total1;
    @FXML
   public Button depositar;


double saldoActual;
  
     
    
public void depositar(ActionEvent event) {
    System.out.println(quantitat20.getValue());
    int iquantitat20 = Integer.parseInt(quantitat20.getValue().toString());
    int iquantitat50 = Integer.parseInt(quantitat50.getValue().toString());
    int iquantitat100 = Integer.parseInt(quantitat100.getValue().toString());
   

    double cantidadTotal = iquantitat20 * 20.0+ iquantitat50 * 50 + iquantitat100 * 100;
     double saldoActual = cantidadTotal;
     double saldo=3500;
     double saldoT=saldo-saldoActual;

     total.setText("Enhoraba has extret: €" + saldoActual);
      double Saldo_client=App.banc.getUsuariActual().getSaldo();

   
double saldo_Final=Saldo_client-saldoActual;  
 total1.setText(" €" + saldo_Final);
     
}
public void saldo(ActionEvent event) {
    System.out.println(quantitat20.getValue());
    int iquantitat20 = Integer.parseInt(quantitat20.getValue().toString());
    int iquantitat50 = Integer.parseInt(quantitat50.getValue().toString());
    int iquantitat100 = Integer.parseInt(quantitat100.getValue().toString());
   

    double cantidadTotal = iquantitat20 * 20.0+ iquantitat50 * 50 + iquantitat100 * 100;
      saldoActual = cantidadTotal;
     double saldo=3500;
     double saldoT=saldo-saldoActual;

     total.setText("Enhoraba has extret: €" + saldoT);
     
}
   

       
    
    @FXML
    void initialize() {
        
       quantitat20.getItems().addAll("1","2","3","4","5","6","7","8","9","10");
        quantitat50.getItems().addAll("1","2","3","4","5","6","7","8","9","10");
         quantitat100.getItems().addAll("1","2","3","4","5","6","7","8","9","10");
         
         Usuario u = App.banc.getUsuariActual();
        u.getPassword();
        u.getUsername();
        total1.setText(String.valueOf(u.getSaldo()));
    }

   
    
    @FXML
    private void switchToingres() throws IOException {
        App.setRoot("secondry1");
    }
    

}