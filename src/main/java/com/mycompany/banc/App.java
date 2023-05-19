package com.mycompany.banc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javafx.fxml.FXML;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    
    static Banc banc = new Banc();
    static com.mycompany.banc.clients clients = new clients("nom", "cognoms", "er", "Nº_compte","Nº_Tarjeta");
     
    private static Object getInstance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 650, 500);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        // Inicializar la lista de transacciones del usuario actual
    
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
   





}