package es.iesjandula.ProyectoEvaluacionesScrum.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alumno {
    @Id
    private String email;

    private String nombre;

    public Alumno() {

    }

    public Alumno(String email, String nombre) {
        this.email = email;
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
