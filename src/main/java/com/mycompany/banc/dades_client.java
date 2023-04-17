package com.mycompany.banc;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class dades_client {
   

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("secondry1");
    }
     @FXML
    private void escull() throws IOException {
        App.setRoot("comptes");
    }
}
 