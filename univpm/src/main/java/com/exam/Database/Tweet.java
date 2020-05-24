package com.exam.Database;

public class Tweet {
	
	private String A;
	private int B;
	private Double C;
	
	public Tweet(String a, int b, double c) {
		A = a;
		B = b;
		C = c;
	}
	
	public int ContaCaratteri() {
		
		return A.length();
	}

}
