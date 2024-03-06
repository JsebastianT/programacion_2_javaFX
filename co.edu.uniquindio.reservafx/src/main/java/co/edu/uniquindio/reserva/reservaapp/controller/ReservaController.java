package co.edu.uniquindio.reserva.reservaapp.controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.reserva.reservaapp.model.Reserva;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ReservaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAgregarReserva;

    @FXML
    private RadioButton rbtnHabitacionDoble;

    @FXML
    private RadioButton rbtnHabitacionFamiliar;

    @FXML
    private RadioButton rbtnHabitacionSencilla;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtCelular;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextArea txtResultado;

    @FXML
    void onAgregarReserva(ActionEvent event) {
        agregarReserva();
    }

    @FXML
    void initialize() {

    }

    private void agregarReserva() {
        Reserva reserva = new Reserva();

        reserva.setNombre(txtNombre.getText());
        reserva.setApellido(txtApellido.getText());
        reserva.setCedula(txtCedula.getText());
        reserva.setEdad(Integer.parseInt(txtEdad.getText()));
        reserva.setEmail(txtEmail.getText());
        reserva.setCelular(txtCelular.getText());

        // Agregar el tipo de habitación seleccionado
        String tipoHabitacion = "";
        if (rbtnHabitacionDoble.isSelected()) {
            tipoHabitacion = "Doble";
        } else if (rbtnHabitacionFamiliar.isSelected()) {
            tipoHabitacion = "Familiar";
        } else if (rbtnHabitacionSencilla.isSelected()) {
            tipoHabitacion = "Sencilla";
        }
        reserva.setTipoHabitacion(tipoHabitacion);

        txtResultado.setText(reserva.toString());

    }
}

