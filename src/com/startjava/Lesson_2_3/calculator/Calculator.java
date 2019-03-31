package com.startjava.lesson_2_3.calculator;

import static java.lang.Math.pow;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private String mathOperation;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setMathOperation(String mathOperation) {
        this.mathOperation = mathOperation;
    }

    public void calculate() {
        switch (mathOperation) {
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            case "/":
                System.out.println(firstNumber / secondNumber);
                break;
            case "^":
                System.out.println(pow(firstNumber, secondNumber));
                break;
            case "%":
                System.out.println(firstNumber % secondNumber);
                break;

            default:
                System.out.println("Ошибка!");

        }
    }


}	


