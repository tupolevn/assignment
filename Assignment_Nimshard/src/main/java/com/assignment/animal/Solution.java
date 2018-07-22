package com.assignment.animal;

import com.assignment.animal.behavior.Sing;
import com.assignment.animal.behavior.implementation.CatSoundImpl;
import com.assignment.animal.behavior.implementation.DogSoundImpl;
import com.assignment.animal.behavior.implementation.RoosterSoundImpl;

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

		System.out.println();
		System.out.println("===========================================");
		Rooster rooster = new Rooster();
		rooster.description();
		rooster.walk();
		rooster.fly();
		rooster.sing();

		System.out.println();
		System.out.println("===========================================");
		System.out.println("Parror with dog in house");
		Bird parrotWithDog = new Parrot();
		Sing dogSoundBehavior = new DogSoundImpl();
		parrotWithDog.setSingBehavior(dogSoundBehavior);
		parrotWithDog.description();
		parrotWithDog.walk();
		parrotWithDog.fly();
		parrotWithDog.sing();

		System.out.println();
		System.out.println("===========================================");
		System.out.println("Parror with cat in house");
		Bird parrotWithCat = new Parrot();
		Sing catSoundBehavior = new CatSoundImpl();
		parrotWithCat.setSingBehavior(catSoundBehavior);
		parrotWithCat.description();
		parrotWithCat.walk();
		parrotWithCat.fly();
		parrotWithCat.sing();

		System.out.println();
		System.out.println("===========================================");
		System.out.println("Parror near Rooster");
		Bird parrotWithRooster = new Parrot();
		Sing RoosterSoundBehavior = new RoosterSoundImpl();
		parrotWithRooster.setSingBehavior(RoosterSoundBehavior);
		parrotWithRooster.description();
		parrotWithRooster.walk();
		parrotWithRooster.fly();
		parrotWithRooster.sing();

		System.out.println();
		System.out.println("===========================================");

		Fish fish = new Fish();
		fish.description();
		fish.swim();

		System.out.println();
		System.out.println("===========================================");

		Shark shark = new Shark();
		shark.description();
		shark.swim();
		shark.eat();

		System.out.println();
		System.out.println("===========================================");

		Clownfish clownfish = new Clownfish();
		clownfish.description();
		clownfish.swim();
		clownfish.makeJoke();

		System.out.println();
		System.out.println("===========================================");
		Dolphin dolphin = new Dolphin();
		dolphin.description();
		dolphin.swim();

		System.out.println();
		System.out.println("===========================================");
		Butterfly butterfly = new Butterfly();
		butterfly.description();
		butterfly.fly();
		butterfly.sing();

		System.out.println();
		System.out.println("===========================================");
		butterfly.growUp();
		butterfly.description();
		butterfly.fly();
		butterfly.sing();

		System.out.println();
		System.out.println("===========================================");
		RoosterPOC roosterPOC = new RoosterPOC();
		rooster.description();
		roosterPOC.walk();
		roosterPOC.fly();
		roosterPOC.sing(Language.DANISH);
	}

}
