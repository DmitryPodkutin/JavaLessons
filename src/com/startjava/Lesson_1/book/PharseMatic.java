package com.startjava.lesson_1.book;

public class PharseMatic{
	public static void main (String[] args){
	String[] wordListOne = {" Круглосуточный", "трехзвенный", "3000 футовый", 
	"взаимный", "обоюдный выигрыш", "фронтэнд", "на основе веб-технологий" };	
	
	String[] wordListTow = {" Уполномоченый", "трудный", "чистый продукт",
	"ориентированный","центральный", "распределенный", "фирменный"};

	String[] wordListThree = {" Процесс","пункт разгрузки", "выход из положения", 
	"тип структуры","талант", "подход","уровень завоевонного внимания" };

	int oneLength = wordListOne.length;
	int towLength = wordListTow.length;
	int threeLength = wordListThree.length;

	int rand1 = (int) (Math.random() * oneLength);
	int rand2 = (int) (Math.random() * towLength);
	int rand3 = (int) (Math.random() * threeLength);

	String phrase = wordListOne[rand1] + " " + 
	wordListTow[rand2] + " " +wordListThree[rand3];

	System.out.println ("Все что нам нужно, - это " + phrase);

	}
}