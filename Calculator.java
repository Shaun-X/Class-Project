package com.Shaun.project;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the calculator app.");
	}
	
	public static Integer sum(Integer x, Integer y){
		if(x == null || y == null)
			return null;
		return x + y;
	}
	public static Integer substraction(Integer x, Integer y) {
		if(x == null || y == null)
			return null;
		return x - y;
	}
	public static Integer mutliply(Integer x, Integer y) {
		if(x == null || y == null)
			return null;
		return x * y;
	}
	public static Integer division(Integer x, Integer y) {
		if(x == null || y == null || y == 0)
			return null;
		return x / y;
	}
	

}

