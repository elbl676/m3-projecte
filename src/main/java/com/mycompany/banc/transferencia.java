/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banc;

import static com.mycompany.banc.Banc.obtenerFechaActual;
import java.io.IOException;
import java.util.ArrayList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/**
 *
 * @author jjavi
 */
public class transferencia {
    
    
    double saldoActual;
 
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
   public ComboBox transferir;
      @FXML
      public TextField total;
       @FXML
      public TextField total1;
    @FXML
   public Button depositar;
     @FXML
   public Button saldo;
   
/*
* Realitza una operació d'ingrés quan es prem el botó corresponent.
* Llegeix els valors dels menús desplegables de quantitat, calcula l'import total,
* actualitza el saldo de l'usuari i mostra el resultat en pantalla.
*
* @param event L'esdeveniment que s'activa en prémer el botó "dipositar".
*/  
    
public void depositar(ActionEvent event) {
    boolean registroExitoso = false;
    System.out.println(quantitat20.getValue());
    int iquantitat20 = Integer.parseInt(quantitat20.getValue().toString());
    int iquantitat50 = Integer.parseInt(quantitat50.getValue().toString());
    int iquantitat100 = Integer.parseInt(quantitat100.getValue().toString());
   

    double cantidadTotal = iquantitat20 * 20.0+ iquantitat50 * 50 + iquantitat100 * 100;
    saldoActual = cantidadTotal;

     double Saldo=saldoActual-cantidadTotal;

     total.setText("Enhoraba has realitzat la transferencia de: €" + saldoActual);
     double Saldo_client=App.banc.getUsuariActual().getSaldo();

   
double saldo_Final=Saldo_client+saldoActual;  
 total1.setText(" €" + saldo_Final);
 
 
String nom_client = App.banc.getUsuariActual().getNom_client();
double saldoTransferencia = saldoActual; // Saldo para la transferencia
double saldoExtraccion = saldoActual; // Saldo para la extracción
String data = obtenerFechaActual();

// Crear una instancia del movimiento de transferencia
String tipusMov = "Transferencia";
Movimientos movimientotransferencia = new Movimientos(nom_client, tipusMov, saldoTransferencia, data);
Movimientos.MOV.add(movimientotransferencia);

// Llamar al método guardarMovs() y verificar el resultado
 registroExitoso = Movimientos.guardarMovs();

if (registroExitoso) {
    // El registro se realizó correctamente
    System.out.println("El registro de la transferencia se realizó correctamente");
} else {
    // Hubo un error en el registro
    System.out.println("Error al realizar el registro de la transferencia");
}


     


}

/*
* Inicialitza la pantalla de transferència, configurant els menús desplegables de quantitat
* i el menú desplegable de la llista d'usuaris.
*/

     @FXML
    void initialize() {
         Usuario u = App.banc.getUsuariActual();
       quantitat20.getItems().addAll("0","1","2","3","4","5","6","7","8","9","10");
        quantitat50.getItems().addAll("0","1","2","3","4","5","6","7","8","9","10");
         quantitat100.getItems().addAll("0","1","2","3","4","5","6","7","8","9","10");
        
       
    total1.setText(String.valueOf(u.getSaldo()));

    //VBox vbox = new VBox();
    transferir.getItems().addAll(App.banc.getUsuarios());  
    for (Usuario usuario : App.banc.getUsuarios()) {
      
       

    
    }
    }
    
/*
* Canvia a la pantalla de confirmació de transferència quan es prem el botó "confirmar".
*/
   @FXML
private void transferir() throws IOException {
   App.setRoot("res_transferencia");
}
  /*
* Canvia a la pantalla de confirmació de transferència quan es prem el botó "menu".
*/  
@FXML
private void menu() throws IOException {
    App.setRoot("secondry1");
}
}



 
 

  
 
    

 