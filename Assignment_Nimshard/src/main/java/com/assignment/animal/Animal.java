package com.assignment.animal;


public abstract class Animal {

	private String animalDescription;
	public void setDescription(String description){
		animalDescription = description;
	}
	
	public void description(){
		System.out.println(animalDescription);
	}
}
