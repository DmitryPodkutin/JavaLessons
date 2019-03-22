package com.startjava.robot;
public class Jager {
	private String  modelName;
	private String  mark;
	private String  origin;
	private int  	speed;
	private int  	armor; 
	private int  	kaijuKilled;


	public Jager(String modelName, String mark, String origin,  int speed, int armor, int  kaijuKilled){
		this.modelName = modelName;
		this.mark = mark;
		this.origin = origin;
		this.speed = speed;
		this.armor = armor;
		this.kaijuKilled = kaijuKilled;
	}


	    public String toString() {
        return "Jager{" +
                "modelName='" + modelName + '\'' +
                ", mark='" + mark + '\'' +
                ", origin='" + origin + '\'' +
                ", speed=" + speed +
                ", armor=" + armor +
                ", kaijuKilled=" + kaijuKilled +
                '}';
    }

	// public void setModelName(String modelName){
 //      		this.modelName = modelName;
 //    }
	// public String getModelName(){
	// 	return modelName;
	// } 
 //    /////
	// public void setMark(String mark){
 //      		this.mark = mark;
 //    }
	// public String geMark(){
	// 	return mark;
	// } 
	// /////
	// public void setOrigin(String origin){
 //      		this.origin = origin;
 //    }
	// public String getOrigin(){
	// 	return origin;
	// } 
	// ////
	// public void setSpeed(int speed){
 //      		this.speed = speed;
 //    }
	// public int getSpeed(){
	// 	return speed;
	// } 
	// //////
	// public void setArmor(int armor){
 //      		this.armor = armor;
 //    }
	// public int getArmor(){
	// 	return armor;
	// } 
	// ////
	// public void setKaijuKilled(int kaijuKilled){
 //      		this.kaijuKilled = kaijuKilled;
 //    }
	// public int getKaijuKilled(){
	// 	return kaijuKilled;
	// } 

	public void  drift(){
	System.out.println ("Вы вошли в дрифт");
	} 
	public void move(){ 
	System.out.println ("Вы прошли 5 шагов");
	} 
	public void scanKaiju(){ 
	} 
	public void useWeapon(){ 
	System.out.println ("Fire");
	} 

	
}


