package food_order_sys;


public class MainCourse extends Food_Ordering_System
{


    //2.MainCourse Menu
    public void MainCourse() 
	{
		System.out.print("\n  Main Course          Price");
		System.out.print("\n1.Veg Kholapuri        Rs 220");
		System.out.print("\n2.Veg Mix              Rs 260");
		System.out.print("\n3.Chicken Handi        Rs 320");
		System.out.print("\n4.Chicken Bhuna        Rs 340");
		System.out.print("\nSelect Your Option: ");
		choice2=sc.nextInt();
		switch(choice2)//2.MainCourse Menu
		{
		
			case 1:
				System.out.print("\nVeg Kholapuri        Rs 220");
				menu_item+="\nVeg Kholapuri        Rs 220";
				total += 220;
				break;
			case 2:
				System.out.print("\nVeg Mix              Rs 260");
				menu_item+="\nVeg Mix              Rs 260";
				total += 260;
				break;
			case 3:
				System.out.print("\nChicken Handi        Rs 320");
				menu_item+="\nChicken Handi        Rs 320";
				total += 320;
				break;	
			case 4:
				System.out.print("\nChicken Bhuna        Rs 340");
				menu_item+="\nChicken Bhuna        Rs 340";
				total += 340;
				break;	
				
		}
	
	}
}