/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banc;

public class Usuario {
    private String username;
    private String password;
     private String Nom_client;
    private String cognoms_client;
    private String DNI_client;
    private String Nº_compteclient;
     private String Nº_tarjeta;
     private double saldo;
    

    public Usuario(String username, String password, String nom_client, String cognoms_client, String dni_client, String nº_compteclient, String nº_Tarjetaclient, int Saldo_client) {
        this.username = username;
        this.password = password;
         this.DNI_client=dni_client;
        this.Nom_client=nom_client;
        this.Nº_compteclient=nº_compteclient;
        this.cognoms_client=cognoms_client;
        this.Nº_tarjeta=nº_Tarjetaclient;
       this.saldo=Saldo_client;
    }

    public String getNom_client() {
        return Nom_client;
    }

    public void setNom_client(String Nom_client) {
        this.Nom_client = Nom_client;
    }

    public String getCognoms_client() {
        return cognoms_client;
    }

    public void setCognoms_client(String cognoms_client) {
        this.cognoms_client = cognoms_client;
    }

    public String getDNI_client() {
        return DNI_client;
    }

    public void setDNI_client(String DNI_client) {
        this.DNI_client = DNI_client;
    }

    public String getNº_compteclient() {
        return Nº_compteclient;
    }

    public void setNº_compteclient(String Nº_compteclient) {
        this.Nº_compteclient = Nº_compteclient;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNº_tarjeta() {
        return Nº_tarjeta;
    }

    public void setNº_tarjeta(String Nº_tarjeta) {
        this.Nº_tarjeta = Nº_tarjeta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return Nº_compteclient ;
    }
    
    

    

   
    
   
}


    



    

   


    
 

    

    



