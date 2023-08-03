/*
 Create an abstract class called "BankAccount"  with attributes such as account number and balance, and abstract methods called "deposit" and "withdraw".
 Create a subclass called "CheckingAccount" that    inherits from BankAccount and implements the  "deposit" and "withdraw" methods.
  Create an object  of the CheckingAccount class and call both the "deposit" and "withdraw" methods.
*/

package thurs_lab_3aug;
import java.util.*;
public abstract class Bank_Account 
{
	double a;
	int pinno=1234;
	static int choice;
	static char y;
	int bal=1000,credit,debit,check_pin;
	static Scanner sc=new Scanner(System.in);

	
	abstract void deposit() ;
	abstract void withdraw();
	
	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}

	public int getPinno() {
		return pinno;
	}

	public void setPinno(int pinno) {
		this.pinno = pinno;
	}
	
	
}
