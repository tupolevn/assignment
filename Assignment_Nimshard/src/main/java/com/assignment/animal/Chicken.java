package com.assignment.animal;

import com.assignment.animal.behavior.Fly;
import com.assignment.animal.behavior.Sing;
import com.assignment.animal.behavior.implementation.CluckImpl;
import com.assignment.animal.behavior.implementation.NoFlyImpl;

public class Chicken extends Bird{

	public Chicken(){
		
		Fly flyBehavior = new NoFlyImpl();
		setFlyBehavior(flyBehavior); 
		
		Sing singBehavior = new CluckImpl();
		setSingBehavior(singBehavior);
		
		setDescription("I am a Chicken");
	}
}
