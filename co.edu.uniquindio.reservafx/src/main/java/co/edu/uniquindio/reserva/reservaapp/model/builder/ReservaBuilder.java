package co.edu.uniquindio.reserva.reservaapp.model.builder;

import co.edu.uniquindio.reserva.reservaapp.model.Reserva;

public class ReservaBuilder {
    protected String cedula;
    protected String nombre;
    protected String apellido;
    protected String email;
    protected int edad;
    protected String celular;
    protected String tipoHabitacion;

    public ReservaBuilder cedula(String cedula) {
        this.cedula = cedula;
        return this; // Devuelve la instancia actual de ClienteBuilder
    }

    public ReservaBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this; // Devuelve la instancia actual de ClienteBuilder
    }

    public ReservaBuilder apellido(String apellido) {
        this.apellido = apellido;
        return this; // Devuelve la instancia actual de ClienteBuilder
    }

    public ReservaBuilder email(String email) {
        this.email = email;
        return this; // Devuelve la instancia actual de ClienteBuilder
    }

    public ReservaBuilder telefonoFijo(int edad) {
        this.edad = edad;
        return this; // Devuelve la instancia actual de ClienteBuilder
    }

    public ReservaBuilder telefonoCelular(String celular) {
        this.celular = celular;
        return this; // Devuelve la instancia actual de ClienteBuilder
    }

    public ReservaBuilder direccion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
        return this; // Devuelve la instancia actual de ClienteBuilder
    }

    public Reserva build() {
        return new Reserva(cedula, nombre, apellido, email, edad, celular, tipoHabitacion);
    }

}

