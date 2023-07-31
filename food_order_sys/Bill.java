package food_order_sys;


public class Bill extends Food_Ordering_System
{

	//7.Generation of Bill
	public void Bill() 
	{
		System.out.println("\n*Your Bill*"); 
		System.out.println("\nItem You Ordered : "+menu_item);
		System.out.println("\nTotal Amount: Rs "+ total);//total Bill is Displayed
		System.out.println("\nThank You Visit us Again!!!!");
	}

}
