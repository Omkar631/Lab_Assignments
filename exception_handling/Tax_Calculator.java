package exception_handling;

import java.util.Scanner;

public class Tax_Calculator 
{
  
	Scanner sc=new Scanner(System.in);
	

	public double calculateTax(String empName, boolean isIndian, double empsal) throws EmployeeNameInvalidException ,CountryNotValidException,TaxNotEligibleException
	{
		double TaxAmount=0;
		System.out.print("Are You Indian? (True or False): ");
		isIndian=sc.nextBoolean();
		if(isIndian==false) //To validate the Employee is Indian or not and if not it throws Exception.
		{
			throw new CountryNotValidException("The Employee should be an Indian citizen for calculating tax!!");
		}
		else if(isIndian==true) //To validate the Employee is Indian or not and if true it proceeds to further process.
		{
			System.out.print("Enter Your Name: ");
			empName=sc.next();
			if(empName==null)//if block for checking the Employee name is empty or not and gives throws the Exception.
			{
				throw new EmployeeNameInvalidException("The employee name cannot be empty!!");
			}
			else if(empName!=null)//else if block for checking the Employee name is empty or not and if not null it proceeds to further process.
			{
				System.out.print("\nHi "+empName+"!!");
				System.out.print("\nEnter Your Salary: ");
				empsal=sc.nextDouble();
				//if-else for checking the Tax Amount depending on the Salary entered. 
				if(empsal>100000) 
				{
					TaxAmount=empsal *8/100;
				}
				else if(empsal>50000 && isIndian == true)
				{
					TaxAmount=empsal *6/100;
				}
				else if(empsal>30000 && isIndian == true)
				{
					TaxAmount=empsal *5/100;
				}
				else if(empsal>10000 && isIndian == true)
				{
					TaxAmount=empsal *4/100;
				}
				else// To throw the exception if the salary does not fall into criteria.
				{
					throw new TaxNotEligibleException("The employee does not need to pay tax.");
				}
			}
		 }
	return TaxAmount;//To return the Tax Amount.
		
		
	}
}

