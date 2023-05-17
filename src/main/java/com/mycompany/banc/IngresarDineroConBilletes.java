package com.mycompany.banc;

import static com.mycompany.banc.Banc.obtenerFechaActual;
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
 * Classe que implementa la funcionalitat d'ingressar diners en efectiu al compte bancari de l'usuari.
 * Aquesta classe és utilitzada per la classe App per mostrar la interfície gràfica corresponent.
 * 
 * Els controls de la interfície estan definits com a atributs de la classe per poder accedir-hi des dels mètodes.
 * 
 * Aquesta classe també conté una instància de la classe Banc per accedir al compte bancari de l'usuari.
 * 
 * @author jjavi
 */
public class IngresarDineroConBilletes {

    /**
     * Botó per depositar els diners en el compte bancari.
     */
    @FXML
   public Button Depositar;

   /**
     * Botó per tornar a la pàgina d'ingressar diners.
     */
    @FXML
   public Button ingres;
    
    /**
     * Menú desplegable per seleccionar la quantitat de bitllets de 20€.
     */
    @FXML
   public ComboBox quantitat20;

   /**
     * Menú desplegable per seleccionar la quantitat de bitllets de 50€.
     */
    @FXML
   public ComboBox quantitat50;

   /**
     * Menú desplegable per seleccionar la quantitat de bitllets de 100€.
     */
    @FXML
   public ComboBox quantitat100;

    /**
     * Caixa de text per mostrar el total dels diners ingressats en efectiu.
     */
    @FXML
      public TextField total;

   /**
     * Caixa de text per mostrar el saldo final del compte bancari.
     */
      @FXML
    private TextField saldo;

 /**
     * Instància de la classe Banc per accedir al compte bancari de l'usuari actual.
     */
    private Banc banc = App.banc;

    /**
     * Saldo actual del compte bancari de l'usuari.
     */

double saldoActual;
 /**
     * Mètode que es crida quan es fa clic al botó Depositar.
     * Aquest mètode recupera les quantitats de bitllets seleccionades pels menús desplegables,
     * calcula el total dels diners ingressats i actualitza el saldo del compte bancari de l'usuari.
     * 
     * @param event Event que es dispara quan es fa clic al botó Depositar.
     */
     public void depositar(ActionEvent event) {
        boolean registroExitoso = false;
        boolean guardadoExitoso = Movimiento.guardarMovs();

        if (quantitat20.getValue() != null && quantitat50.getValue() != null && quantitat100.getValue() != null) {
            int iquantitat20 = Integer.parseInt(quantitat20.getValue().toString());
            int iquantitat50 = Integer.parseInt(quantitat50.getValue().toString());
            int iquantitat100 = Integer.parseInt(quantitat100.getValue().toString());

            double cantidadTotal = iquantitat20 * 20.0 + iquantitat50 * 50 + iquantitat100 * 100;
            saldoActual = cantidadTotal;

            double Saldo = saldoActual - cantidadTotal;

            total.setText("Enhoraba has ingresat: €" + saldoActual);
            double Saldo_client = App.banc.getUsuariActual().getSaldo();

            double saldo_Final = Saldo_client + saldoActual;
            saldo.setText(" €" + saldo_Final);

            // Crear una instancia del movimiento de ingreso
            String nom_client = App.banc.getUsuariActual().getNom_client();
            String tipusMov = "Ingreso";
            double saldo = saldoActual;
            String data = obtenerFechaActual();

            Movimiento movimientoIngreso = new Movimiento(nom_client, tipusMov, saldo, data);

            // Agregar el movimiento de ingreso a la lista MOV
            Movimiento.MOV.add(movimientoIngreso);

            // Llamar al método guardarMovs() y verificar el resultado
            if (Movimiento.guardarMovs()) {
                registroExitoso = true;
            }
        } else {
            // Manejar el caso en el que no se haya seleccionado ningún valor en el ComboBox
            // Mostrar un mensaje de error o realizar alguna acción adecuada
        }

        if (registroExitoso) {
            // El registro se realizó correctamente
            System.out.println("El registro se realizó correctamente");
        } else {
            // Hubo un error en el registro
            System.out.println("Error al realizar el registro");
        }
        
        // Crear una instancia del movimiento de ingreso
    String nom_client = App.banc.getUsuariActual().getNom_client();
    String tipusMov = "Ingreso";
    double saldo = saldoActual;
    String data = obtenerFechaActual();

    Movimiento movimientoIngreso = new Movimiento(nom_client, tipusMov, saldo, data);
     

    // Agregar el movimiento de ingreso a la lista MOV
    Movimiento.MOV.add(movimientoIngreso);
     

    // Llamar al método guardarMovs() y verificar si el guardado fue exitoso
     guardadoExitoso = Movimiento.guardarMovs();

    if (guardadoExitoso) {
        // Realizar acciones adicionales si el guardado fue exitoso, por ejemplo, mostrar un mensaje de éxito
        System.out.println("Los movimientos se han guardado correctamente en el archivo MOVIMENTS.csv");
    } else {
        // Realizar acciones adicionales si hubo un error en el guardado, por ejemplo, mostrar un mensaje de error
        System.out.println("Ha ocurrido un error al guardar los movimientos");
    }
    
    // Después de guardar el movimiento de ingreso, agregar el movimiento de extracción y guardar en el archivo CSV
Movimiento movimientoExtraccion = new Movimiento(nom_client, "Extracción", saldo, data);
Movimiento.MOV.add(movimientoExtraccion);

// Llamar al método guardarMovs() y verificar si el guardado fue exitoso


if (guardadoExitoso) {
    // Realizar acciones adicionales si el guardado fue exitoso, por ejemplo, mostrar un mensaje de éxito
    System.out.println("Los movimientos se han guardado correctamente en el archivo MOVIMENTS.csv");
} else {
    // Realizar acciones adicionales si hubo un error en el guardado, por ejemplo, mostrar un mensaje de error
    System.out.println("Ha ocurrido un error al guardar los movimientos");
}

  guardadoExitoso = Movimiento.guardarMovs();

    if (guardadoExitoso) {
        // Realizar acciones adicionales si el guardado fue exitoso, por ejemplo, mostrar un mensaje de éxito
        System.out.println("Los movimientos se han guardado correctamente en el archivo MOVIMENTS.csv");
    } else {
        // Realizar acciones adicionales si hubo un error en el guardado, por ejemplo, mostrar un mensaje de error
        System.out.println("Ha ocurrido un error al guardar los movimientos");
    }
    
    // Después de guardar el movimiento de ingreso, agregar el movimiento de extracción y guardar en el archivo CSV
Movimiento movimientotransferencia = new Movimiento(nom_client, "transferencia", saldo, data);
Movimiento.MOV.add(movimientotransferencia);

// Llamar al método guardarMovs() y verificar si el guardado fue exitoso


if (guardadoExitoso) {
    // Realizar acciones adicionales si el guardado fue exitoso, por ejemplo, mostrar un mensaje de éxito
    System.out.println("Los movimientos se han guardado correctamente en el archivo MOVIMENTS.csv");
} else {
    // Realizar acciones adicionales si hubo un error en el guardado, por ejemplo, mostrar un mensaje de error
    System.out.println("Ha ocurrido un error al guardar los movimientos");
}

  guardadoExitoso = Movimiento.guardarMovs();

    if (guardadoExitoso) {
        // Realizar acciones adicionales si el guardado fue exitoso, por ejemplo, mostrar un mensaje de éxito
        System.out.println("Los movimientos se han guardado correctamente en el archivo MOVIMENTS.csv");
    } else {
        // Realizar acciones adicionales si hubo un error en el guardado, por ejemplo, mostrar un mensaje de error
        System.out.println("Ha ocurrido un error al guardar los movimientos");
    }
    
    // Después de guardar el movimiento de ingreso, agregar el movimiento de extracción y guardar en el archivo CSV
Movimiento movimientoprestec = new Movimiento(nom_client, "prestec", saldo, data);
Movimiento.MOV.add(movimientoExtraccion);

// Llamar al método guardarMovs() y verificar si el guardado fue exitoso


if (guardadoExitoso) {
    // Realizar acciones adicionales si el guardado fue exitoso, por ejemplo, mostrar un mensaje de éxito
    System.out.println("Los movimientos se han guardado correctamente en el archivo MOVIMENTS.csv");
} else {
    // Realizar acciones adicionales si hubo un error en el guardado, por ejemplo, mostrar un mensaje de error
    System.out.println("Ha ocurrido un error al guardar los movimientos");
}
  guardadoExitoso = Movimiento.guardarMovs();

    if (guardadoExitoso) {
        // Realizar acciones adicionales si el guardado fue exitoso, por ejemplo, mostrar un mensaje de éxito
        System.out.println("Los movimientos se han guardado correctamente en el archivo MOVIMENTS.csv");
    } else {
        // Realizar acciones adicionales si hubo un error en el guardado, por ejemplo, mostrar un mensaje de error
        System.out.println("Ha ocurrido un error al guardar los movimientos");
    }
    
    // Después de guardar el movimiento de ingreso, agregar el movimiento de extracción y guardar en el archivo CSV
Movimiento movimientocheque = new Movimiento(nom_client, "cheque", saldo, data);
Movimiento.MOV.add(movimientoExtraccion);

// Llamar al método guardarMovs() y verificar si el guardado fue exitoso


if (guardadoExitoso) {
    // Realizar acciones adicionales si el guardado fue exitoso, por ejemplo, mostrar un mensaje de éxito
    System.out.println("Los movimientos se han guardado correctamente en el archivo MOVIMENTS.csv");
} else {
    // Realizar acciones adicionales si hubo un error en el guardado, por ejemplo, mostrar un mensaje de error
    System.out.println("Ha ocurrido un error al guardar los movimientos");
}




    }


 /**
     * Mètode d'inicialització que s'executa en la creació de la finestra.
     * Omple les caixes de selecció amb valors i mostra el saldo de l'usuari actual.
     */


     @FXML
    void initialize() {
        
       quantitat20.getItems().addAll("0","1","2","3","4","5","6","7","8","9","10");
        quantitat50.getItems().addAll("0","1","2","3","4","5","6","7","8","9","10");
         quantitat100.getItems().addAll("0","1","2","3","4","5","6","7","8","9","10");
         Usuario u = App.banc.getUsuariActual();
        u.getPassword();
        u.getUsername();
        saldo.setText(String.valueOf(u.getSaldo()));

        
        u.getSaldo();
    }
    
    
   /**
     * Canvia la finestra actual a la finestra d'ingrés.
     * 
     * @throws IOException si hi ha un problema al canviar de finestra.
     */
    
         @FXML
    private void switchToingres() throws IOException {
        App.setRoot("secondry1");
    }
        
    }

   
    
   




   

       
    
    
    

