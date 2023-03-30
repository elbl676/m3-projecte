package com.mycompany.banc;

import java.io.IOException;
import javafx.fxml.FXML;

public class dades_client {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("secondry1");
    }
}