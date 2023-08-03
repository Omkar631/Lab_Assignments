/*
 Create an abstract class called "BankAccount"  with attributes such as account number and balance, and abstract methods called "deposit" and "withdraw".
 Create a subclass called "CheckingAccount" that    inherits from BankAccount and implements the  "deposit" and "withdraw" methods.
  Create an object  of the CheckingAccount class and call both the "deposit" and "withdraw" methods.
*/


package thurs_lab_3aug;

//Bank_Account is extended with the Checking_Account
public class Checking_Account extends Bank_Account
{
	
	public static void main(String[] args)
	{
		
		Checking_Account obj=new Checking_Account();
		do {
			System.out.println("****--Janta Bank--****");
			System.out.print("\n1: Deposit Amount \n2: Withdraw Amount");
			System.out.print("\nEnter Your Option: ");
			choice = sc.nextInt();
			
				switch(choice) 
				{
				case 1: obj.deposit();
				      break;
				case 2: obj.withdraw();
			      break;
				}
				System.out.print("\nDo want to go to Main Menu? y/n: ");
				choice=sc.next().charAt(0);
		   }
		    while(choice=='y');
	     	System.out.print("The Process is Ended!!!! ");

	}

	@Override
	//Deposit Method is called in this Class from the Abstract Class.
	public void deposit() 
	{
		detail();//To get details
		if (getPinno() == check_pin)//if is used to check the pin entered is valid or not.
		{
			System.out.println("\nEnter Deposit Amount: ");
			credit = sc.nextInt();

			setBal(getBal() + credit);
			System.out.println("\nYour balance is: "+"Rs" + getBal() + " /-");

		} 
		else 
		{
			System.out.println("Invalid pin number.");
		}

	}

	@Override
	//Withdraw Method is called in this Class from the Abstract Class.
	public void withdraw() 
	{
		detail();//To get details
		if (getPinno() == check_pin)//if is used to check the pin entered is valid or not.
		{
			System.out.println("\nEnter Withdrawal Amount: ");
			debit = sc.nextInt();

			if (credit < getBal()) 
			{
				setBal(getBal() - debit);
				System.out.println("\nYour balance is: "+"Rs" + getBal());
			} 
			else 
			{
				System.out.println("Insufficient balance.");
				System.out.println("Your balance is : "+"Rs" + getBal() + "/-");
				withdraw();
			}
		} 
		else 
		{
			System.out.println("Invalid pin number");
		}
	}
	
    //User Bank info is asked. 
	public void detail()
	{
		System.out.println("Enter Your Account No: ");
		a=sc.nextInt();
		System.out.println("Enter Your Password: ");
		check_pin=sc.nextInt();
		
	}


}
