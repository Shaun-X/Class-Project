package helloWorld;

import java.util.Scanner;

public class helloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = ' ';
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
		
	}

}
