package com.assignment.animal.behavior.implementation;

import com.assignment.animal.behavior.Walk;

public class WalkImpl implements Walk {

	private String message = "I am walking...";
	public String walk() {
		System.out.println(message);
		return message;
	}

}
