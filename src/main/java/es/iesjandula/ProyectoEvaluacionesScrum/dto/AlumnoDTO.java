package es.iesjandula.ProyectoEvaluacionesScrum.dto;

import java.util.List;

public class AlumnoDTO {
    private String email;
    private String nombre;
    private List<Integer> equipos;
    private List<Double> notas;

    public AlumnoDTO(String email, String nombre, List<Integer> equipos, List<Double> notas) {
        this.email = email;
        this.nombre = nombre;
        this.equipos = equipos;
        this.notas = notas;
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

    public List<Integer> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Integer> equipos) {
        this.equipos = equipos;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }
}
