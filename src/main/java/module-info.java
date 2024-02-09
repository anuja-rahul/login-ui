module org.example.loginui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.example.loginui to javafx.fxml;
    exports org.example.loginui;
}