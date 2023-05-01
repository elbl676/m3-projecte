/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banc;

/**
 * Classe que representa les dades d'un client del banc.
 */
public class dades_clients {
    private String Nom;
    private String cognoms;
    private String DNI;
    private String Nº_compte;
    
    /**
     * Constructor de la classe.
     * @param Nom El nom del client.
     * @param cognoms El cognom del client.
     * @param DNI El DNI del client.
     * @param Nº_compte El número de compte del client.
     */

    public dades_clients (String Nom, String cognoms,String DNI,String Nº_compte) {
        this.Nom = Nom;
        this.cognoms = cognoms;
        this.DNI = DNI;
        this.Nº_compte = Nº_compte;
    }
 /**
     * Getter del nom del client.
     * @return El nom del client.
     */
    public String getNom() {
        return Nom;
    }
/**
     * Setter del nom del client.
     * @param Nom El nom del client.
     */
    public void setNom(String Nom) {
        this.Nom = Nom;
    }
 /**
     * Getter del cognom del client.
     * @return El cognom del client.
     */
    public String getCognoms() {
        return cognoms;
    }
 /**
     * Setter del cognom del client.
     * @param cognoms El cognom del client.
     */
    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }
 /**
     * Getter del DNI del client.
     * @return El DNI del client.
     */
    public String getDNI() {
        return DNI;
    }
/**
     * Setter del DNI del client.
     * @param DNI El DNI del client.
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
 /**
     * Getter del número de compte del client.
     * @return El número de compte del client.
     */
    public String getNº_compte() {
        return Nº_compte;
    }
/**
     * Setter del número de compte del client.
     * @param Nº_compte El número de compte del client.
     */
    public void setNº_compte(String Nº_compte) {
        this.Nº_compte = Nº_compte;
    }
    
}
