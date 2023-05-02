package com.mycompany.banc;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
/**

Classe que gestiona la visualització de les dades del client loggejat
*/
public class dades_client {
    @FXML
    private TextField nom_client;
    @FXML
     private TextField cognoms_client;
    @FXML
      private TextField DNI_client;
    @FXML
       private TextField num_compte_client;
   /**

Mètode que inicialitza la classe per mostrar les dades del client loggejat
*/
    @FXML
    void initialize() {
        Usuario u = App.banc.getUsuariActual();
        u.getPassword();
        u.getUsername();
        nom_client.setText(u.getNom_client());
        cognoms_client.setText(u.getCognoms_client());
        DNI_client.setText(u.getDNI_client());
        num_compte_client.setText(u.getNº_compteclient());
        u.getCognoms_client();
        u.getDNI_client();
        u.getNº_compteclient();
        u.getNom_client();
    }
    /**

Mètode que permet canviar a la vista principal de l'aplicació
@throws IOException excepció que salta quan no es pot canviar de vista
*/

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("secondry1");
    }
    /**

Mètode que permet canviar a la vista de gestió de comptes bancaris del client loggejat
@throws IOException excepció que salta quan no es pot canviar de vista
*/
     @FXML
    private void escull() throws IOException {
        App.setRoot("comptes");
    }
    /**

Mètode que permet canviar a la vista de gestió de préstecs bancaris del client loggejat
@throws IOException excepció que salta quan no es pot canviar de vista
*/
     @FXML
    private void prestamo() throws IOException {
        App.setRoot("prestec");
    }
    @FXML
    private void facturas() throws IOException {
        App.setRoot("factures");
    }
     @FXML
    private void cheque() throws IOException {
        App.setRoot("cheque");
    }
}
 