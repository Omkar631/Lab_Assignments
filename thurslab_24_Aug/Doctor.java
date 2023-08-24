package thurslab_24_Aug;

public class Doctor 
{
	String name;
    int experienceYears;

    Doctor(String name, int experienceYears)
    {
        this.name = name;
        this.experienceYears = experienceYears;
    }

    void displayInfo() //To Display output.
    {
        System.out.println("Name: " + name);
        System.out.println("Experience Years: " + experienceYears);
    }
}
