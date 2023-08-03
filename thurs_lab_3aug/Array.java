/*
Write a program that asks the user to input ten integers and stores them in an array.
The program should then find and print the smallest and largest values in the array.
*/

package thurs_lab_3aug;

import java.util.Scanner;

public class Array 
{
	
	int i,grt,sml;
	int[]arr;
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args)
	{  
		//Display Function is called.
		Array obj=new Array();
		obj.Display();
		
	}
	
	//Array Function.
	public void Array_Function() 
	{
		arr=new int[10];
		System.out.println("Enter 10 Number: ");
		for(i=0;i<arr.length;i++) 
		{
			arr[i]=sc.nextInt();
		}
		grt=arr[0];
		sml=arr[0];
		for(i=0;i<arr.length;i++)//for loop is used to check the smallest and largest no.
		{
			if(grt<arr[i])//Condition for Largest no.
			{
				grt=arr[i];
			}
			else if(sml>arr[i])//Condition for Smallest no.
			{
				sml=arr[i];
			}
		}
		return;
	}
	
	//Display Function.
	public void Display() 
	{
		 	Array_Function();
		    System.out.println("The Smallest no is = "+sml);//Prints The Smallest No
			System.out.println("The Largest no is = "+grt);//Prints The Largest No
	}

}
