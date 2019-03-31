package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer = "да";
        while (answer.equals("да")) {
            System.out.println("Калькулятор запущен!");
            Scanner scan = new Scanner(System.in);
            Calculator calculator = new Calculator();

            System.out.print("Введите через пробел матиматическое выражеие: ");
            String mathematicExpression = scan.nextLine();
            String[] parts = mathematicExpression.split(" ");
            int firstNumber = Integer.parseInt(parts[0]);
            String mathOperation = parts[1];
            int secondNumber = Integer.parseInt(parts[2]);
            calculator.setFirstNumber(firstNumber);
            calculator.setMathOperation(mathOperation);
            calculator.setSecondNumber(secondNumber);

            calculator.calculate();
            do {
                System.out.print("Хотите продолжить [да/нет]: ");
                answer = scan.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        }
        System.out.println("Калькулятор закрылся");
    }
}	