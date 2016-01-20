package com.example.holywood.domain;

public class ActionFilm extends Film {

	private int explosionsCount;
	
	public ActionFilm(int id, String title, int year) {
		super(id, title, year);
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
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString())
			.append("ActionFilm [explosionsCount=")
			.append(explosionsCount)
			.append("]");
		return builder.toString();
	}

}
