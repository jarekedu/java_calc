module com.example.lab11_javafx_kalkulator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab11_javafx_kalkulator to javafx.fxml;
    exports com.example.lab11_javafx_kalkulator;
}