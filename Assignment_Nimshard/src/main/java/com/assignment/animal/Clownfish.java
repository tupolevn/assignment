package com.assignment.animal;

import com.assignment.animal.behavior.implementation.MakeJokeImpl;

public class Clownfish extends Fish{

	
	public Clownfish(){
		setColor("orange");
		setSize("small");

		behavior = new MakeJokeImpl();
		setDescription("I am a " + size + ", " + color + " Clownfish");
	}
	
	public void makeJoke(){
		behavior.perform();
	}
}
