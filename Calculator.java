 /* Create a basic calculator that can perform
basic arithmetic operations such as addition,
subtraction, multiplication, and division. */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        System.out.println("Enter first number: ");
        num1 = input.nextDouble();
        System.out.println("Enter second number: ");
        num2 = input.nextDouble();
        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = input.next().charAt(0);
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Error! operator is not correct");
                return;
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
 