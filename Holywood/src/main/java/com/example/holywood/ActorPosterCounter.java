package com.example.holywood;

import java.util.Map;
import java.util.TreeMap;

public class ActorPosterCounter {

	
	public ActorPosterCounter( Map map ){
		
	}
	
	public void processList( String[] arg ){
		
	}
	
	public void printReport(){
		
	}
	public static void main( String[] args ) {
		
		// List of posters
		String[] posters = new String[]{"1S01", "1S01", "1S01", "1S01", 
				"1S01", "1S02", "1S02", "1S02", "1H01", "1H01", 
				"1S02", "1S01", "1S01", "1H01", "1H01", "1H01", 
				"1S02", "1S02", "1M02", "1M02", "1M02"};
		// Create Actor Name Poster Number map
		Map<String, String> posterActorNames = new TreeMap<>();
		posterActorNames.put("Tom Hanks", "1S01");
        posterActorNames.put("Brad Pitt", "1S02");
        posterActorNames.put("Harrison Ford", "1H01");
        posterActorNames.put("Jack Nicholson", "1M02");

	}
}
