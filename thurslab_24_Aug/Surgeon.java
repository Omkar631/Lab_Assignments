package thurslab_24_Aug;

public class Surgeon extends Doctor
{

	 	String specialization;

	    Surgeon(String name, int experienceYears, String specialization) 
	    {
	        super(name, experienceYears);
	        this.specialization = specialization;
	    }

	    @Override
	    void displayInfo()//This method is used again.
	    {
	        super.displayInfo();
	        System.out.println("Specialization: " + specialization);
	    }

	    void performSurgery() 
	    {
	        System.out.println("Surgeon " + name + " is performing surgery.");
	    }

}
