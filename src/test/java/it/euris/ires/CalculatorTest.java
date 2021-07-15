package it.euris.ires;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Test somma di 2 numeri")
    void addTwoNumbers() {

        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    @DisplayName("Test sottrazione 2 numeri")
    void subTwoNumbers() {
        assertEquals(5, calculator.sub(10, 5));
    }

    @Test
    @DisplayName("GIVEN Dati dei valori in input interi a, b WHEN tramite metodo multiplication() THEN ottengo risultato della moltiplicazione a*b")
    void multiplyTwoNumbers() {
        //arrange
        int numberA = 10;
        int numberB = 5;
        int expected_result = 50;
        Calculator calculator = new Calculator();

        //act
        int result = calculator.multiplication(numberA, numberB);

        //assert
        assertEquals(expected_result, result, String.format("%s * %s should be %s", numberA, numberB, expected_result));

    }

    @Test
    @DisplayName("GIVEN Dati dei valori in input interi a, b con dividendo diverso da 0 WHEN tramite metodo division() THEN ottengo risultato della divisione a/b")
    void divideTwoNumbers() throws Exception {
        //arrange
        int numberA = 10;
        int numberB = 5;
        int expected_result = 2;
        Calculator calculator = new Calculator();

        //act
        int result = calculator.division(numberA, numberB);

        //assert
        assertEquals(expected_result, result, String.format("%s / %s should be %s", numberA, numberB, expected_result));

    }
}
