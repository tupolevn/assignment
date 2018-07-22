package com.assignment.animal.behavior.implementation;

import com.assignment.animal.behavior.Sing;

public class CluckImpl implements Sing {

	private String message = "Cluck, cluck...";
	public String sing() {
		System.out.println(message);
		return message;
	}

}
