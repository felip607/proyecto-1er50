package Logica;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora;

    private void testCalcular() throws Exception {

        calculadora = new Calculadora();
        assertEquals(0,calculadora.calcular("2+5*7-3"));
    }

    CalculadoraTest() {
    };
}