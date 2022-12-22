package pro.sky.java.course3.calculator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;
import pro.sky.java.course3.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String greetings() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String additionOfTwoNumbers(@RequestParam(name = "num1") @Nullable Integer number1,
                                       @RequestParam(name = "num2") @Nullable Integer number2) {
        return number1 + " + " + number2 + " = " + calculatorService.additionOfTwoNumbers(number1, number2);
    }

    @GetMapping("/minus")
    public String subtractionOfTwoNumbers(@RequestParam(name = "num1") @Nullable Integer number1,
                                          @RequestParam(name = "num2") @Nullable Integer number2) {
        return number1 + " - " + number2 + " = " + calculatorService.subtractionOfTwoNumbers(number1, number2);
    }

    @GetMapping("/multiply")
    public String multiplicationOfTwoNumbers(@RequestParam(name = "num1") @Nullable Integer number1,
                                             @RequestParam(name = "num2") @Nullable Integer number2) {
        return number1 + " * " + number2 + " = " + calculatorService.multiplicationOfTwoNumbers(number1, number2);
    }

    @GetMapping("/divide")
    public String divisionOfTwoNumbers(@RequestParam(name = "num1") @Nullable Integer number1,
                                       @RequestParam(name = "num2") @Nullable Integer number2) {
        return number1 + " / " + number2 + " = " + calculatorService.divisionOfTwoNumbers(number1, number2);
    }

    @ExceptionHandler(value = IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}
