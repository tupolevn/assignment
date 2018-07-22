package com.assignment.animal.behavior.implementation;

import com.assignment.animal.behavior.Fly;

public class FlyImpl implements Fly {

	private String message = "I am flying...";
	public String fly() {
		System.out.println(message);
		return message;
	}
	

}
