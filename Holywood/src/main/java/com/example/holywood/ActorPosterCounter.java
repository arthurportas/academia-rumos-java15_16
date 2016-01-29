package com.example.holywood;

import java.util.Map;
import java.util.TreeMap;

public class ActorPosterCounter {

	
	public static void main(String[] args) {

		// List of posters
		String[] posters = new String[] { "1S01", "1S01", "1S01", "1S01", "1S01", "1S02", "1S02", "1S02", "1H01",
				"1H01", "1S02", "1S01", "1S01", "1H01", "1H01", "1H01", "1S02", "1S02", "1M02", "1M02", "1M02" };
		// Create K=>Actor Name V=>Poster Number map
		Map<String, String> posterActorNames = new TreeMap<>();
		posterActorNames.put("Tom Hanks", "1S01");
		posterActorNames.put("Brad Pitt", "1S02");
		posterActorNames.put("Harrison Ford", "1H01");
		posterActorNames.put("Jack Nicholson", "1M02");

		ProductCounter pc1 = new ProductCounter( posterActorNames );
		pc1.processList( posters );
		pc1.printReport();
	}

	/*
	 * DATASOURCE: posters impressos de cada ator
	 * posterActorNames K,V - Ator e respetivo código sistema
	 * Calcular o número de poster emitidos para cada ator
	 * */

	
}
