package com.assignment.animal;

import com.assignment.animal.behavior.Fly;
import com.assignment.animal.behavior.Sing;
import com.assignment.animal.behavior.Walk;
import com.assignment.animal.behavior.implementation.FlyImpl;
import com.assignment.animal.behavior.implementation.SingImpl;
import com.assignment.animal.behavior.implementation.WalkImpl;

public class Bird extends Animal{
	private Fly flyBehavior;
	private Walk walkBehavior;
	private Sing singBehavior;
	
	public void fly(){
		flyBehavior.fly();
	}
	
	public void walk(){
		walkBehavior.walk();
	}
	
	public void sing(){
		singBehavior.sing();
	}
	
	public void setFlyBehavior(Fly flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public void setWalkBehavior(Walk walkBehavior) {
		this.walkBehavior = walkBehavior;
	}

	public void setSingBehavior(Sing singBehavior) {
		this.singBehavior = singBehavior;
	}
	public Bird(){
		flyBehavior = new FlyImpl();
		setFlyBehavior(flyBehavior);
		
		singBehavior = new SingImpl();
		setSingBehavior(singBehavior);
		
		walkBehavior = new WalkImpl();
		setWalkBehavior(walkBehavior);
		
		setDescription("I am a Bird");
	}
}
