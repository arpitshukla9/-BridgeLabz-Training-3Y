package ControlFlowPractices.level3;

import java.util.Scanner;

public class CalculatorUsingSwitch {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get inputs
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();

        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        double result;

        // Switch based on operator
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result = " + result);
                break;

            case "-":
                result = first - second;
                System.out.println("Result = " + result);
                break;

            case "*":
                result = first * second;
                System.out.println("Result = " + result);
                break;

            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error: Division by zero not allowed.");
                }
                break;

            default:
                System.out.println("Invalid Operator!");
        }

        sc.close();
    }
    
}
