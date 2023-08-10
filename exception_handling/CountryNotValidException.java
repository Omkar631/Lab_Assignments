package exception_handling;

//CountryNotValidException class for checking the nationality of the user is Indian or not.
@SuppressWarnings("serial")
public class CountryNotValidException extends Exception
{
	public  CountryNotValidException(String message) 
	{
		super(message);
	}

	

}
