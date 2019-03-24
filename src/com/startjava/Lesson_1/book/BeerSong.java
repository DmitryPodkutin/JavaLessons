package com.startjava.lesson_1.book;

public class BeerSong{
	public static void main (String[] args){
		int beerNumber = 99;
		String word = "бутылок (бутылки)";

		while(beerNumber > 0){
			
			if (beerNumber == 1){
				word = "бутылка";
            }    

            else if (beerNumber < 0 ) {
					System.out.println("Нет бутылок пива  на стене");
				}

				
			System.out.println(beerNumber + " " + word + " пива на стене");
			System.out.println("Возьми одну.");
			System.out.println("Пусти по кругу.");
			beerNumber --;
			
		}		
	}
}