package com.assignment.animal;

import com.assignment.animal.behavior.Fly;
import com.assignment.animal.behavior.Sing;
import com.assignment.animal.behavior.implementation.FlyImpl;
import com.assignment.animal.behavior.implementation.NoSoundImpl;

public class Butterfly extends Animal {

	Fly flyBehavior;
	Sing singBehavior;

	public Butterfly() {
		setDescription("I am a Butterfly");
		flyBehavior = new FlyImpl();
		singBehavior = new NoSoundImpl();
	}

	public void fly() {
		flyBehavior.fly();
	}

	public void sing() {
		singBehavior.sing();
	}

	public void growUp() {
		flyBehavior = new FlyImpl();
	}
}
