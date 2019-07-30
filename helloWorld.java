package helloWorld;

import java.util.Scanner;

public class helloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hello world exercise
		System.out.println("hello world!");
		//exercise 1
		exercise_1();
		// convert 100lb to kg
		lbTokg();
		// switch coding exercise
		switch_exercise();
			
		}
	public static void exercise_1(){
		int i = 500;
		short s = 10;
		byte b = 30;
		long l = 70000 + 15 * i + s + b;
		System.out.println(l);
	}
	public static void lbTokg(){
		int lb = 100;
		double kg = 0.45359237 * lb;
		System.out.println("100lb is " + kg + "kg");
	}
	public static void switch_exercise(){
		char c = ' ';
		String s = " ";
		do{
		System.out.println("Please enter a letter: ");
		Scanner scnr = new Scanner(System.in);
		c = scnr.next().charAt(0);;
		switch(Character.toLowerCase(c)){
			case 'a':
				System.out.println("Apple");
				break;
			case 'b':
				System.out.println("Banana");
				break;
			case 'c':
				System.out.println("Cherries");
				break;
			case 'd':
				System.out.println("Dragon fruit");
				break;
			case 'e':
				System.out.println("Elder Berry");
				break;
			default: 
				System.out.println("No such fruit");
				break;
			}
			System.out.println("Do you wish to continue?: ");
			System.out.println("Yes or No");
			s = scnr.next();
		}while(s.equalsIgnoreCase("yes"));
		if(s.equalsIgnoreCase("no")){
			System.out.println("See you next time!");
		}
	}
		
	}


