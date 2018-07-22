package com.assignment.rest.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.animal.Animal;
import com.assignment.rest.api.controllers.service.SearchService;

@RestController
public class SearchAnimalController {

	@Autowired
	private SearchService searchService;

	@RequestMapping("/getanimal")
	public String getAnimal(@RequestParam String name) {

		if(null == name || name.isEmpty()){
			return "No animal name given to search";
		}else{
			name = name.toLowerCase();
		}
		
		Animal animal = searchService.getAnimal(name);
		
		if (null == animal) {
			return "No animal found by the name of: " + name;
		} else {
			return "Found Animal, Description: " + animal.getAnimalDescription();
		}
	}
}
