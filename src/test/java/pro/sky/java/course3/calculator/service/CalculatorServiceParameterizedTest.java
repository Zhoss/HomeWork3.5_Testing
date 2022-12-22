package pro.sky.java.course3.calculator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorServiceParameterizedTest {
    private final CalculatorService out = new CalculatorService();

    @ParameterizedTest
    @MethodSource("provideParamsForAdditionTest")
    void shouldReturnAdditionOfTwoNumbers(Integer number1, Integer number2, Integer result) {
        assertEquals(result, out.additionOfTwoNumbers(number1, number2));
    }

    public static Stream<Arguments> provideParamsForAdditionTest() {
        return Stream.of(
                Arguments.of(34, 17, 51),
                Arguments.of(2, -3, -1),
                Arguments.of(25, 5, 30)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForSubtractionTest")
    void shouldReturnSubtractionOfTwoNumbers(Integer number1, Integer number2, Integer result) {
        assertEquals(result, out.subtractionOfTwoNumbers(number1, number2));
    }

    public static Stream<Arguments> provideParamsForSubtractionTest() {
        return Stream.of(
                Arguments.of(34, 17, 17),
                Arguments.of(2, -3, 5),
                Arguments.of(25, 5, 20)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplicationTest")
    void shouldReturnMultiplicationOfTwoNumbers(Integer number1, Integer number2, Integer result) {
        assertEquals(result, out.multiplicationOfTwoNumbers(number1, number2));
    }

    public static Stream<Arguments> provideParamsForMultiplicationTest() {
        return Stream.of(
                Arguments.of(34, 17, 578),
                Arguments.of(2, -3, -6),
                Arguments.of(25, 5, 125)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivisionTest")
    void shouldReturnDivisionOfTwoNumbers(Integer number1, Integer number2, Integer result) {
        assertEquals(result, out.divisionOfTwoNumbers(number1, number2));
    }
    public static Stream<Arguments> provideParamsForDivisionTest() {
        return Stream.of(
                Arguments.of(34, 17, 2),
                Arguments.of(2, -3, 0),
                Arguments.of(25, 5, 5)
        );
    }
}