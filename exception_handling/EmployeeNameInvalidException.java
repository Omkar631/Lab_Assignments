package exception_handling;

//EmployeeNameInvalidException class for checking the User name is empty or not.
@SuppressWarnings("serial")
public class EmployeeNameInvalidException extends Exception
{
	public  EmployeeNameInvalidException(String message) 
	{
		super(message);
	}

}
