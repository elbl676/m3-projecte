/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author jjavi
 */
public class Movimiento {

    public String nom_client;
    public String tipusMov;
    public float saldo;
    public String data;
    
    public static final String MOVIMENTS = "MOVIMENTS.csv";
    public static ArrayList<Movimiento> MOV = new ArrayList<>();
    private static final String DELIMITADOR = ",";

    public Movimiento(String usuario, String tipoMov, float saldo) {
        this.nom_client = usuario;
        this.tipusMov = tipoMov;
        this.saldo = saldo;
        this.data= data;
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

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

   
    
    /**

    Carga los movimientos desde un archivo de texto y los almacena en la lista Mov.
    @throws FileNotFoundException si el archivo de movimientos no se encuentra en la ruta especificada.
    @throws IOException si ocurre un error al leer el archivo de movimientos.
    */
    
    public static void cargarMovs(){
        try (BufferedReader reader = new BufferedReader(new FileReader (MOVIMENTS))){
            String linea;
            while ((linea = reader.readLine()) != null){
                String[] sep = linea.split(DELIMITADOR);
                float saldo = Float.parseFloat(sep[2]);
                Movimiento movimiento = new Movimiento(sep[0], sep[1], saldo);
                MOV.add(movimiento);
            }
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e){
            System.out.println("ERROR");
        }
                
    }
    
    /**

    Guarda los movimientos almacenados en la lista Mov en un archivo de texto.
    @throws IOException si ocurre un error al escribir en el archivo de movimientos.
    */
    
    public static void guardarMovs(){
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(MOVIMENTS));
            for (Movimiento movimientos : MOV) {
                writer.write(String.valueOf(movimientos.getNom_client()));
                writer.write(",");
                writer.write(String.valueOf(movimientos.getTipusMov()));
                writer.write(",");
                writer.write(String.valueOf(movimientos.getSaldo()));
                writer.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (writer != null){
                try {
                    writer.close();
                } catch (IOException e){
                  e.printStackTrace();  
                }
            }
        }
    }
    
}
   






    
   

  

    
   



