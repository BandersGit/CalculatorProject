package org.example;

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
    public void add_withInteger_shouldReturnInteger(int value1, int value2, int expected) {

        //When
        int sum = calc.add(value1, value2);

        //Then
        assertEquals(expected, sum);
    }

    @ParameterizedTest
    @CsvSource(value = {"15, 5, 10", "-15, -10, -5"})
    public void subtract_withInteger_shouldReturnInteger(int value1, int value2, int expected){

        //When
        int diff = calc.subtract(value1, value2);

        //Then
        assertEquals(expected, diff);
    }

    @ParameterizedTest
    @CsvSource(value = {"5, 5, 25", "-5, 5, -25"})
    public void multiply_withInteger_shouldReturnInteger(int value1, int value2, int expected){

        //When
        int prod = calc.multiply(value1, value2);

        //Then
        assertEquals(expected, prod);
    }

    @ParameterizedTest
    @CsvSource(value = {"2, 2, 1", "-2, 2, -1"})
    public void division_withInteger_shouldReturnInteger(int value1, int value2, int expected){

        //When
        int quotient = calc.divide(value1, value2);

        //Then
        assertEquals(expected, quotient);
    }

    @ParameterizedTest
    @CsvSource(value = {"6, 0, / by zero"})
    public void division_withZero_shouldThrowException(int value1, int value2, String expected) {

        //When, Then
        ArithmeticException err =
                assertThrows(ArithmeticException.class, () -> calc.divide(value1, value2));

        assertEquals(expected, err.getMessage());
    }


}
