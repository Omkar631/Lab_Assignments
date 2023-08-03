/*
 Write a program to implement the process of bank to accept the user details 
 (Bank name,Account type, ac No, User name , password, and also the transaction, loan process)
  and display the output.
*/

package thurs_lab_3aug;
//Bank_details is extended to Bank_operations.
public class Bank_operations extends Bank_details
{
    //
	public static void main(String[] args) 
	{
		//Object is created.
		Bank_operations obj=new Bank_operations();
		obj.print_details();//print_details function is called.
		obj.transcation();//transcation function is called.

	}

}
