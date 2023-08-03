/*
   Create an interface called "Person" with a method called "speak". 
   Create two classes  called "Student" and "Teacher" that implement  
   the Person interface and implement the "speak" method. Create objects of both the Student and
   Teacher classes and call their respective "speak"  methods.
*/


package thurs_lab_3aug;

public class Teacher implements person{


	@Override
	// Teacher uses interface of person
	public void Speak() 
	{
		System.out.println("The Teacher Class access method speak from interface person");
		
	}

}
