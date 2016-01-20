package com.example.holywood;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.example.holywood.domain.ActionFilm;
import com.example.holywood.domain.ComedyFilm;

public class ActorTest {



	@Test
	public void testActionFilmNameIs() {
		ActionFilm actionFilm = new ActionFilm(0, "Die Hard", 1988, 25);
		assertTrue("Title should be 'Die Hard'", actionFilm.getTitle().equals("Die Hard"));
		
	}

	@Test
	public void testActionFilmYearIs() {
		ActionFilm actionFilm = new ActionFilm(0, "Die Hard", 1988, 25);
		assertTrue("Year should be '1988'", actionFilm.getYear() == 1988);
	}
	
	@Test
	public void testComedyFilmNameIs() {
		ComedyFilm comedyFilm = new ComedyFilm(1, "Borat", 2006, 42);
		assertTrue("Title should be 'Borat'", comedyFilm.getTitle().equals("Borat"));
	}
}
