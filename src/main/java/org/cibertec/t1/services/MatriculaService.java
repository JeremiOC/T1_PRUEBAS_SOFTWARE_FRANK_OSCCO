package org.cibertec.t1.services;

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
        return "La matrícula ha sido registrada correctamente";
    }
}
