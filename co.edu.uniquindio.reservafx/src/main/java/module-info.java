module co.edu.uniquindio.reserva.reservaapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.reserva.reservaapp to javafx.fxml;
    exports co.edu.uniquindio.reserva.reservaapp;

    opens co.edu.uniquindio.reserva.reservaapp.controller;
    exports co.edu.uniquindio.reserva.reservaapp.controller;
//    opens co.edu.uniquindio.reserva.reservaapp.model;
}