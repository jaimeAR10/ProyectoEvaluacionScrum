package es.iesjandula.ProyectoEvaluacionesScrum.repositories;

import es.iesjandula.ProyectoEvaluacionesScrum.Model.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipoRepository extends JpaRepository<Equipo, Integer> {
}
