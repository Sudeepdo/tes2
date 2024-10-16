module com.example.classact2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.classact2 to javafx.fxml;
    exports com.example.classact2;
}