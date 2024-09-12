import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    @Test
    void add() {
        var calc = new Calculator();
        int expected = 15;
        int result = calc.add(10, 5);
        assertEquals(expected, result);
        expected = 150;
        result = calc.add(100, 50);
        assertEquals(expected, result);

    }

    @Test
    void multiple() {
        var calc = new Calculator();
        int expected = 50;
        int result = calc.multiple(10, 5);
        assertEquals(expected, result);
        expected = 5000;
        result = calc.multiple(100, 50);
        assertEquals(expected, result);
    }

    @Test
    void divide() {
        var calc = new Calculator();
        double expected = 2d;
        double result = calc.divide(10, 5);
        assertEquals(expected, result);
        expected = 20d;
        result = calc.divide(100, 5);
        assertEquals(expected, result);
    }

    @Test
    void square() {
        var calc = new Calculator();
        int expected = 25;
        int result = calc.square(5);
        assertEquals(expected, result);
        expected = 900;
        result = calc.square(30);
        assertEquals(expected, result);
    }
}