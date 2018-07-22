package com.assignment.animal;

import com.assignment.animal.behavior.FishBehavior;
import com.assignment.animal.behavior.Swim;
import com.assignment.animal.behavior.implementation.SwimImpl;

public class Fish extends Animal {

	private Swim swimBehavior;
	FishBehavior behavior;

	String size = null;
	String color = null;

	public Fish() {
		setDescription("I am a Fish.");
		swimBehavior = new SwimImpl();
	}

	public void setSwimBehavior(Swim swim) {
		swimBehavior = swim;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void swim() {
		swimBehavior.swim();
	}
}
