package es.iesjandula.ProyectoEvaluacionesScrum.services;

import es.iesjandula.ProyectoEvaluacionesScrum.repositories.EquipoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;

    /**Método para registrar un equipo con sus correspondientes alumnos**/
    @Transactional

}
