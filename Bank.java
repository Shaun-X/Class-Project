package helloWorld;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		BankAccount customer = new BankAccount();
		System.out.println(customer.toString());
		System.out.println();
		do{
		System.out.println("Welcome, what would you like to see today?");
		System.out.println("1.Account Balance | 2.Deposit Money | 3.Withdraw Money | 4.Exit");
		Scanner scnr = new Scanner(System.in);
		
		choice = scnr.nextInt();
		switch(choice){
			case 1:
				System.out.println("Your account balance is: " + customer.getBalance());
				break;
			case 2:
				System.out.println("How much would you like to deposit?");
				double amount = scnr.nextDouble();
				customer.deposit(amount);
				break;
			case 3:
				System.out.println("How much would you like to withdraw?");
				double amount2 = scnr.nextDouble();
				customer.withdraw(amount2);
				break;
			case 4:
				System.out.println("See you later.");
				break;
			default:
				System.out.println("Please enter a vaild opition.");
		}
		}while(choice != 4);
	}

}
