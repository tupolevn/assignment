package com.assignment.animal.behavior.implementation;

import com.assignment.animal.behavior.Sing;

public class DogSoundImpl implements Sing{

	private String message;
	public String sing() {
		System.out.println("Woof, woof..");
		return message;
	}

}
