package com.startjava.lesson_2_3.persone;

public class Persone {
	String sex = "Male";
	String name = "Dmitry";
	float height = 1.78f;
	int weight = 83;
	int age = 34;
	
	void  humanGo(){
		System.out.println("Человек идет");
	}

	void humanSit(){
		System.out.println("Человек сидит");
	}
	void humanRun(){
		System.out.println("Человек ,бежит");
	}
	void humanTalk(){
		System.out.println("Человек говорит");
	}
	void humanTechesJava(){
		System.out.println("Человек учит Java");
	}
 
}