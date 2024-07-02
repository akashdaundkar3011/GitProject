package com.practise;

public class Swapping {
	
	public static void main(String[] args) {
		int a=30;
		int b=50;
		
		b=b+a;
		a=b-a;
		b=b-a;
		
		System.out.println("a is >>"+ a);
		System.out.println("b is >>"+ b);
	}

}
