package es.iesjandula.ProyectoEvaluacionesScrum.repositories;

import es.iesjandula.ProyectoEvaluacionesScrum.Model.Evaluacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvaluacionRepository extends JpaRepository<Evaluacion, Long> {

}