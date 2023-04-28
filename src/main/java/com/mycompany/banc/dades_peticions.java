/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 *
 * @author jjavi
 */
public class dades_peticions {
    
 @FXML
private TextArea arxiu;   
    
private String path = "prestecs.txt";
    
    public static boolean fileExists(String path) {
        File file = new File(path);
        return file.exists();
    }

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

  
@FXML
void initialize() {
    if (fileExists(path)) {
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
                arxiu.appendText(line + "\n");
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    } else {
        System.out.println("No existeix l'arxiu");
    }
}


    @FXML
    private void menu() throws IOException {
        App.setRoot("secondry1");
    }
}
