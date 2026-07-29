package org.example;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculadoraTest {
    private final Calculadora calculadora = new Calculadora();

    @Test
    public void testSumarCorrectamente() { // Debe ser public
        int resultado = calculadora.sumar(3, 5);
        // En JUnit 4, el mensaje va PRIMERO: (mensaje, esperado, actual)
        assertEquals("La suma de 3 + 5 debería ser 8", 8, resultado);
    }

    @Test
    public void testDividirCorrectamente() {
        int resultado = calculadora.dividir(10, 2);
        assertEquals("La división de 10 / 2 debería ser 5", 5, resultado);
    }

    @Test
    public void testDividirPorCeroLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.dividir(10, 0);
        });
    }
}
