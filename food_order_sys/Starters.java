package food_order_sys;


public class Starters extends Food_Ordering_System 
{


    //Starters Menu
	public void Starters() {
		System.out.print("\n  Starters:          Price");
		System.out.print("\n1.Veg Crispy         Rs 180");
		System.out.print("\n2.Veg Kebab          Rs 180");
		System.out.print("\n3.Chicken 65         Rs 280");
		System.out.print("\n4.Chicken Crispy     Rs 280");
		System.out.print("\nSelect Your Option: ");
		choice1=sc.nextInt();
		switch(choice1)//1.Starter's Menu
		{
		
			case 1:
				System.out.print("\nVeg Crispy         Rs 180");
				menu_item+="\nVeg Crispy         Rs 180";
				total += 180;
				break;
			case 2:
				System.out.print("\nVeg Kebab          Rs 180");
				menu_item+="\nVeg Kebab         Rs 180";
				total += 180;
				break;
			case 3:
				System.out.print("\nChicken 65         Rs 280");
				menu_item+="\nChicken 65         Rs 280";
				total += 280;
				break;	
			case 4:
				System.out.print("\nChicken Crispy     Rs 280");
				menu_item+="\nChicken Crispy         Rs 280";
				total += 280;
				break;	
				
		}
		
	}

}