package com.assignment.animal.behavior;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.assignment.animal.behavior.implementation.SingImpl;

public class SingTest {

	private static final String SING_MESSAGE = "I am singing...";
	@Test
	public void testWalk(){
		Sing walk = new SingImpl();
		String message = walk.sing();
		assertEquals(SING_MESSAGE, message);
	}
}
