module org.example.e1lp1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.sql;

    opens org.example.e1lp1 to javafx.fxml;
    exports org.example.e1lp1;
}