package com.example.holywood;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ProductCounter {

	//The first map counts posters
	private Map<String, Long> postersCountMap = new HashMap<>();
	//stores the mapping of actors to posters
	private Map<String, String> posterActorNames = new TreeMap<>();
	
	public ProductCounter( Map posterActorNames ) {
		this.posterActorNames = posterActorNames;
	}

	
}
