package com.example.holywood.domain;

public abstract class Film {

	private int id = 0;
	private String title = "-required-";
	private int year = 0;
	protected double IMDBRating;
	private Rating filmRating;
	
	public Film(int id, String title, int year) {
		this.id = id;
		this.title = title;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getIMDBRating() {
		return IMDBRating;
	}

	public void setIMDBRating(double iMDBRating) {
		IMDBRating = iMDBRating;
	}

	public Rating getFilmRating() {
		return filmRating;
	}

	public void setFilmRating(Rating filmRating) {
		this.filmRating = filmRating;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Film [id=");
		builder.append(id);
		builder.append(", title=");
		builder.append(title);
		builder.append(", year=");
		builder.append(year);
		builder.append(", IMDBRating=");
		builder.append(IMDBRating);
		builder.append(", filmRating=");
		builder.append(filmRating);
		builder.append("]");
		return builder.toString();
	}

	
}
