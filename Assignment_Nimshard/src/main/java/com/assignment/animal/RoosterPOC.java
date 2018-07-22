package com.assignment.animal;

import com.assignment.animal.behavior.MultiLangSing;
import com.assignment.animal.behavior.Sing;
import com.assignment.animal.behavior.implementation.RoosterSoundImpl;

public class RoosterPOC extends Animal {
	Chicken rooster;
	MultiLangSing multiLangSing;

	public RoosterPOC() {
		rooster = new Chicken();
		Sing singBehavior = new RoosterSoundImpl();
		multiLangSing = new RoosterSoundImpl();
		rooster.setSingBehavior(singBehavior);
		setDescription("I am a Rooster");

	}

	public void fly() {
		rooster.fly();
	}

	public void walk() {
		rooster.walk();
	}

	public void sing() {
		rooster.sing();
	}

	public void sing(String language) {
		multiLangSing.sing(language);
	}

}
