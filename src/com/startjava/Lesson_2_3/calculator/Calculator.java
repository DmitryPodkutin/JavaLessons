package com.startjava.calculator;
import java.util.Scanner;

public class Calculator {
	 
		private int firstNumber ;
		private int secondNumber; 
		private int result; 
		private char  mathOperation;

		public void setFirstNumber(int firstNumber){
      		this.firstNumber = firstNumber ;
        }
        public void setSecondNumber(int secondNumber){
      		this.secondNumber = secondNumber ;
        }
        public void setMathOperation(char mathOperation){
      		this.mathOperation = mathOperation ;
        }

		public void calculate(){
		 switch (mathOperation){
		 	case '+': 
		 	System.out.println (firstNumber + secondNumber);
		 	break;
		 	case '-': 
		 	System.out.println (firstNumber - secondNumber);
		 	break;
		 	case '*': 
		 	System.out.println (firstNumber * secondNumber);
		 	break;
		 	case '/': 
		 	System.out.println (firstNumber / secondNumber);
		 	break;
		 	case '^': 
		 	System.out.println (firstNumber ^ secondNumber);
		 	break;
		 	case '%': 
		 	System.out.println (firstNumber % secondNumber);
		 	break;
		 	
		 	default:
		 		System.out.println ("Ошибка!");

		 }
		} 


}	
	
