package org.example;

import io.qase.api.annotation.CaseTitle;
import org.intellij.lang.annotations.JdkConstants;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;



public class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    public void setUp() {
        calc = new Calculator();

    }

    @ParameterizedTest
    @CsvSource(value = {"10 , 10, 20", "-15, 10, -5"})
    @CaseTitle("Add with Integer")
    public void add_withInteger_shouldReturnInteger(int value1, int value2, int expected) {

        //When
        int sum = calc.add(value1, value2);

        //Then
        assertEquals(expected, sum);
    }

    @ParameterizedTest
    @CsvSource(value = {"15, 5, 10", "-15, -10, -5"})
    @CaseTitle("Subtract with Integer")
    public void subtract_withInteger_shouldReturnInteger(int value1, int value2, int expected){

        //When
        int diff = calc.subtract(value1, value2);

        //Then
        assertEquals(expected, diff);
    }

    @ParameterizedTest
    @CsvSource(value = {"5, 5, 25", "-5, 5, -25"})
    @CaseTitle("Multiply with Integer")
    public void multiply_withInteger_shouldReturnInteger(int value1, int value2, int expected){

        //When
        int prod = calc.multiply(value1, value2);

        //Then
        assertEquals(expected, prod);
    }

    @ParameterizedTest
    @CsvSource(value = {"2, 2, 1", "-2, 2, -1"})
    @CaseTitle("Divide with Integer")
    public void divide_withInteger_shouldReturnInteger(int value1, int value2, int expected){

        //When
        int quotient = calc.divide(value1, value2);

        //Then
        assertEquals(expected, quotient);
    }

    @ParameterizedTest
    @CsvSource(value = {"6, 0, / by zero"})
    @CaseTitle("Divide with Zero")
    public void division_withZero_shouldThrowException(int value1, int value2, String expected) {

        //When, Then
        ArithmeticException err =
                assertThrows(ArithmeticException.class, () -> calc.divide(value1, value2));

        assertEquals(expected, err.getMessage());
    }


}
