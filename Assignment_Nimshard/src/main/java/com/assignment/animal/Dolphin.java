package com.assignment.animal;

import com.assignment.animal.behavior.Swim;
import com.assignment.animal.behavior.implementation.SwimImpl;

public class Dolphin extends Animal{

	private Swim swimBehavior;
	public Dolphin(){
		swimBehavior = new SwimImpl();
		setDescription("I am a Dolphin");
	}
	
	public void swim(){
		swimBehavior.swim();
	}
}
