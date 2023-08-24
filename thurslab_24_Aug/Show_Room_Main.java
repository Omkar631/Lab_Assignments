/*Design a class named ShowRoom with the following description: Instance variables/data members:
String name: to store the name of the customer.
 */

package thurslab_24_Aug;

//Main class where Show_Room method is called in the Main.
public class Show_Room_Main extends Show_Room
{
	    public static void main(String[] args)
	    {
	    	//Show_Room Object is created and call the member methods.
	    	Show_Room  customer = new Show_Room ();
	        customer.input();
	        customer.calculate();
	        customer.display();
	    }
	
}
