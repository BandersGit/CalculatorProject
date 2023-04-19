package org.example;

import io.qase.api.annotation.Step;

public class Calculator {

    @Step("Add with given arguments {x} and {y}")
    public int add(int x, int y){
        return x + y;
    }

    public int subtract(int x, int y){
        return x - y;
    }

    public int multiply(int x, int y){
        return x * y;
    }

    public int divide(int x, int y){
        return x / y;
    }
}
