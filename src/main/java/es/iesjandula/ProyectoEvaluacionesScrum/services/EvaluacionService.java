package es.iesjandula.ProyectoEvaluacionesScrum.services;

import es.iesjandula.ProyectoEvaluacionesScrum.Model.Evaluacion;
import es.iesjandula.ProyectoEvaluacionesScrum.repositories.EvaluacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EvaluacionService {

    @Autowired
    private EvaluacionRepository EvaluacionRepository;

    /**Este metodo es para crear evaluacion**/
    public Evaluacion crearEvaluacion(Evaluacion evaluacion)
    {return EvaluacionRepository.save(evaluacion);}
}



