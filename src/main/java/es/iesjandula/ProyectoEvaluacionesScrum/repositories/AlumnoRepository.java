package es.iesjandula.ProyectoEvaluacionesScrum.repositories;

import es.iesjandula.ProyectoEvaluacionesScrum.Model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {
}
