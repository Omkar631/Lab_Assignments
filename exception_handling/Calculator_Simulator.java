package exception_handling;
//Main Class where the all method is called.
public class Calculator_Simulator 
{

	public static void main(String[] args) 
	{
		System.out.println("========>>>>TAX CAlCULATOR<<<<========\n");
		
		//Tax_Calculator object is created.
		Tax_Calculator obj=new Tax_Calculator();
		//Try is used to run the code,if any Exception it throws to catch.
		try 
		{
			System.out.println("\nYour Tax Amount is "+"Rs " +obj.calculateTax(null, false, 0)+"/-");
		}
		//catch checks for the Exception thrown by the try and handles it.
		catch(EmployeeNameInvalidException |CountryNotValidException| TaxNotEligibleException e)
		{
			System.out.println(e.getMessage());
		}
		//finally runs the code after try and catch.
		finally 
		{
			System.out.println("\n========>>>>Thank You<<<<========");
		}
		

	}

	
	
	

}
