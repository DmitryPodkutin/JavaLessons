package com.startjava.robot;
public class JagerTest{
	public static void main (String[] args){
		Jager gipsyDanger = new Jager("Gipsy Danger", "Mark-3", "USA", 6, 7, 9);
		Jager chernoAlph = new Jager("Cherno Alph", "Mark-1", "Russia", 3, 10, 6);
		
		System.out.println();
		gipsyDanger .drift();
		System.out.println(gipsyDanger);



		// jagerOne.setModelName("Gipsy Danger");
		// jagerOne.setMark("Mark-3");
		// jagerOne.setOrigin("USA");
		// jagerOne.setStatus("Destroyed");
		// jagerOne.setHeight(79.25);
		// jagerOne.setSpeed(6);
		// jagerOne.setArmor(7);
		// jagerOne.setKaijuKilled(9);
		
		// Jager jagerTwo = new Jager();
		// jagerTwo.setModelName("Cherno Alph");
		// jagerTwo.setMark("Mark-1");
		// jagerTwo.setOrigin("Russia");
		// jagerTwo.setStatus("Destroyed");
		// jagerTwo.setHeight(85.34);
		// jagerTwo.setSpeed(3);
		// jagerTwo.setArmor(10);
		// jagerTwo.setKaijuKilled(6);
	}
}