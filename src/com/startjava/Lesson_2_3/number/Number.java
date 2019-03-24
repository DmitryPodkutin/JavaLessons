package com.startjava.lesson_2_3.number;

public class Number{
	public static void main (String[] args){
		int computerNumber = 3;
		int humenNumber = 10;

	while(true){
		if(humenNumber == computerNumber){
			System.out.println("Вы угадали!" + computerNumber);
			break;
		}
		 if(humenNumber < computerNumber){
			System.out.println("Введеное вами число = " + humenNumber + " меньше того, что загадал компьютер");
			humenNumber++;
		}
		if(humenNumber > computerNumber){
			System.out.println("Введеное вами число  " + humenNumber + " больше того, что загадал компьютер");
			humenNumber--;
		}
	}
		
	}
}