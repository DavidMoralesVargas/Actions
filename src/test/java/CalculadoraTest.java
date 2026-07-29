import org.example.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculadoraTest {
    private final Calculadora calculadora = new Calculadora();

    @Test
    void testSumarCorrectamente() {
        int resultado = calculadora.sumar(3, 5);
        assertEquals(8, resultado, "La suma de 3 + 5 debería ser 8");
    }

    @Test
    void testDividirCorrectamente() {
        int resultado = calculadora.dividir(10, 2);
        assertEquals(5, resultado, "La división de 10 / 2 debería ser 5");
    }

    @Test
    void testDividirPorCeroLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.dividir(10, 0);
        });
    }

}
