package ilstu.edu;
import java.util.Scanner;
public class Bank {
public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double balance = 0;
		boolean isRunning = true;
		int choice;
		
	while(isRunning) {
		System.out.println("***************");
		System.out.println("BANKING PROGRAM");
		System.out.println("***************");
		System.out.println("1. Show Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Exit");
		System.out.println("***************");
		
		System.out.println("Enter your choice (1-4): ");
		choice = scan.nextInt();
		
	switch(choice) {
		case 1: showBalance(balance);
		break;
		case 2: balance += deposit();
		break;
		case 3: balance -= withdraw(balance);
		break;
		case 4: isRunning = false;
		break;
		default: System.out.println("INVALID CHOICE");
		break;
		}
	}
		System.out.println("***************************");
		System.out.println("Thank you! Have a nice day!");
		System.out.println("***************************");
		scan.close();
	}
	static void showBalance(double balance) {
		System.out.println("***************");
		System.out.printf("$%.2f\n", balance);
	}
	static double deposit() {
		double amount;
		System.out.print("Enter an amount to be deposited: ");
		amount = scan.nextDouble();
		
		if(amount < 0) {
			System.out.println("Amount can't be negative");
			return 0;
		}
		else {
			return amount;
		}
		
	} 
	static double withdraw(double balance) {
		double amount;
		System.out.print("Enter an amount to be withdrawn: ");
		amount = scan.nextDouble();
		if(amount > balance) {
			System.out.println("INSUFFICIENT FUNDS");
			return 0;
		}
		else if(amount < 0) {
			System.out.println("Amount can't be negative");
			return 0;
		}
		else {
			return amount;
		}
		
	}
	
}