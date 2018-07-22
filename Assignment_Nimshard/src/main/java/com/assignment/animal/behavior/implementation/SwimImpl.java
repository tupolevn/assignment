package com.assignment.animal.behavior.implementation;

import com.assignment.animal.behavior.Swim;

public class SwimImpl implements Swim {

	private String message = "I am swimming...";
	public String swim() {
		System.out.println(message);
		return message;
	}

}
