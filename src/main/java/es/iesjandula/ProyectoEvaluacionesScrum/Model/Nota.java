package es.iesjandula.ProyectoEvaluacionesScrum.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;


@Entity
public class Nota {

    @EmbeddedId
    private NotaId notaId;

    @ElementCollection
    private List<Integer> respuestas;

    //relaciones
    @ManyToOne
    @MapsId("evaluacionId")
    @JoinColumn(name = "evaluacion_id")
    @JsonManagedReference
    private Evaluacion evaluacion;

    @ManyToMany
    @MapsId("evaluador")
    @JoinTable(name = "nota_alumno",
            joinColumns = @JoinColumn(name = "nota_id"),
            inverseJoinColumns = @JoinColumn(name = "alumno_id")
    )
    private List<Alumno> evaluadores;

    @ManyToMany
    @MapsId("evaluado")
    @JoinTable(name = "nota_alumno",
            joinColumns = @JoinColumn(name = "nota_id"),
            inverseJoinColumns = @JoinColumn(name = "alumno_id")
    )
    private List<Alumno> evaluados;

    //contructores
    public Nota() {}

    public Nota(NotaId notaId, List<Integer> respuestas) {
        this.notaId = notaId;
        this.respuestas = respuestas;
    }

    // Getters and setters
    public NotaId getNotaId() {
        return notaId;
    }

    public void setNotaId(NotaId notaId) {
        this.notaId = notaId;
    }

    public List<Integer> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(List<Integer> respuestas) {
        this.respuestas = respuestas;
    }

    public Evaluacion getEvaluacion() {
        return evaluacion;
    }
    public void setEvaluacion(Evaluacion evaluacion) {
        this.evaluacion = evaluacion;
    }
//getters y setters relaciones

    public List<Alumno> getEvaluadores() {
        return evaluadores;
    }

    public void setEvaluadores(List<Alumno> evaluadores) {
        this.evaluadores = evaluadores;
    }

    public List<Alumno> getEvaluado() {
        return evaluados;
    }

    public void setEvaluado(List<Alumno> evaluados) {
        this.evaluados = evaluados;
    }
}
