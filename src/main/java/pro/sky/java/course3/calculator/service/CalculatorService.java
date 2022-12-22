package pro.sky.java.course3.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int additionOfTwoNumbers(Integer number1, Integer number2) {
        if (number1 == null || number1.toString().isEmpty() || number1.toString().isBlank()
                || number2 == null || number2.toString().isEmpty() || number2.toString().isBlank()) {
            throw new IllegalArgumentException("Необходимо ввести число 1 и/или число 2");
        }
        return number1 + number2;
    }

    public int subtractionOfTwoNumbers(Integer number1, Integer number2) {
        if (number1 == null || number1.toString().isEmpty() || number1.toString().isBlank()
                || number2 == null || number2.toString().isEmpty() || number2.toString().isBlank()) {
            throw new IllegalArgumentException("Необходимо ввести число 1 и/или число 2");
        }
        return number1 - number2;
    }

    public int multiplicationOfTwoNumbers(Integer number1, Integer number2) {
        if (number1 == null || number1.toString().isEmpty() || number1.toString().isBlank()
                || number2 == null || number2.toString().isEmpty() || number2.toString().isBlank()) {
            throw new IllegalArgumentException("Необходимо ввести число 1 и/или число 2");
        }
        return number1 * number2;
    }

    public int divisionOfTwoNumbers(Integer number1, Integer number2) {
        if (number1 == null || number1.toString().isEmpty() || number1.toString().isBlank()
                || number2 == null || number2.toString().isEmpty() || number2.toString().isBlank()) {
            throw new IllegalArgumentException("Необходимо ввести число 1 и/или число 2");
        } else if (number2 == 0) {
            throw new IllegalArgumentException("Делить на 0 нельзя");
        }
        return number1 / number2;
    }
}
