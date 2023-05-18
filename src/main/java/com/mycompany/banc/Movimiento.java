package com.mycompany.banc;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Movimiento {
    public String nom_client;
    public String tipusMov;
    public double saldo;
    public String data;

    public static final String MOVIMENTS = "MOVIMENTS.csv";
    public static ArrayList<Movimiento> MOV = new ArrayList<>();
    private static final String DELIMITADOR = ",";

    public Movimiento(String nom_client, String tipusMov, double saldo, String data) {
    this.nom_client = nom_client;
    this.tipusMov = tipusMov;
    this.saldo = saldo;
    this.data = data;
}

    public static ArrayList<Movimiento> getMOV() {
        return MOV;
    }

    public static void setMOV(ArrayList<Movimiento> MOV) {
        Movimiento.MOV = MOV;
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
   


    /**
     * Guarda los movimientos almacenados en la lista Mov en un archivo de texto.
     *
     * @throws IOException si ocurre un error al escribir en el archivo de movimientos.
     */
    public static boolean guardarMovs() {
    BufferedWriter writer = null;
    try {
        writer = new BufferedWriter(new FileWriter(MOVIMENTS));
        for (Movimiento movimientos : MOV) {
            writer.write(String.valueOf(movimientos.getNom_client()));
            writer.write(",");
            writer.write(String.valueOf(movimientos.getTipusMov()));
            writer.write(",");
            writer.write(String.valueOf(movimientos.getSaldo()));
            writer.write(",");
            writer.write(String.valueOf(movimientos.getData()));
            writer.newLine();
        }
        writer.close(); // Cierra el BufferedWriter después de escribir los datos correctamente
        return true; // Retorna true si el guardado fue exitoso
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
    return false; // Retorna false si hubo algún error en el guardado
}

    CharSequence getFecha() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   

}
 




    

   






    
   

  

    
   



