package com.assignment.animal;


import com.assignment.animal.behavior.implementation.EatSmallFishImpl;

public class Shark extends Fish{

	//FishBehavior behavior ;
	public Shark(){
		setColor("grey");
		setSize("large");
		behavior = new EatSmallFishImpl();
		
		setDescription("I am a " + size + ", " + color + " Shark");
	}
	
	public void eat(){
		behavior.perform();
	}
	
}
