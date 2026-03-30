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
}