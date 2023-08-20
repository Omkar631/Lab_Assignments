
/*Write a Java program which creates only one object. If user attempts to create second object, he should not be able to create it. 
  (Using user defined Exception).
*/



package multi_threading;

public class CreateObj 
{

		static int objcount = 1;

		
		// this constructor create only one object, after creating one object this will be gives an error
		public CreateObj () throws User_Exception 
		{
			if (objcount == 1) 
			{
				objcount++;
			} 
			else 
			{
				throw new User_Exception();// error message from "UserException" 
			}
				
				
				
		}


}
