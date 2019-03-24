package com.startjava.lesson_1.book;

public class Cycle {
	public static void main(String[] args){
	
//Выведите на консоль с помощью цикла for все числа от [0, 20]
// 	for(int i = 0; i <= 20; i++)
// System.out.println(i);

//Выведите на консоль с помощью цикла while все числа от [6, -6] (шаг итерации равен 2)
// int i = 6;
// 		while(i >=-6 ){
// 			System.out.println(i);
// 			i = i - 2;
// 		}
		
//Выведите на консоль с помощью цикла do-while сумму всех нечетных чисел от [10, 20]
		int i = 10;
		int result = 0;
		do{
			if(i % 2 != 0)
			result = result + i;
		i++;
		}while(i<20);
		System.out.println(result);
	}

}