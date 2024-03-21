package co.edu.uniquindio.reserva.reservaapp.model;

import co.edu.uniquindio.reserva.reservaapp.model.builder.ReservaBuilder;

public class Reserva {
    private String cedula;
    private String nombre;
    private String apellido;
    private String email;
    private int edad;
    private String celular;
    private String tipoHabitacion;


    public Reserva(String cedula,
                   String nombre,
                   String apellido,
                   String email,
                   int edad,
                   String celular,
                   String tipoHabitacion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.edad = edad;
        this.celular = celular;
        this.tipoHabitacion = tipoHabitacion;
    }

    public static ReservaBuilder builder(){
        return new ReservaBuilder();
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
}

