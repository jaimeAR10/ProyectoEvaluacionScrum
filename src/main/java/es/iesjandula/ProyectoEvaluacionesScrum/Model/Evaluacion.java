package es.iesjandula.ProyectoEvaluacionesScrum.Model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Evaluacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private LocalDate fecha;

    //Relaciones
    @ManyToMany
    @JoinTable(name = "alumno_evaluacion",
    joinColumns = @JoinColumn(name = "evaluacion_id"),
    inverseJoinColumns = @JoinColumn(name = "alumno_email")
    )
    private List<Alumno> alumnos;

    @ManyToMany
    @JoinTable(name = "equipo_evaluacion",
    joinColumns = @JoinColumn(name = "evaluacion_id"),
    inverseJoinColumns = @JoinColumn(name = "equipo_id")
    )
    private List<Equipo> equipos;



    public Evaluacion(String nombre, LocalDate fecha) {

        this.nombre = nombre;
        this.fecha = fecha;
    }
    public Evaluacion() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }



    @Override
    public String toString() {
        return "Evaluacion{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
