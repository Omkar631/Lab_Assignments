
/*Write a program to demonstrate the chained exception in Java.
*/


package multi_threading;

@SuppressWarnings("serial")
public class Chained_Exception extends Exception {

	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(
					"Try block will be gives you an error, then catch method also throw exception from try exception\n");
			
			int num = Integer.parseInt(s); // the line will throw a NumberFormatException
			
		} catch (NumberFormatException e) {
			// create a new exception with the message "Exception."
			RuntimeException ex = new RuntimeException("exception");

			// set the cause of the new Exception to a new NullPointerException with the
			ex.initCause(new NullPointerException("it is an actual exception"));

			// throw the new Exception with the chained Exception
			throw ex;
		}
	}

}
