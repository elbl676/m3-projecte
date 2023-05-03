/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Controlador per a la vista de pagament de factures.
 */
package com.mycompany.banc;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * Controlador per a la vista de pagament de factures.
 */
public class facturas {
    @FXML
    private TextField total;
      @FXML
   public ComboBox quantitat100;
        @FXML
   public ComboBox quantitat50;
          @FXML
   public ComboBox quantitat20;
           @FXML
    private TextField importar;
    double saldoActual;
    /**
     * Executa el pagament de les factures.
     * Recupera la quantitat de bitllets de cada denominació seleccionats, calcula el pagament
     * total de les factures i actualitza el saldo del client.
     *
     * @param event L'esdeveniment que ha desencadenat la crida a aquest mètode.
     */
    public void pagament(ActionEvent event) {
   
   System.out.println(quantitat20.getValue());
    int iquantitat20 = Integer.parseInt(quantitat20.getValue().toString());
    int iquantitat50 = Integer.parseInt(quantitat50.getValue().toString());
    int iquantitat100 = Integer.parseInt(quantitat100.getValue().toString());
   

    double cantidadTotal = iquantitat20 * 20.0+ iquantitat50 * 50 + iquantitat100 * 100;
    saldoActual = cantidadTotal;

     double Saldo=saldoActual-cantidadTotal;


    

     total.setText("El pagament total de les factures es de: €" + saldoActual);
     double Saldo_client=App.banc.getUsuariActual().getSaldo();

   

}
    /**
     * Inicialitza la vista.
     * Afegeix les opcions per als combo box de les diferents quantitats de bitllets,
     * i carrega la quantitat d'import de factures actual del client.
     */
    
     @FXML
    void initialize() {
        
       quantitat20.getItems().addAll("0","1","2","3","4","5","6","7","8","9","10");
        quantitat50.getItems().addAll("0","1","2","3","4","5","6","7","8","9","10");
         quantitat100.getItems().addAll("0","1","2","3","4","5","6","7","8","9","10");
       
Usuario u = App.banc.getUsuariActual();
        u.getPassword();
        u.getUsername();
        importar.setText(String.valueOf(u.getImport_factures()));

        
        u.getImport_factures();
        
        
    }
    /**
     * Redirigeix l'usuari a la pàgina d'ingrés.
     *
     * @throws IOException Si hi ha hagut un problema al carregar la pàgina d'ingrés.
     */
      @FXML
    private void ingres() throws IOException {
        App.setRoot("secondry1");
    }
     /**
     * Redirigeix l'usuari a la pàgina de gestió d'arxius de factures.
     *
     * @throws IOException Si hi ha hagut un problema al carregar la pàgina d'arxius de factures.
     */
     @FXML
    private void pagar() throws IOException {
        App.setRoot("arxiu_factures");
    }
}
