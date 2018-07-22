package com.assignment.animal.behavior.implementation;

import com.assignment.animal.behavior.Walk;

public class CrawlImpl implements Walk {

	private String message = "I am Crawling...";
	public String walk() {
		System.out.println(message);
		return message;
	}

}
