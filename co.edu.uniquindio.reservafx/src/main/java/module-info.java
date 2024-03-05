module co.edu.uniquindio.reserva.reservaapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.reserva.reservaapp to javafx.fxml;
    exports co.edu.uniquindio.reserva.reservaapp;
}