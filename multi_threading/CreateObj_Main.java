/*Write a Java program which creates only one object. If user attempts to create second object, he should not be able to create it. 
  (Using user defined Exception).
*/

package multi_threading;

public class CreateObj_Main
{

		public static void main(String[] args)
	    {
	         try
	         {
	        	
	        	 // create three object for checking (only t1 will execute after t1 it will be gives an error message) 
	        	 CreateObj obj1= new CreateObj ();
	        	 System.out.println("First object created");
	        	 
	        	 CreateObj obj2= new CreateObj ();
	           	 System.out.println("Second object created");
	           	 
	           	 CreateObj obj3= new CreateObj ();
	           	 System.out.println("Third object created");
	           	 
	         }

	         catch (User_Exception e)
	         {
	        	 System.out.println(e);
	         }
	    }
		
	
}
