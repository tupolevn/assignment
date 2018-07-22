package com.assignment.animal.behavior.implementation;

import com.assignment.animal.behavior.Fly;

public class NoFlyImpl implements Fly {

	private String message = "I can not fly.";
	public String fly() {
		System.out.println(message);
		return message;
	}

}
