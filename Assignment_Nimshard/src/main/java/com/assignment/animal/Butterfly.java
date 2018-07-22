package com.assignment.animal;

import com.assignment.animal.behavior.Fly;
import com.assignment.animal.behavior.Sing;
import com.assignment.animal.behavior.Walk;
import com.assignment.animal.behavior.implementation.CrawlImpl;
import com.assignment.animal.behavior.implementation.FlyImpl;
import com.assignment.animal.behavior.implementation.NoFlyImpl;
import com.assignment.animal.behavior.implementation.NoSoundImpl;

public class Butterfly extends Animal {
	Walk walkBehavior;
	Fly flyBehavior;
	Sing singBehavior;

	public Butterfly() {
		setDescription("I am a caterpillar");

		walkBehavior = new CrawlImpl();
		flyBehavior = new NoFlyImpl();
		singBehavior = new NoSoundImpl();
	}

	public void walk() {
		walkBehavior.walk();

	}

	public void fly() {
		flyBehavior.fly();
	}

	public void sing() {
		singBehavior.sing();
	}

	public void growUp() {
		setDescription("I am a Butterfly");
		flyBehavior = new FlyImpl();
	}
}
