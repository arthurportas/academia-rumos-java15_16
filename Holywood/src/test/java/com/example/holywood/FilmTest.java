package com.example.holywood;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.Test;

import com.example.holywood.domain.ActionFilm;
import com.example.holywood.domain.ComedyFilm;
import com.example.holywood.domain.Film;
import com.example.holywood.domain.Rating;

public class FilmTest {

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
	//test 2 action films have different ratings
	@Test
	public void test2ActionFilmsHaveDifferentRatings() {
		List<Film> films = filmGenerator(2);
		final Film a = films.get(0);
		final Film b = films.get(1);
		assertTrue("Films a and b should have different ratings", a.getIMDBRating() != b.getIMDBRating());
	}

	private List<Film> filmGenerator(int i) {
		List<Film> films = new ArrayList<>();
		while (i>0){
			Film film = new ActionFilm(i, "Film_"+ i, i);
			films.add(film);
			i--;
		}
		return films;
	}
	
	//testar rating do film "Die Hard" = NC17
	@Test
	public void testDieHardActionFilmsHasRatingNC17() {
		
		ActionFilm actionFilm = new ActionFilm(0, "Die Hard", 1988, 25);
		actionFilm.setFilmRating(Rating.NC17);
		assertTrue("Film 'Die Hard' should have NC17 rating", actionFilm.getFilmRating().equals(Rating.NC17));	
	}
	
	@Test
	public void testFilmTranslationIn_pt_PT(){
	    ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", Locale.getDefault());
		assertTrue("Film in pt_PT should be 'Filme'", messages.getString("hollywood.domain.film").equals("Filme"));	

	}
	
	@Test
	public void testFilmTranslationIn_en_UK(){
		Locale enUKLOcale = new Locale("en", "UK");
	    ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", enUKLOcale);
		assertTrue("Film in en_UK should be 'FilmUK'", messages.getString("hollywood.domain.film").equals("FilmUK"));	

	}
	
	//test 20 action films and return number of ones that have the same rating
	
	
}
