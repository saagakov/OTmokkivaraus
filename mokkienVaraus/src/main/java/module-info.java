module com.example.mokkienvaraus {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.mokkienvaraus to javafx.fxml;
    exports com.example.mokkienvaraus;
}