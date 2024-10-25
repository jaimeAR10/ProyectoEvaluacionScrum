package es.iesjandula.ProyectoEvaluacionesScrum.Model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Nota {
    @EmbeddedId
    private Alumno evaluado;
    private Evaluacion evaluacion;
    private Alumno evaluador;

}
