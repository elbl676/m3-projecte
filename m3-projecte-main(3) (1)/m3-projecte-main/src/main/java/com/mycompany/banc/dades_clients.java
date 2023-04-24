/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banc;

/**
 *
 * @author alumne
 */
public class dades_clients {
    private String Nom;
    private String cognoms;
    private String DNI;
    private String Nº_compte;
    
    

    public dades_clients (String Nom, String cognoms,String DNI,String Nº_compte) {
        this.Nom = Nom;
        this.cognoms = cognoms;
        this.DNI = DNI;
        this.Nº_compte = Nº_compte;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNº_compte() {
        return Nº_compte;
    }

    public void setNº_compte(String Nº_compte) {
        this.Nº_compte = Nº_compte;
    }
    
}
