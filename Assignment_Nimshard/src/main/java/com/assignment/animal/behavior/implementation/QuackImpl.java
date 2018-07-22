package com.assignment.animal.behavior.implementation;

import com.assignment.animal.behavior.Sing;

public class QuackImpl implements Sing{

	private String message = "Quack, quack...";
	public String sing() {
		System.out.println(message);
		return message;
	}

}
