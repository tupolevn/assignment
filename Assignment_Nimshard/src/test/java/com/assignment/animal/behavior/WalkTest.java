package com.assignment.animal.behavior;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.assignment.animal.behavior.implementation.WalkImpl;

public class WalkTest {

	private static final String WALK_MESSAGE = "I am walking...";
	@Test
	public void testWalk(){
		Walk walk = new WalkImpl();
		String message = walk.walk();
		assertEquals(WALK_MESSAGE, message);
	}
}
