package es.iesjandula.ProyectoEvaluacionesScrum.Model;

import jakarta.persistence.EmbeddedId;

import java.io.Serializable;
import java.util.Objects;


public class Nota implements Serializable {
    @EmbeddedId
    private Alumno evaluado;
    private Evaluacion evaluacion;
    private Alumno evaluador;

    public Nota(Alumno evaluado, Evaluacion evaluacion, Alumno evaluador) {
        this.evaluado = evaluado;
        this.evaluacion = evaluacion;
        this.evaluador = evaluador;
    }

    public Nota() {}

    public Alumno getEvaluado() {
        return evaluado;
    }

    public void setEvaluado(Alumno evaluado) {
        this.evaluado = evaluado;
    }

    public Evaluacion getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(Evaluacion evaluacion) {
        this.evaluacion = evaluacion;
    }

    public Alumno getEvaluador() {
        return evaluador;
    }

    public void setEvaluador(Alumno evaluador) {
        this.evaluador = evaluador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nota nota = (Nota) o;
        return Objects.equals(evaluado, nota.evaluado) &&
                Objects.equals(evaluacion, nota.evaluacion) &&
                Objects.equals(evaluador, nota.evaluador);

    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluado, evaluacion, evaluador);
    }
}
