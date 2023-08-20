
/*Write a Java program which creates only one object. If user attempts to create second object, he should not be able to create it. 
(Using user defined Exception).
*/
package multi_threading;

@SuppressWarnings("serial")
public class User_Exception extends Exception{
	
	// create exception message
		User_Exception(){
			super("You can not create more than one object.");
		}
	
}