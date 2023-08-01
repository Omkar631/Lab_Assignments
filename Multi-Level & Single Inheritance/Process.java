package inheritance;
import java.util.*;

public class Process 
{
	static int num,n,r,rev=0,n1,n2,choice,temp,size,size1,size2,size3,size4,grt=0,sml=0,i,j,temp1=0;
	static char y;
	static Scanner sc=new Scanner(System.in);
	

	public static void main(String[] args) 
	{   
		
		  do//do-while Loop is used for repeating the Process till the User says no.
		  {    
			System.out.print("\n**--Hybrid Inherentance--**\n\n");
			System.out.print("1.To do Array_Operations\n");
			System.out.print("2.To Find Palindrome\n");
			System.out.print("3.Swapping_Nos\n");
			System.out.print("Your Option: ");
			
			choice=sc.nextInt();

	    	switch(choice)//Switch case for choosing the option.
			{
			//Case1 is used For calling the Array Operation
			case 1:

				Array_Operations obj1=new Array_Operations();
				System.out.println("\nEnter for The Ascending no:");
				System.out.print("Enter the size: ");
				size1=sc.nextInt();
				System.out.println("Enter "+size1+" numbers: ");
				obj1.Ascending_no();
				
				Array_Operations obj2=new Array_Operations();
				System.out.println("\nEnter for The Descending no:");
				System.out.print("Enter the size: ");
				size2=sc.nextInt();
				System.out.println("Enter "+size2+" numbers: ");
				obj2.Descending_no();
				
				Array_Operations obj3=new Array_Operations();
				System.out.println("\nEnter for The Greatest No:");
				System.out.print("Enter the size: ");
				size3=sc.nextInt();
				System.out.println("Enter "+size3+" numbers: ");
				obj3.Greatest_no();
				
				Array_Operations obj4=new Array_Operations();
				System.out.println("\nEnter for The Smallest No:");
				System.out.print("Enter the size: ");
				size4=sc.nextInt();
				System.out.println("Enter "+size4+" numbers: ");
				obj4.Smallest_no();
				
				break;
				
			//Case2 is used for calling Palindrome function to Check The No is Palindrome or Not. 	
			case 2:
				
				System.out.print("\nTo Check Palindrome:- ");
				System.out.print("\nEnter a No: ");
				num=sc.nextInt();
				Palindrome obj5=new Palindrome();
				obj5.Palindrome();
				
				break;
				
			//Case3 is used for calling Swapping_Nos Functions with or without third variable.
			case 3:
				Swapping_Nos obj6=new Swapping_Nos();
				obj6.Swapping_Nos_without_third_variable();
				Swapping_Nos obj7=new Swapping_Nos();
				obj7.Swapping_Nos_with_third_variable();
				
				break;
			
			default :
				//To give warning to user to input the right option.
				System.out.print("!!Warning!!\n");
				System.out.print("Select Options from the Above!!");
				break;
				
			}
	    	
	    	System.out.print("\n\nDo want to do Another Operations? y/n: ");
			choice=sc.next().charAt(0);
			
	    }while(choice=='y');
		System.out.println("\nThank You!!!");
		
	}

}
