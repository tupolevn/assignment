package com.assignment.animal;

import com.assignment.animal.behavior.Sing;
import com.assignment.animal.behavior.implementation.QuackImpl;

public class Duck extends Bird{

	public Duck(){
		Sing singBehavior = new QuackImpl();
		setSingBehavior(singBehavior);
		
		setDescription("I am a Duck");
	}
}
