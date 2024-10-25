package es.iesjandula.ProyectoEvaluacionesScrum.services;

import es.iesjandula.ProyectoEvaluacionesScrum.Model.Alumno;
import es.iesjandula.ProyectoEvaluacionesScrum.repositories.AlumnoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    /**Método para registrar un alumno (uno a uno)**/
    @Transactional
    public Alumno registroAlumno(Alumno alumno) {
        if (alumno.getEmail() == null || alumno.getEmail().isEmpty()) {
            throw new IllegalArgumentException("El email no puede estar vacio");
        }
        return alumnoRepository.save(alumno);
    }


}
