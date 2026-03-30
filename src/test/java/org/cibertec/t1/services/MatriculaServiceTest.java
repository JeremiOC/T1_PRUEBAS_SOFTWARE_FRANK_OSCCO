package org.cibertec.t1.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatriculaServiceTest {
    private final MatriculaService service = new MatriculaService();

    @Test
    public void testNombreInvalido() {
        //test nombre
        String resultado = service.registrar("IN1234", "An1", "ABC12", 3, "2026-03-29");
        assertEquals("El nombre del estudiante debe tener al menos cuatro caracteres alfabéticos", resultado);
    }
}
