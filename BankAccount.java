package helloWorld;

public class BankAccount {
	private long acc_num = 0;
	private double balance = 0;
	private String name = "";
	private String email = "";
	private String phoneNum = "";
	
			
	public BankAccount(){
		this.acc_num = 123456789;
		this.balance = 50.0;
		this.name = "Shaun";
		this.email = "hanx9607@gmail.com";
		this.phoneNum = "6086224132";
	}
	
	public BankAccount(long acc_num, double balance, String name, String email, String phoneNum){
		this.acc_num = acc_num;
		this.balance = balance;
		this.name = name;
		this.email = email;
		this.phoneNum = phoneNum;
	}
	public long getAccNum(){
		return this.acc_num;
	}
	public double getBalance(){
		return this.balance;
	}
	public String getName(){
		return this.name;
	}
	public String getEmail(){
		return this.email;
	}
	public String getPhoneNum(){
		return this.phoneNum;
	}
	public void deposit(double amount){
		this.balance += amount;
	}
	public void withdraw(double amount){
		this.balance -= amount;
	}
	public String toString(){
		return "Customer's name is: " + this.name + "\n" + 
				"Account number is: " + this.acc_num + "\n"+
				"Balance is: " + this.balance +"\n" + 
				"Email is: " + this.email +"\n"+ "Phone number is: " + 
				this.phoneNum;
	}
	
}
