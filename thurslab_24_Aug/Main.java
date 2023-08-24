/*Create a program in java to implement multilevel inheritance and hierarchical inheritance.
Take classes like : Doctor , Surgeon and Nurse
Create methods and show method overriding.
*/

package thurslab_24_Aug;

//Main Class Where all The classes are called.


public class Main
{
	    public static void main(String[] args) 
	    {
	    	//Object is created of Class Surgeon.
	        Surgeon surgeon = new Surgeon("Dr.Omkar.S.Sawant", 10, "Cardiovascular");//The Parameters are given.
	        surgeon.displayInfo();
	        surgeon.performSurgery();
	        System.out.println();
	        
	        //Object is created of Class Nurse.
	        Nurse nurse = new Nurse("Nurse Johnson", 5, 3);//The Parameters are given.
	        nurse.displayInfo();
	        nurse.provideCare();
	    }
}

