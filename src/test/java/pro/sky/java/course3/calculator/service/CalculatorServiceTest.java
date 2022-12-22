package pro.sky.java.course3.calculator.service;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorServiceTest {
    private final CalculatorService out = new CalculatorService();

    @Test
    void shouldReturnAdditionOfTwoNumbers() {
        Integer result = out.additionOfTwoNumbers(34, 17);
        assertEquals(result, 51);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenSummandNumbersAreIncorrect() {
        assertThrows(IllegalArgumentException.class, () -> out.additionOfTwoNumbers(Integer.valueOf(""), Integer.valueOf("")));
        assertThrows(IllegalArgumentException.class, () -> out.additionOfTwoNumbers(Integer.valueOf("  "), Integer.valueOf("  ")));
        assertThrows(IllegalArgumentException.class, () -> out.additionOfTwoNumbers(null, null));
    }

    @Test
    void shouldReturnSubtractionOfTwoNumbers() {
        Integer result = out.subtractionOfTwoNumbers(34, 17);
        assertEquals(result, 17);
    }

    @Test
    void shouldReturnMultiplicationOfTwoNumbers() {
        Integer result = out.multiplicationOfTwoNumbers(34, 17);
        assertEquals(result, 578);
    }

    @Test
    void shouldReturnDivisionOfTwoNumbers() {
        Integer result = out.divisionOfTwoNumbers(34, 17);
        assertEquals(result, 2);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenSecondNumberIsZero() {
        assertThrows(IllegalArgumentException.class, () -> out.divisionOfTwoNumbers(34, 0));
    }

}