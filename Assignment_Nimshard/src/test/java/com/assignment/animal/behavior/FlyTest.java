package com.assignment.animal.behavior;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.assignment.animal.behavior.implementation.FlyImpl;

public class FlyTest {

	private static final String FLY_MESSAGE = "I am flying...";
	@Test
	public void testFly(){
		Fly fly = new FlyImpl();
		String message = fly.fly();
		assertEquals(FLY_MESSAGE, message);
	}
}
