package com.mycompany.banc;

import static com.mycompany.banc.Banc.obtenerFechaActual;
import java.io.IOException;
import java.util.ArrayList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

 public class transferencia {

    double saldoActual;

    @FXML
    public Button Depositar;
    @FXML
    public Button ingres;

    @FXML
    public ComboBox<Integer> quantitat20;
    @FXML
    public ComboBox<Integer> quantitat50;
    @FXML
    public ComboBox<Integer> quantitat100;
    @FXML
    public ComboBox<Usuario> transferir;
    @FXML
    public TextField total;
    @FXML
    public TextField total1;
    @FXML
    public Button depositar;
    @FXML
    public Button saldo;

   public void depositar(ActionEvent event) {
    boolean registroExitoso = false;
    boolean guardadoExitoso = Movimientos.guardarMovs();

    if (quantitat20.getValue() != null && quantitat50.getValue() != null && quantitat100.getValue() != null) {
        int iquantitat20 = Integer.parseInt(quantitat20.getValue().toString());
        int iquantitat50 = Integer.parseInt(quantitat50.getValue().toString());
        int iquantitat100 = Integer.parseInt(quantitat100.getValue().toString());

        double cantidadTotal = iquantitat20 * 20.0 + iquantitat50 * 50 + iquantitat100 * 100;
        saldoActual = cantidadTotal;

        total.setText("Enhorabuena, has ingresado: €" + saldoActual);

        // Restar los valores de los billetes al objeto Usuario
        App.banc.getUsuariActual().setBitllets_20(App.banc.getUsuariActual().getBitllets_20() - iquantitat20);
        App.banc.getUsuariActual().setBitllets_50(App.banc.getUsuariActual().getBitllets_50() - iquantitat50);
        App.banc.getUsuariActual().setBitllets_100(App.banc.getUsuariActual().getBitllets_100() - iquantitat100);

        double saldoCliente = App.banc.getUsuariActual().getSaldo();
        double saldoFinal = saldoCliente - saldoActual;
        App.banc.getUsuariActual().setSaldo(saldoFinal);
            String nomClient = App.banc.getUsuariActual().getNom_client();
            double saldoIngreso = saldoActual;
            String fecha = obtenerFechaActual();

            // Crear una instancia del movimiento de ingreso
            String tipoMovimiento = "transferencia";
            String nomBitllets = iquantitat20 + "x20€, " + iquantitat50 + "x50€, " + iquantitat100 + "x100€";
            double numBitllets20 = App.banc.getUsuariActual().getBitllets_20();
            double numBitllets50 = App.banc.getUsuariActual().getBitllets_50();
            double numBitllets100 = App.banc.getUsuariActual().getBitllets_100();

            Movimientos movimientoIngreso = new Movimientos(nomClient, tipoMovimiento, saldoIngreso, fecha, nomBitllets, numBitllets20, numBitllets50, numBitllets100);
            Movimientos.MOV.add(movimientoIngreso);

            // Llamar al método guardarMovs() y verificar el resultado
            registroExitoso = Movimientos.guardarMovs();
            if (registroExitoso) {
                System.out.println("El registro del movimiento de transferencia fue exitoso.");
            } else {
                System.out.println("Error al guardar el movimiento de ingreso.");
            }
        }
    }

    @FXML
    void initialize() {
        Usuario u = App.banc.getUsuariActual();
        quantitat20.getItems().addAll(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        quantitat50.getItems().addAll(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        quantitat100.getItems().addAll(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        total1.setText(String.valueOf(u.getSaldo()));

        transferir.getItems().addAll(App.banc.getUsuarios());
    }

    @FXML
    private void transferir() throws IOException {
        App.setRoot("res_transferencia");
    }

    @FXML
    private void menu() throws IOException {
        App.setRoot("secondry1");
    }
}
