package com.assignment.animal.behavior.implementation;

import com.assignment.animal.behavior.Sing;

public class CatSoundImpl implements Sing {

	private String message = "Meow...";
	public String sing() {
		System.out.println(message);
		return message;
	}

}
