package thurslab_24_Aug;

public class Nurse extends Doctor
{

	int yearsOfService;

    Nurse(String name, int experienceYears, int yearsOfService) {
        super(name, experienceYears);
        this.yearsOfService = yearsOfService;
    }

    @Override
    void displayInfo()//This method is used again.
    {
        super.displayInfo();
        System.out.println("Years of Service: " + yearsOfService);
    }

    void provideCare() 
    {
        System.out.println("Nurse " + name + " is providing care to patients.");
    }

}
