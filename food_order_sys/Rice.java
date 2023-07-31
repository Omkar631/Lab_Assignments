package food_order_sys;


public class Rice extends Food_Ordering_System
{


    //4.Rice Menu
	public void Rice() 
	{  
		System.out.print("\n  Rice                   Price");
		System.out.print("\n1.Veg Biryani            Rs 260");
		System.out.print("\n2.Veg Fried Rice         Rs 240");
		System.out.print("\n3.Chicken Tikka Biryani  Rs 360");
		System.out.print("\n4.Chicken Dum Biryani    Rs 340");
		System.out.print("\nSelect Your Option: ");
		choice4=sc.nextInt();

		switch(choice4)//4.Rice Menu
		{
		
			case 1:
				System.out.print("\nVeg Biryani            Rs 260");
				menu_item+="\nVeg Biryani            Rs 260";
				total += 260;
				break;
			case 2:
				System.out.print("\nVeg Fried Rice         Rs 240");
				menu_item+="\nVeg Fried Rice         Rs 240";
				total += 240;
				break;
			case 3:
				System.out.print("\nChicken Tikka Biryani  Rs 360");
				menu_item+="\nChicken Tikka Biryani  Rs 360";
				total += 360;
				break;	
			case 4:
				System.out.print("\nChicken Dum Biryani    Rs 340");
				menu_item+="\nChicken Dum Biryani    Rs 340";
				total += 340;
				break;	
				
		}
	}
}