package es.iesjandula.ProyectoEvaluacionesScrum.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.List;

@Entity
public class Alumno {
    @Id
    private String email;

    private String nombre;

    @ManyToMany(mappedBy = "alumnos")
    private List<Evaluacion> evaluaciones;

    @ManyToMany(mappedBy = "alumnos")
    private List<Equipo> equipos;

    public Alumno() {

    }

    public Alumno(String nombre) {
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
