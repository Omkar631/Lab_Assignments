/*
 Design a class named ShowRoom with the following description: Instance variables/data members:
String name: to store the name of the customer.
*/

package thurslab_24_Aug;
import java.util.Scanner;


public class Show_Room 
{
	    String name;
	    long mobno;
	    double cost;
	    double dis;
	    double amount;

	    Show_Room()//
	    {
	        name = "";
	        mobno = 0;
	        cost = 0.0;
	        dis = 0.0;
	        amount = 0.0;
	    }

	    void input() //To Take Input from the User.
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter customer name: ");
	        name = scanner.nextLine();
	        System.out.print("Enter mobile number: ");
	        mobno = scanner.nextLong();
	        System.out.print("Enter cost of items purchased: ");
	        cost = scanner.nextDouble();
	        scanner.close();
	    }

	    void calculate() // To calculate the Discount.
	    {
	        if (cost <= 10000) {
	            dis = cost * 0.05;
	        } else if (cost <= 20000) {
	            dis = cost * 0.1;
	        } else if (cost <= 35000) {
	            dis = cost * 0.15;
	        } else {
	            dis = cost * 0.2;
	        }
	        amount = cost - dis;
	    }

	    void display()//To Display the Output.
	    {
	    	System.out.println("**************************************" );
	        System.out.println("Customer name: " + name);
	        System.out.println("Mobile number: " + mobno);
	        System.out.println("Amount to be paid after discount: " + amount);
	        System.out.println("************-Thank You-*************" );
	    }

}
