package org.cibertec.t1.services;

public class MatriculaService {
    public String registrar(String codMatricula, String alumno, String codCurso, int creditos, String fecha) {
        if (!codMatricula.matches("^[A-Z]{2}\\d{4}$")) {
            return "Ingrese un código de matrícula válido";
        }
        return "La matrícula ha sido registrada correctamente";
    }
}
