module com.mycompany.banc {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.banc to javafx.fxml;
    exports com.mycompany.banc;
}
