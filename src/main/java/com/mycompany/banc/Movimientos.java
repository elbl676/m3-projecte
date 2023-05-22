package com.mycompany.banc;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javafx.scene.control.TextField;

public class Movimientos {
    public String nom_client;
    public String tipusMov;
    public double saldo;
    public String data;
    public String nom_bitllets;
    public double num_bitllets;
    public double numBitllets50; // Agrega la variable numBitllets50
    public double numBitllets100; // Agrega la variable numBitllets100
    public TextField saldoTextField; // Agrega el objeto TextField saldoTextField

    public static final String MOVIMENTS = "MOVIMENTS.csv";
    public static ArrayList<Movimientos> MOV = new ArrayList<>();
    private static final String DELIMITADOR = ",";

    public Movimientos(String nom_client, String tipusMov, double saldo, String data, String nom_Bitllets, double num_bitllets, double numBitllets50, double numBitllets100) {
        this.nom_client = nom_client;
        this.tipusMov = tipusMov;
        this.saldo = saldo;
        this.data = data;
        this.nom_bitllets = nom_Bitllets;
        this.num_bitllets = num_bitllets;
        this.numBitllets50 = numBitllets50; // Inicializa numBitllets50
        this.numBitllets100 = numBitllets100; // Inicializa numBitllets100
    }

    public String getNom_client() {
        return nom_client;
    }

    public void setNom_client(String nom_client) {
        this.nom_client = nom_client;
    }

    public String getTipusMov() {
        return tipusMov;
    }

    public void setTipusMov(String tipusMov) {
        this.tipusMov = tipusMov;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNom_bitllets() {
        return nom_bitllets;
    }

    public void setNom_bitllets(String nom_bitllets) {
        this.nom_bitllets = nom_bitllets;
    }

    public double getNum_bitllets() {
        return num_bitllets;
    }

    public void setNum_bitllets(double num_bitllets) {
        this.num_bitllets = num_bitllets;
    }

    public TextField getSaldoTextField() {
        return saldoTextField;
    }

    // ... Resto del código
    public void setSaldoTextField(TextField saldoTextField) {
        this.saldoTextField = saldoTextField;
    }

    public double getNumBitllets50() {
        return numBitllets50;
    }

    public void setNumBitllets50(double numBitllets50) {
        this.numBitllets50 = numBitllets50;
    }

    public double getNumBitllets100() {
        return numBitllets100;
    }

    public void setNumBitllets100(double numBitllets100) {
        this.numBitllets100 = numBitllets100;
    }

   public static boolean guardarMovs() {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(MOVIMENTS));
            for (Movimientos movimientos : MOV) {
                writer.write(String.valueOf(movimientos.getNom_client()));
                writer.write(",");
                writer.write(String.valueOf(movimientos.getTipusMov()));
                writer.write(",");
                writer.write(String.valueOf(movimientos.getSaldo()));
                writer.write(",");
                writer.write(String.valueOf(movimientos.getData()));
                writer.write(",");
                writer.write(String.valueOf(movimientos.getNom_bitllets()));
                writer.write(",");
                writer.write(String.valueOf(movimientos.getNum_bitllets()));
                writer.write(",");
                writer.write(String.valueOf(movimientos.getNumBitllets50()));
                writer.write(",");
                writer.write(String.valueOf(movimientos.getNumBitllets100()));
                writer.newLine();
            }
            writer.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

  public static void actualizarCantidades() {
    for (Movimientos movimiento : MOV) {
        String nom_client = movimiento.getNom_client();
        Usuario usuario = null;
        for (Usuario u : App.banc.getUsuarios()) {
            if (u.getNom_client().equals(nom_client)) {
                usuario = u;
                break;
            }
        }
        if (usuario != null) {
            int iquantitat20 = (int) movimiento.getNum_bitllets();
            int iquantitat50 = (int) movimiento.getNumBitllets50();
            int iquantitat100 = (int) movimiento.getNumBitllets100();

            if (movimiento.getTipusMov().equals("Ingreso")) {
                usuario.setBitllets_20(usuario.getBitllets_20() + iquantitat20);
                usuario.setBitllets_50(usuario.getBitllets_50() + iquantitat50);
                usuario.setBitllets_100(usuario.getBitllets_100() + iquantitat100);
            } // ...

else if (movimiento.getTipusMov().equals("Transferencia") || movimiento.getTipusMov().equals("Extracción")) {
    int total20 = (int) usuario.getBitllets_20();
    int total50 = (int) usuario.getBitllets_50() + iquantitat50;  // Aquí se está sumando en lugar de restar
    int total100 = (int) usuario.getBitllets_100();

    // Verificar si hay suficientes billetes para restar
    if (total20 >= iquantitat20 && total50 >= iquantitat50 && total100 >= iquantitat100) {
        usuario.setBitllets_20(total20 - iquantitat20);
        usuario.setBitllets_50(total50 - iquantitat50);  // Aquí se debe restar en lugar de sumar
        usuario.setBitllets_100(total100 - iquantitat100);
    } else {
        System.out.println("No hay suficientes billetes para realizar la operación.");
    }
}

// ...

            }
        }
    }
}

  





