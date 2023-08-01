package inheritance;


public class Palindrome extends Process
{
	//Palindrome function
	public void Palindrome() 
	{
		n=num;
		while(num>0)//While is used for the reversing the No and checking The No is Palindrome or Not.
		{
			r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		System.out.println("The Reverse no is " +rev);
		
		
		if(rev==n)//to check the the no is reverse or not.
		{
			System.out.print("\nThe Number is a Palindrome ");
		}
		else
		{
			System.out.println("\nThe Number is Not a Plaindrome");
		}
    }
	
}