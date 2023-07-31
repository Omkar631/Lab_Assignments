package inheritance;

public class Array_Operations extends Process

{  
	//Function for the giving Ascending Nos.
	public void Ascending_no() 
	{
		int[] num1=new int[size1];
		for(i=0;i<size1;i++)//For Loop is used to check the size entered by the User
		{
			num1[i]=sc.nextInt();
		}
		for(i=0;i<size1;i++)//For Loop is used to assemble the Nos in Ascending Order
		{
			for(j=i+1;j<size1;j++)
			{
				if(num1[i]>num1[j])
				{
					temp1=num1[i];
					num1[i]=num1[j];
					num1[j]=temp1;
				}
			}
		}
		System.out.println("The Ascending order is=");//Prints The Ascending order 
		for(i=0;i<size1;i++)
		{
			System.out.println(num1[i]);
		}
	
	}
	//Function for the giving Descending Nos.
	public void Descending_no() 
	{
		int[] num1=new int[size2];
		for(i=0;i<size2;i++)//For Loop is used to check the size entered by the User
		{
			num1[i]=sc.nextInt();
		}
		for(i=0;i<size2;i++)//For Loop is used to assemble the Nos in Descending Order
		{
			for(j=i+1;j<size2;j++)
			{
				if(num1[i]<num1[j])
				{
					temp1=num1[i];
					num1[i]=num1[j];
					num1[j]=temp1;
				}
			}
		}
		System.out.println("The Descending order is=");//Prints The Descending order
		for(i=0;i<size2;i++)
		{
			System.out.println(num1[i]);
		}
		
	}
	
	//Function for the Checking Greatest No.
	public void Greatest_no() 
	{
		int[] num1=new int[size3];
			for(i=0;i<num1.length;i++)//For Loop is used to check the size entered by the User
			{
				num1[i]=sc.nextInt();
			}
			grt=num1[0];
		
			System.out.println("The elements are=");

			for(i=0;i<num1.length;i++)
			{
				System.out.println(num1[i]);
			}
			
			for(i=0;i<num1.length;i++)//For Loop is used to
			{
				if(grt<num1[i])
				{
					grt=num1[i];
				}
			}
			System.out.println("The Greatest no is = "+grt);//Prints The Greatest No
			
	}
	
	
	//Function for the Checking Smallest No.
	public void Smallest_no() 
	{
		int[] num1=new int[size4];
			for(i=0;i<num1.length;i++)//For Loop is used to check the size entered by the User
			{
				num1[i]=sc.nextInt();
			}
			sml=num1[0];
			
			System.out.println("The elements are=");
			
			for(i=0;i<num1.length;i++)
			{
				System.out.println(num1[i]);
			}
			
			for(i=0;i<num1.length;i++)
			{
				if(sml>num1[i])
				{
					sml=num1[i];
				}
			}
			System.out.println("The Smallest no is = "+sml);//Prints The Smallest No		
			
	}
	
}

