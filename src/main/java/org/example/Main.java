package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to THE Calculator!!");

        while (true) {
            System.out.println();
            System.out.println("What do you wish to do?");
            System.out.println("1: Add");
            System.out.println("2: Subtract");
            System.out.println("3: Multiply");
            System.out.println("4: Divide");
            System.out.println();

            int operator = scanner.nextInt();

            System.out.println();
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            System.out.print("Result: ");
            switch (operator) {
                case 1:
                    System.out.println(calc.add(num1, num2));
                    break;
                case 2:
                    System.out.println(calc.subtract(num1, num2));
                    break;
                case 3:
                    System.out.println(calc.multiply(num1, num2));
                    break;
                case 4:
                    System.out.println(calc.divide(num1, num2));
            }
        }
    }
}