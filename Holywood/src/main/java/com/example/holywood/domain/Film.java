package com.example.holywood.domain;

public abstract class Film {

	private int id = 0;
	private String title = "-required-";
	private int year = 0;
	
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Film [id=")
			.append(id)
			.append(", title=")
			.append(title)
			.append(", year=")
			.append(year)
			.append("]");
		return builder.toString();
	}
}
