package org.cibertec.t1.services;

import java.time.LocalDate;

public class MatriculaService {
    public String registrar(String codMatricula, String alumno, String codCurso, int creditos, String fecha) {
        
        if (!codMatricula.matches("^[A-Z]{2}\\d{4}$")) {
            return "Ingrese un código de matrícula válido";
        }

        if (!alumno.matches("^[a-zA-Z\\s]{4,}$")) {
            return "El nombre del estudiante debe tener al menos cuatro caracteres alfabéticos";
        }
        if (!codCurso.matches("^[a-zA-Z0-9]{5}$")) {
            return "Ingrese un código de curso válido";
        }
        if (creditos < 1 || creditos > 6) {
            return "La cantidad de créditos debe estar entre 1 y 6";
        }
        LocalDate fechaMatricula = LocalDate.parse(fecha);
        if (fechaMatricula.isAfter(LocalDate.now())) {
            return "Ingrese una fecha de matrícula válida";
        }
        return "La matrícula ha sido registrada correctamente";
    }
}
