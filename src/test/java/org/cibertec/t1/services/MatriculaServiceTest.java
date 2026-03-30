package org.cibertec.t1.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatriculaServiceTest {
    private final MatriculaService service = new MatriculaService();

    @Test
    public void testCodigoMatriculaInvalido() {
        String resultado = service.registrar("123456", "Juan Perez", "ABC12", 3, "2026-03-29");
        assertEquals("Ingrese un código de matrícula válido", resultado);
    }

    @Test
    public void testNombreInvalido() {
        String resultado = service.registrar("IN1234", "An1", "ABC12", 3, "2026-03-29");
        assertEquals("El nombre del estudiante debe tener al menos cuatro caracteres alfabéticos", resultado);
    }
    @Test
    public void testCodigoCursoInvalido() {

        String resultado = service.registrar("IN1234", "Juan Perez", "ABC1", 3, "2026-03-29");
        assertEquals("Ingrese un código de curso válido", resultado);
    }
    @Test
    public void testCreditosInvalidos() {
        String resultado = service.registrar("IN1234", "Juan Perez", "ABC12", 7, "2026-03-29");
        assertEquals("La cantidad de créditos debe estar entre 1 y 6", resultado);
    }
}
