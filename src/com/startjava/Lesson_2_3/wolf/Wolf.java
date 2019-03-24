package com.startjava.lesson_2_3.wolf;

public class Wolf {
	private  String sex = "Мужского";
	private String name = "Dik";
	private int age = 0;
	private String color = "Черного";

	public String getSex(){
		return sex;
	}
    public String getName(){
      return name;
 	} 
 	public int getAge(){
 		return age;
 	}
 	public String getColor(){
 		return color;
 	}

 	public void setAge(int age){
      		this.age = age;
 			
 			if(age == 1)
			System.out.println("Волку" + age + "год");
			else if(age > 1 & age <= 4)
			System.out.println("Волку " + age + "года");
			else if(age  > 4 & age <= 10)
			System.out.println("Волку " + age + "лет");
			else if(age  > 10)
			System.out.println("Некорректный возраст");
	}

 	

	public void go (){
		System.out.println("Волк идет");
	}

	public void sit (){
		System.out.println("Волк  сидит");
	}
	public void toRun (){
		System.out.println("Волк бежит");
	}
	public void howls (){
		System.out.println("Волк воет");
	}
	public void isHunting (){
		System.out.println("Волк охотится");
	}

}