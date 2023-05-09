/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banc;

import java.util.List;


/*
* Representa a un usuari del sistema bancari.
*/
public class Usuario {
    private String username;
    private String password;
     private String Nom_client;
    private String cognoms_client;
    private String DNI_client;
    private String Nº_compteclient;
     private String Nº_tarjeta;
     private double saldo;
     private double import_factures;
      private double saldo_estalvis;
    
   /*
* Crea un nou usuari amb el nom d'usuari, contrasenya, nom, cognoms, ANEU, número de compte, número de targeta i saldo especificats.
*
* @param nom d'usuari el nom d'usuari de l'usuari
* @param password la contrasenya de l'usuari
* @param nom_*client el nom de l'usuari
* @param cognoms_*client el cognom de l'usuari
* @param dni_*client l'ANEU de l'usuari
* @param núm._compteclient número de compte de l'usuari
* @param núm._Tarjetaclient el número de targeta de l'usuari
* @param Saldo_client el saldo de l'usuari
*/
    public Usuario(String username, String password, String nom_client, String cognoms_client, String dni_client, String nº_compteclient, String nº_Tarjetaclient, int Saldo_client, int import_factures, int saldo_estalvis) {
        this.username = username;
        this.password = password;
         this.DNI_client=dni_client;
        this.Nom_client=nom_client;
        this.Nº_compteclient=nº_compteclient;
        this.cognoms_client=cognoms_client;
        this.Nº_tarjeta=nº_Tarjetaclient;
       this.saldo=Saldo_client;
       this.import_factures=import_factures;
    }

    
/*
* Obté el nom de l'usuari.
*
* @return el nom de l'usuari
*/
    public String getNom_client() {
        return Nom_client;
    }

   
/*
* Estableix el nom de l'usuari.
*
* @param Nom_*client el nou nom de l'usuari.
*/
    public void setNom_client(String Nom_client) {
        this.Nom_client = Nom_client;
    }

    
/*
* Obté el cognom de l'usuari.
*
* @return el cognom de l'usuari.
*/
    public String getCognoms_client() {
        return cognoms_client;
    }

  
/*
* Estableix el cognom de l'usuari.
*
* @param cognoms_*client el nou cognom de l'usuari.
*/

    public void setCognoms_client(String cognoms_client) {
        this.cognoms_client = cognoms_client;
    }

   
/*
* Obté l'ANEU de l'usuari.
*
* @return l'ANEU de l'usuari
*/
    public String getDNI_client() {
        return DNI_client;
    }

    
/*
* Estableix l'ANEU de l'usuari.
*
* @param DNI_client el nou ANEU de l'usuari.
*/
    public void setDNI_client(String DNI_client) {
        this.DNI_client = DNI_client;
    }

   
/*
* Obté el número de compte de l'usuari.
*
* @return el número de compte de l'usuari.
*/
    public String getNº_compteclient() {
        return Nº_compteclient;
    }

   
/*
* Estableix el número de compte de l'usuari.
*
* @param Núm._compteclient el nou número de compte de l'usuari.
*/
    public void setNº_compteclient(String Nº_compteclient) {
        this.Nº_compteclient = Nº_compteclient;
    }

   
/*
* Obté el nom d'usuari de l'usuari.
*
* @return el nom d'usuari de l'usuari.
*/
    public String getUsername() {
        return username;
    }

    
/*
* Obté la contrasenya de l'usuari.
*
* @return la contrasenya de l'usuari
*/
    public String getPassword() {
        return password;
    }

    
/*
* Estableix el nom d'usuari de l'usuari.
*
* @param username el nou nom d'usuari de l'usuari.
*/
    public void setUsername(String username) {
        this.username = username;
    }

    
/*
* Estableix la contrasenya de l'usuari.
*
* @param password la nova contrasenya de l'usuari
*/
    public void setPassword(String password) {
        this.password = password;
    }

    /*
* Retorna el número de targeta de l'usuari.
*
* @return El número de targeta de l'usuari.
*/
    public String getNº_tarjeta() {
        return Nº_tarjeta;
    }

   
/*
* Estableix el número de targeta de l'usuari.
*
* @param Núm._targeta El nou número de targeta.
*/

    public void setNº_tarjeta(String Nº_tarjeta) {
        this.Nº_tarjeta = Nº_tarjeta;
    }

    
/*
* Retorna el saldo de l'usuari.
*
* @return El saldo de l'usuari.
*/
    public double getSaldo() {
        return saldo;
    }

    

/*
* Retorna una representació de cadena de l'objecte Usuari.
*
* @return Una representació de cadena de l'objecte Usuari.
*/
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

   
    @Override
    public String toString() {
        return Nº_compteclient ;
    }

    public double getImport_factures() {
        return import_factures;
    }

    public void setImport_factures(double import_factures) {
        this.import_factures = import_factures;
    }

  
    

    

   
    
   
}


    



    

   


    
 

    

    



