module com.example.sd {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sd to javafx.fxml;
    exports com.example.sd;
}