module com.br.icev.stack {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.stack to javafx.fxml;
    exports com.stack;
}