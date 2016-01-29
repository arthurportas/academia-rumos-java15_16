package com.example.holywood.domain;

/**
 * Values according to Motion Picture Association of America film rating system
 * <see>
 * */
public enum Rating {

	PG13(99),//Parent Guidance > 13
	G(1),//general admission
	PG(2),//Parent Guidance
	
	R(3),// over 18
	NC17(44);//No one seventeen and under
	
	private int value;
	
	private Rating( int value) {
		this.value = value;
	}
	public int getValue() {
		return this.value;
	}
}
