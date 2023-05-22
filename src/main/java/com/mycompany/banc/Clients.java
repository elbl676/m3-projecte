/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banc;

import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 * Aquesta classe representa els clients del banc.
 * Conté una llista de clients i diversos mètodes per a gestionar-ne les dades.
 *
 * @author alumne
 */
public class Clients {
    /**
     * Camp de text del nom del client.
     */
    @FXML
    private TextField nomTextField;

    /**
     * Llista de clients.
     */
    private ArrayList<Client> clients;

    /**
     * Constructor per defecte de la classe Clients.
     * Inicialitza la llista de clients amb alguns clients de prova.
     */
    public Clients() {
        clients = new ArrayList<>();
        clients.add(new Client("Joan", "García Fernàndez", "54080799W", "EL9234013865102654781208", "Nº_tarjeta_client"));
        clients.add(new Client("Marc", "Gómez Martínez", "46783456F", "ES4520858343195898054937", "Nº_tarjeta_client"));
        clients.add(new Client("Jordi", "Verges Jimenez", "54783457D", "ES7502391215116358414766", "Nº_tarjeta_client"));
        clients.add(new Client("Alicia", "Marquez Sánchez", "46783456G", "ES4100119674480891876465", "Nº_tarjeta_client"));
        clients.add(new Client("Marti", "contraseña1", "er", "fvhe", "Nº_tarjeta_client"));
    }

    /**
     * Mètode per a gestionar el compte del client.
     */
    public void compte() {
        // Implementa la lógica para gestionar el compte del client
    }

    /**
     * Mètode per a gestionar el compte corrent del client.
     */
    public void comptecorrent() {
        // Implementa la lógica para gestionar el compte corrent del client
    }

    /**
     * Retorna el camp de text del nom del client.
     *
     * @return el camp de text del nom del client
     */
    public TextField getNomTextField() {
        return nomTextField;
    }

    /**
     * Estableix el camp de text del nom del client.
     *
     * @param nomTextField el camp de text del nom del client
     */
    public void setNomTextField(TextField nomTextField) {
        this.nomTextField = nomTextField;
    }

    /**
     * Retorna la llista de clients.
     *
     * @return la llista de clients
     */
    public ArrayList<Client> getClients() {
        return clients;
    }

    /**
     * Estableix la llista de clients.
     *
     * @param clients la llista de clients
     */
    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}
