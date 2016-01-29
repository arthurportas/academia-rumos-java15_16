package com.example.holywood;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ProductCounter {

	// The first map counts posters
	private Map<String, Long> postersCountMap = new HashMap<>();
	// stores the mapping of actors to posters
	private Map<String, String> posterActorNames = new TreeMap<>();

	public ProductCounter(Map posterActorNames) {
		this.posterActorNames = posterActorNames;
	}

	public void processList(String[] list) {
		long curVal = 0;
		for (String itemNumber : list) {
			//postersCountMap {1S02=6, 1S01=7, 1M02=3, 1H01=5}
			if (postersCountMap.containsKey(itemNumber)) {
				curVal = postersCountMap.get(itemNumber);
				curVal++;
				postersCountMap.put(itemNumber, new Long(curVal));
			} else {
				postersCountMap.put(itemNumber, new Long(1));
			}
		}
		System.out.println("");
	}

	public void printReport() {
		System.out.println("=== Posters  Report ===");
		//{Brad Pitt=1S02, Harrison Ford=1H01, Jack Nicholson=1M02, Tom Hanks=1S01}
		for (String key : posterActorNames.keySet()) {
			System.out.print("Actor Name: " + key);
			System.out.println("\t\tCount: " + postersCountMap.get(posterActorNames.get(key)));
		}
	}

}
