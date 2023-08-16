module com.example.employeeapplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.employeeapplication to javafx.fxml;
    exports com.example.employeeapplication;
}