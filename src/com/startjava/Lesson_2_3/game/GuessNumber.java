package com.startjava.game;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber{
	
	public void runGame(){
		int computerNumber = (int) ( Math.random() * 100 );
		PlayerOne onePlayerName = new PlayerOne();
		PlayerTwo twoPlayerName = new PlayerTwo();
		Scanner scan = new Scanner(System.in);
		System.out.println(computerNumber);
	
		while(true){
			System.out.print(onePlayerName.getPlayerName1() + " введите число: " );
			int onePlayerNumber = scan.nextInt();


			if(onePlayerNumber == computerNumber){

			System.out.println(onePlayerName.getPlayerName1() + " Вы угадали!" + computerNumber);
			break;
			}
		 	if(onePlayerNumber < computerNumber){
			System.out.println("Введеное вами число = " + onePlayerNumber + " меньше того, что загадал компьютер");
			onePlayerNumber++;
			}
			if(onePlayerNumber > computerNumber){
			System.out.println("Введеное вами число  " + onePlayerNumber + " больше того, что загадал компьютер");
			onePlayerNumber--;
			}
		
			System.out.print(twoPlayerName.getPlayerName2() + " введите число: " );
			int twoPlayerNumber = scan.nextInt();
			if(twoPlayerNumber == computerNumber){

			System.out.println(twoPlayerName.getPlayerName2()+ " Вы угадали!" + computerNumber);
			break;
			}
		 	if(twoPlayerNumber < computerNumber){
			System.out.println("Введеное вами число = " + twoPlayerNumber + " меньше того, что загадал компьютер");
			twoPlayerNumber++;
			}
			if(twoPlayerNumber > computerNumber){
			System.out.println("Введеное вами число  " + twoPlayerNumber + " больше того, что загадал компьютер");
			twoPlayerNumber--;
			}
		}
	}	
}
		
	