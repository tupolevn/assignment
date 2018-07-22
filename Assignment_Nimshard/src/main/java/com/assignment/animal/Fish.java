package com.assignment.animal;

import com.assignment.animal.behavior.Swim;
import com.assignment.animal.behavior.implementation.SwimImpl;

public class Fish extends Animal {

	private Swim swimBehavior;

	public Fish() {
		setDescription("I am a Fish.");
		swimBehavior = new SwimImpl();
	}

	public void setSwimBehavior(Swim swim) {
		swimBehavior = swim;
	}

	public void swim() {
		swimBehavior.swim();
	}

}
