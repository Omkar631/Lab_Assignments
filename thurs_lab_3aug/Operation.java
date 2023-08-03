/*
   Create an interface called "Person" with a method called "speak". 
   Create two classes  called "Student" and "Teacher" that implement  
   the Person interface and implement the "speak" method. Create objects of both the Student and
   Teacher classes and call their respective "speak"  methods.
*/
 


package thurs_lab_3aug;

public class Operation {
	//Student and Teacher speak method call in this class	
	public static void main(String[] args) 
	{    
		//Teacher class object
		Teacher obj=new Teacher();
		obj.Speak();
		
		//Student class object
		Student obj1=new Student();
		obj1.Speak();

	}

}
