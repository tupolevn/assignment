package com.assignment.animal;

public class Solution {

	public static void main(String[] args) {

		System.out.println("===========================================");
		Bird bird = new Bird();
		bird.description();
		bird.walk();
		bird.fly();
		bird.sing();

		System.out.println();
		System.out.println("===========================================");
		Bird duck = new Duck();
		duck.description();
		duck.walk();
		duck.fly();
		duck.sing();

		System.out.println();
		System.out.println("===========================================");
		Bird chicken = new Chicken();
		chicken.description();
		chicken.walk();
		chicken.fly();
		chicken.sing();
	}

}
