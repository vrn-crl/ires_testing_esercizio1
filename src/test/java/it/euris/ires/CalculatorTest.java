package it.euris.ires;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    @DisplayName("Test somma di 2 numeri")

    void addTwoNumbers(){

        assertEquals(5,calculator.add(2,3) );
    }

    @Test
    @DisplayName("Test sottrazione 2 numeri")
    void subTwoNumbers(){
        assertEquals(5,calculator.sub(10,5));
    }
}
