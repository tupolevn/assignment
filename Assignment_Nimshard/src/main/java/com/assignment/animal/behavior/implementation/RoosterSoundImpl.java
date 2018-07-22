package com.assignment.animal.behavior.implementation;

import com.assignment.animal.behavior.Sing;


public class RoosterSoundImpl implements Sing {

	private String message = "Cock-a-doodle-doo...";
	public String sing() {
		System.out.println(message);
		return message;
	}

}
