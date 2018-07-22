package com.assignment.animal.behavior.implementation;

import com.assignment.animal.behavior.Sing;

public class NoSoundImpl implements Sing {

	private String message = "I do not make sounds...";
	public String sing() {
		System.out.println(message);
		return message;
	}

}
