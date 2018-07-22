package com.assignment.animal;

import com.assignment.animal.behavior.Sing;
import com.assignment.animal.behavior.implementation.RoosterSoundImpl;

public class Rooster extends Animal{
	Chicken rooster = new Chicken();
	public Rooster(){
		rooster = new Chicken();
		Sing singBehavior = new RoosterSoundImpl();
		rooster.setSingBehavior(singBehavior);
		setDescription("I am a Rooster");
		
	}
	
	public void fly(){
		rooster.fly();
	}
	
	public void walk(){
		rooster.walk();
	}
	
	public void sing(){
		rooster.sing();
	}
	
	
}
