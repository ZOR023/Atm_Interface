package javaProject;

import java.awt.TextField;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

 class UserLogin {
	private String username = "aatish";
	private int pwd = 1234;
//	boolean validate = false;

	UserLogin(String username, int pwd) {
		boolean validate = false;
		if(this.username.equals(username)&& this.pwd == pwd) {
			System.out.println("Login Successful");	
			validate  = true;
		}else {
			System.out.println("UnSuccessful Login");
			validate = false;
		}
	}
}


public class AtmInterface {
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		
		
		System.out.println("ATM INTERFACE");
		
		//Validation 
		
//		String username = "aatish";
//		int password = 1234;
		
//		TextField password = new TextField(4);
//		password.setEchoChar('*');
		
		boolean validate = false;
		System.out.println("Enter Username : ");
		String uname = input.nextLine(); 
		System.out.println("Enter Password :");
		int pwd =  input.nextInt();

		UserLogin ul = new UserLogin(uname, pwd);
		
		
		
		
//		boolean validate = false;
//		
//		validate = (uname.equals(username)&& pwd == password)?true:false;
		
	
		
		System.out.println("Select the Operations that you want to perform");
		System.out.println("1.Cash WithDraw ");
		System.out.println("2.Fast Cash ");
		System.out.println("3.Deposit  ");
		System.out.println("4.Check balance ");
		System.out.println("5.Pin Setup ");
		System.out.println("0.Exit");
		System.out.println();
		System.out.println("Enter Your choice : ");
		int choice = input.nextInt();
		
		double balance = 100000,withdraw = 0,total = 0,deposit;
		int tries = 3,pin,newpin = 0;
		char back;
		
		while(!validate) {}
		
		if (choice == 1) {
			
			while(tries>0) {
				
				try {
				System.out.println("Enter the amount you want to withdraw");
				withdraw = input.nextInt();
				total = balance - withdraw;
				System.out.println("₹"+withdraw+"got withdrawn form your Account "+ "Total Amount Withdrawn is "+total);				
				break;
				
				
			  } catch (InputMismatchException e) {
				System.out.println("Invalid input,Try using Numbers HUMAN");
				System.out.println();
				input.nextLine();
				System.out.println("Tries left "+tries);
				tries--;
				
				
			}
			
		}
		System.out.println("Sry, your 3 tries are over");
		
		}
		
		else if(choice == 2) {
			
			System.out.println("Select the amount you want to withdraw from below"+"\n");
			
			System.out.println("1. ₹500"+"\n");
			System.out.println("2. ₹1000"+"\n");
			System.out.println("3. ₹2000"+"\n");
			System.out.println("4. ₹5000"+"\n");
			System.out.println("5. ₹10000"+"\n");
			System.out.println("6. ₹20000"+"\n");
			
			System.out.println("Enter Your Option plz : ");
			int option = input.nextInt();
			
			switch (option) {
			case 1:
				total = balance - 500;
				System.out.println("₹500 got withdraw from the account");
				break;
			case 2:
				total = balance - 1000;
				System.out.println("₹1000 got withdraw from the account");
				break;
			case 3:
				total = balance - 2000;
				System.out.println("₹2000 got withdraw from the account");
				break;
			case 4:
				total = balance - 5000;
				System.out.println("₹5000 got withdraw from the account");
				break;
			case 5:
				total = balance - 10000;
				System.out.println("₹10000 got withdraw from the account");
				break;
			case 6:
				total = balance - 20000;
				System.out.println("₹20000 got withdraw from the account");
				break;

			default:
				System.out.println("Invalid Input");
				break;
			}
			
		}
		
		else if(choice == 3){
			System.out.println("Enter the Amount to Deposit : ");
			deposit = input.nextInt();
			total = balance + deposit;
			System.out.println("Your Amount was Deposited");

		}
		else if(choice == 4){
			
			System.out.println("This is Your Current Balance is "+"₹"+balance);
			
		}
		else if(choice == 5) {
			System.out.println("Enter Your Current PIN :");
			pin = input.nextInt();
			if(pin == pwd) {
			
				System.out.println("Enter Your new PIN");
			
				newpin = input.nextInt();
				if(newpin >= 1000 && newpin <=9999 ) {
					System.out.println("PIN updated Successfully");
					System.out.println("wanna go back ");
					back = input.next().charAt(0);
					if(back == 'Y' || back == 'y') {
						
					}
					
				}else {
					System.out.println("Pin Enter was not a 4 digit pin");
					
				}
				
			} else {
				System.out.println("Wrong PIN");
			}
			
			
		}
		
		else if(choice == 0) {
			System.out.println("Thankyou for Banking");
			System.exit(0);
			
			
		}
		
		
		
		
	}


}
