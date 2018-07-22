package com.assignment.animal.behavior.implementation;

import com.assignment.animal.behavior.Sing;

public class SingImpl implements Sing {

	private String message = "I am singing...";
	public String sing() {
		System.out.println(message);
		return message;
	}

}
