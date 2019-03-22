package com.startjava.game;
import java.util.Random;
import java.util.Scanner;
public  class  GuessNumberTest {

	public static void main (String[] args){
		
		// PlayerName1 name = new PlayerName1();
		// System.out.println("Первый игрок -" +  name.playerNameOne() );
		
		String answer = "да";




		GuessNumber logic = new GuessNumber();
		Scanner scan = new Scanner(System.in);
		while(answer.equals("да")){
		logic.runGame();
				do{
					System.out.print("Хотите продолжить [да/нет]: ");
					answer = scan.next();
				} while(!answer.equals("да") && !answer.equals("нет"));
		}

	}
}