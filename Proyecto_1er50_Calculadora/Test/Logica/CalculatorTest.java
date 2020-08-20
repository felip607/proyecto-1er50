package Logica;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private calculator calculator;

    private void testCalcular() throws Exception {

        calculator = new calculator();
        assertEquals(0, calculator.calcular("2+5*7-3"));
    }

    CalculatorTest() {
    };
}