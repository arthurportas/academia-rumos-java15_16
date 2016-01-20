package com.example.holywood.domain;

public class ComedyFilm extends Film {

	private int explosionsCount;
	
	public ComedyFilm(int id, String title, int year) {
		super(id, title, year);
	}

	public ComedyFilm(int id, String title, int year, int explosionsCount) {
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
			.append("ComedyFilm [explosionsCount=")
			.append(explosionsCount)
			.append("]");
		return builder.toString();
	}
}
