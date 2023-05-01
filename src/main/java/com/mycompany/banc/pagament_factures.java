
/*

Aquesta classe gestiona el pagament de factures, i les mostra en una àrea de text. També comprova si el fitxer existeix
i el llegeix si existeix, i mostra el saldo de l'usuari.
*/
package com.mycompany.banc;

import static com.mycompany.banc.dades_peticions.fileExists;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/*

La classe pagament_facturis gestiona el pagament de factures, i les mostra en una àrea de text. També comprova si el fitxer existeix

i el llegeix si existeix, i mostra el saldo de l'usuari.

@autor jjavi
*/
public class pagament_factures {
    
/*

L'àrea de text on es mostraran les factures.
*/
     @FXML
private TextArea factura;  
     
/*

El camp de text on es mostrarà el saldo de l'usuari.
*/
     @FXML
private TextField saldo; 
     /**
     * Ruta de l'arxiu de llista de factures.
     */
     
     private String path = "facturas.txt";
     /**
     * Comprova si l'arxiu existeix.
     *
     * @param path Ruta de l'arxiu a comprovar.
     * @return Retorna `true` si l'arxiu existeix, `false` en cas contrari.
     */
      public static boolean fileExists(String path) {
        File file = new File(path);
        return file.exists();
    }
      /**
     * Llegeix l'arxiu especificat per la ruta `path` i mostra el contingut per consola.
     *
     * @param path Ruta de l'arxiu a llegir.
     * @throws FileNotFoundException Es llençarà si l'arxiu no es pot trobar.
     */
      public static void readFile(String path) throws FileNotFoundException {
        File file = new File(path);
        if (file.exists()) {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } else {
            System.out.println("No existeix l'arxiu");
        }
    }
    
     /**
     * Mètode que s'executa al inicialitzar la classe.
     * Si l'arxiu de peticions de préstec existeix, es mostra el seu contingut a l'àrea de text `arxiu`.
     */  
      @FXML
void initialize() {
    if (fileExists(path)) {
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
                factura.appendText(line + "\n");
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    } else {
        System.out.println("No existeix l'arxiu");
    }
    Usuario u = App.banc.getUsuariActual();
        u.getPassword();
        u.getUsername();
        saldo.setText(String.valueOf(u.getSaldo()));
        
        u.getSaldo();
       
}
/**
     * Mètode que es crida al clicar el botó "Menu".
     * Canvia la vista a la pantalla principal del programa.
     *
     * @throws IOException Es llençarà si no es pot carregar la vista.
     */
@FXML
    private void menu() throws IOException {
        App.setRoot("secondry1");
    }
}
