/*
 Write a program to implement the process of bank to accept the user details 
 (Bank name,Account type, ac No, User name , password, and also the transaction, loan process)
  and display the output.
*/


package thurs_lab_3aug;
import java.util.*;
//Parent Class.
public class Bank_details 
{
	   private String Password;
	   private int pinno=123,bal=1000;
	   char y;
	   int ac_no,credit,debit,loan_amt,check_pin,loan_total,time_period,loan_per,choice;
	   
	   String user_name,bank_name,branch_name,check_pass;
	   Scanner sc=new Scanner(System.in);
       
   
		public String getPassword() 
		{
			return Password;
		}
		public void setPassword(String password)
		{
			this.Password = password;
		}
		public int getPinno() 
		{
			return pinno;
		}
		public void setPinno(int pinno) 
		{
			this.pinno = pinno;
		}
		public int getBal()
		{
			return bal;
		}
		public void setBal(int bal)
		{
			this.bal = bal;
		}
		
		//To get Details from the User.
		public void details()
		{
			System.out.println("****************************************************");
			System.out.print("-----------Enter Your Credentials-----------");
			System.out.print("\n\nEnter Bank Name: ");
			bank_name=sc.next();
			System.out.print("Enter Branch Name: ");
			branch_name=sc.next();
			System.out.print("Enter Account Number: ");
			ac_no=sc.nextInt();
			System.out.print("Enter User Name: ");
			user_name=sc.next();
			System.out.print("Enter Password: ");
			check_pass=sc.next();
			System.out.println("\n****************************************************");
			
		}
		
		//To validate pin entered.
		public void pinno()
		{
			System.out.print("Enter Pin no: ");
			check_pin=sc.nextInt();
		}
		
		//To print hte user details
		public void print_details() 
		{
			details();
			System.out.print("-----------Your Credentials-----------");
			System.out.print("\n\nYour Bank Name: "+bank_name);
			System.out.print("\nYour Branch Name: "+branch_name);
			System.out.print("\nYour Account No: "+ac_no);
			System.out.print("\nEnter User Name: "+user_name);
				
		}
		
		//To check the Balance.
		public void check_balance() 
		{
			pinno();
			if(pinno==check_pin) 
			{
				System.out.print("Your Account Balance : "+"Rs" +bal);
			}
			else 
			{
				System.out.print("Your Pin is wrong ");
			}
			
		}
		
		//To Add the Amount.
		public void credit_amount() 
		{ 
			pinno();
			if(pinno==check_pin) 
			{
				System.out.print("Enter the Deposit Amount: ");
				credit=sc.nextInt();
				bal=bal+credit;
				System.out.print("Your Account Balance : "+"Rs" +bal);
				
			}
			else 
			{
				System.out.print("Your Pin is wrong ");
			}
			
		}
		
		//To Debit the Amount.
		public void debit_amount() 
		{  
			pinno();
			if(pinno==check_pin) 
			{
				System.out.print("Enter the Deposit Amount: ");
				debit=sc.nextInt();
			
				if(credit<bal)
				{
					bal=bal-debit;
					System.out.println("Your Account Balance : "+"Rs" +bal);
				}else 
				{
					System.out.println("Your Account Balance : "+"Rs" +bal);
					System.out.println("Your Account Balance is Insufficient ");
				}
			}
			else
			{
				System.out.println("Your Pin is wrong ");
			}
					
		}
		
		//To check Loan Amount and show Interested Amount.
		public void loan_amount() 
		{
			System.out.print("Enter Loan Amount: Rs ");
			loan_amt=sc.nextInt();
			
			if (loan_amt >= 20000) 
			{

				System.out.print("Enter No of Year's: ");
				time_period = sc.nextInt();

				loan_per = 10;

				System.out.println("\nYour loan Amount is " +"Rs."+ loan_amt + "\nPercentage on Amount is: " + loan_per + "%");

				int interest = (loan_amt * loan_per * time_period)/100;
				System.out.println("\nTotal Amount is: " + (loan_amt + interest) + "/-\n");
				System.out.println("Interest Amount on " + loan_amt + " is " + interest + "/-");
				System.out.println("\n****************************************************");
			}

			else 
			{
				System.out.println("We provide loan for more than Rs.20,000/-");
			}
			
		}
		
		//Selecting the process. 
		public void transcation() 
		{
			
			do 
			{
				System.out.println("\n\n****************************************************");
				System.out.print("-----------Select-----------");
				System.out.println("\n1: Check Balance \n2: Deposit Amount \n3: Withdraw Amount \n4: Enquiry for Loan");
				System.out.print("Your Option: ");
				choice=sc.nextInt();
				System.out.println("****************************************************");
				
				switch(choice)
				{
				case 1:
					check_balance();
					break;
					
				case 2:
					credit_amount();
					break;
					
				case 3:
					debit_amount();
					break;
				case 4:
					loan_amount();
					break;
					
				default:
					System.out.print("Enter a valid option! ");
					break;
			
				}
				System.out.print("\nDo want to go to Main Menu? y/n: ");
				choice=sc.next().charAt(0);
	
				
			}while(choice=='y');
			System.out.println("\nThank You !!");
			System.out.println("You Ended the Process !");
		}
	
	
   
   
   
   
}
