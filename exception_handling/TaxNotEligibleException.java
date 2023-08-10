package exception_handling;

//TaxNotEligibleException class is created for checking the eligibility of the user for Tax.
@SuppressWarnings("serial")
public class TaxNotEligibleException extends Exception
{
	public TaxNotEligibleException(String message) {
		super (message);
	}
 
}
