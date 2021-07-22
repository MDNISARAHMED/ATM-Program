public class Atm implements Bank {

	double balance;
	

	@Override
	public void deposit(double amount)
	{
		//System.out.println("Enter the amount to be deposited");
		this.balance += amount;
		System.out.println("Depositing amount Rs."+ amount +"...");
		System.out.println("Amount Deposited Successfully!");
	}

	@Override
	public void withdraw(double amount)
	{
		//System.out.println("Enter the amount to be withdrawn");
		if(amount<=balance)
		{
		this.balance -= amount;
		System.out.println("Withdrawing amount Rs."+ amount +"...");
		System.out.println("Amount Withdrawn Successfully!");
		}
		else
		{
			System.out.println("Insufficient Balance!");
			System.out.println("Withdrawl Failed!");

		}
	}

	@Override
	public void checkBalance()
	{
		System.out.println("Available Balance: "+ balance);
	}
}
