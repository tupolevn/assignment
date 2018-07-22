package com.assignment.rest.api.controllers.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.assignment.animal.Animal;
import com.assignment.animal.Butterfly;
import com.assignment.animal.Duck;
import com.assignment.animal.Parrot;
import com.assignment.animal.Rooster;
import com.assignment.animal.Shark;

@Service
public class SearchService {

	Map<String, Animal> animalMap = new HashMap<String, Animal>();
	
	public SearchService(){
		animalMap.put("duck", new Duck());
		animalMap.put("butterfly", new Butterfly());
		animalMap.put("dog", new Rooster());
		animalMap.put("parrot", new Parrot());
		animalMap.put("shark", new Shark());
		animalMap.put("duck", new Duck());
	}
	public Animal getAnimal(String animalName){
		return animalMap.get(animalName);
	}
}
