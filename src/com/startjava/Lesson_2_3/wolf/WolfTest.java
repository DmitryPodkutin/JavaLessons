package com.startjava.wolf;
public class WolfTest{
	public static void main (String[] args){
	Wolf wolfOne = new Wolf();
	System.out.println("Волка зовут: " + wolfOne.getName());
	wolfOne.setAge(2);
	wolfOne.getAge();
	System.out.println("Волк : " + wolfOne.getSex() + " пола");
	System.out.println("Окрас " + wolfOne.getColor() + " цвета");
	wolfOne.sit();
	}

}