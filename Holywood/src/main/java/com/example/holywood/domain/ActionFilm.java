package com.example.holywood.domain;

import java.util.Random;

public class ActionFilm extends Film {

	private int explosionsCount;
	
	/*public ActionFilm(int id, String title, int year) {
		super(id, title, year);
	}*/

	public ActionFilm(int id, String title, int year) {
		super(id, title, year);
		setIMDBRating( new Random().nextDouble() );
	}
	
	
	public ActionFilm(int id, String title, int year, int explosionsCount) {
		super(id, title, year);
		this.explosionsCount = explosionsCount;
	}


	public int getExplosionsCount() {
		return explosionsCount;
	}

	public void setExplosionsCount(int explosionsCount) {
		this.explosionsCount = explosionsCount;
	}

	@Override
	public void setIMDBRating(double iMDBRating) {
		super.IMDBRating = iMDBRating;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString())
			.append("ActionFilm [explosionsCount=")
			.append(explosionsCount)
			.append("]");
		return builder.toString();
	}

}
