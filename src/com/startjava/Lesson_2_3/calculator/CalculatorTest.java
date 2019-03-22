package com.startjava.calculator;
import java.util.Scanner;
public class CalculatorTest {
	public static void main (String[] args){
		String answer = "да";
		while(answer.equals("да")){
			System.out.println("Калькулятор запущен!");
			Scanner scan = new Scanner(System.in);
			Calculator  calculator = new Calculator();

			System.out.print("Введите первое число: ");
			int firstNumber = scan.nextInt();
			calculator.setFirstNumber(firstNumber);

			System.out.print("Введите операцию: ");;
			char mathOperation = scan.next().charAt(0);
			calculator.setMathOperation(mathOperation);

			System.out.print("Введите второе число: ");
			int secondNumber = scan.nextInt();
			calculator.setSecondNumber(secondNumber);

			calculator.calculate();
				do{
					System.out.print("Хотите продолжить [да/нет]: ");
					answer = scan.next();
				} while(!answer.equals("да") && !answer.equals("нет"));
		}	
		System.out.println("Калькулятор закрылся");
	}
}	