import java.util.Scanner;

public class Example {
	public static void main(String[] args){
		final int PIN = 1234;
		boolean flag = true;

		System.out.println("        WELCOME TO THE ATM         ");
		System.out.println("-----------------------------------");

		Scanner s = new Scanner(System.in);
		Bank obj = new Atm();

		System.out.println("Enter Your Four Digit ATM PIN Number");
		System.out.println("-----------------------------------");

		int enteredPin = s.nextInt();

		if(enteredPin == PIN)
		{
			while(flag)
			{
				System.out.println("\n-----------------------------------");
				System.out.println("Select the option to proceed");
				System.out.println("1:DEPOSIT\n2:WITHDRAWL\n3:BALANCE INQUIRY\n4:EXIT");
				System.out.println("-----------------------------------");

				int option = s.nextInt();

				switch(option)
				{
				case 1:
					System.out.println("Enter the amount to be deposited");
					double amountToDeposit = s.nextDouble();
					obj.deposit(amountToDeposit);
					break;

				case 2:
					System.out.println("Enter the amount to be 	Withdrawn");
					double amountToWithdraw = s.nextDouble();
					obj.withdraw(amountToWithdraw);
					break;

				case 3:
					obj.checkBalance();
					break;

				case 4:
					System.out.println("****THANK YOU FOR USING OUR ATM****");	
					System.exit(0);

				default:
					System.out.println("Invalid Option!");
				}
				System.out.println("\nWould you like to continue? (If Yes,Enter 'Y')");
				char choice = s.next().charAt(0);
				if(choice == 'Y')
					flag = true;
				else
				{
					flag = false;
					System.out.println("****THANK YOU FOR USING OUR ATM****");	
				}
			}

		}
		else
		{
			System.out.println("Incorrect PIN Number!");

		}






		s.close();	
	}

}
