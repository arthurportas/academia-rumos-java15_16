package com.example.holywood;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.example.holywood.domain.Actor;

public class ActorStringSplitTest {
	
	String[] actors;
    List<Actor> actorList;

	@Before
	public void setup(){
		actors = new String[12];
		actorList = new ArrayList<>(12);
		sampleActorsData();
	}
	
	@After
	public void destroy(){
		actors = null;
		actorList = null;
	}

	private void sampleActorsData() {
		actors[0] = "1,Tom,Hanks";
        actors[1] = "2,Harrison,Ford";
        actors[2] = "3,Tom,Cruise";
        actors[3] = "4,Jack,Nicholson ";
        actors[4] = "5,Robert,De Niro";
        actors[5] = "6,Al,Pacino";
        actors[6] = "7,Dustin,Hoffman";
        actors[7] = "8,Anthony,Hopkins";
        actors[8] = "9,Paul,Newman";
        actors[9] = "10,Denzel,Washington";
        actors[10] = "11,Morgan,Freeman";
        actors[11] = "12,Tomas,Cruise";
	}

	@Test
	public void testAddToList() {
		populateActorListFromStringArrayDataSource();
		Assert.assertTrue("Second actor first name should be 'Harrison'",
				actorList.get(1).getFirstName().equals("Harrison"));
	}

	private void populateActorListFromStringArrayDataSource() {
		for (String actor : actors) {
			String[] actorProperties = actor.split(",");
			Actor temp = new Actor();
			temp.setActorID(Integer.parseInt(actorProperties[0]));//"1"->1
			temp.setFirstName(actorProperties[1]);
			temp.setLastName(actorProperties[2]);
			actorList.add(temp);//"1,Tom,Hanks";	
		}
	}
	
	//searchByPatternOnFirstName
	//"gan"->1* actorList 'Morgan'
	//"on"-> Harrison, Anthony
	@Test
	public void searchByPatternOnFirstName() {
		populateActorListFromStringArrayDataSource();
		 Assert.assertTrue(hasPatternOnFirstName("on"));
		
	}
	
	@Test
	public void searchByPatternOnFirstNameWithRegex() {
		populateActorListFromStringArrayDataSource();
		 Assert.assertTrue(hasPatternOnFirstNameWithRegex("Toma"));
		
	}
	
	private boolean hasPatternOnFirstName(String pattern){
		for (Actor actor : actorList) {
			if(actor.getFirstName().contains(pattern)){
				return true;
			}
		}
		return false;
	}
	
	private boolean hasPatternOnFirstNameWithRegex(String patternToSearch){
		
		Pattern pattern = Pattern.compile("^" + patternToSearch  + "?\\w+");
		Matcher matcher;
		
		for (Actor actor : actorList) {
			if( pattern.matcher( actor.getFirstName()).find()){
				return true;
			}
		}
		return false;
	}
	
	
}
