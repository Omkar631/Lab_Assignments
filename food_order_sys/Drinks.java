package food_order_sys;


public class Drinks extends Food_Ordering_System
{


	//6.Drinks Menu
	public void Drinks() 
	{
		System.out.print("\n  Drinks:                                               Price");
		System.out.print("\n1.Cold Drink (Pepsi,Coco-Cola,Sprit,Thumbs-Up)          Rs 120");
		System.out.print("\n2.Solkadi                                               Rs 160");
		System.out.print("\n3.Buttermilk                                            Rs 100");
		System.out.print("\n4.Smoothie (Chocolate,Fruits,Butterscoth,Stawberry)     Rs 280");
		System.out.print("\nSelect Your Option: ");
		choice6=sc.nextInt();
		switch(choice6)	//6.Drinks Menu
		{
		
			case 1:
				System.out.print("\nCold Drink (Pepsi,Coco-Cola,Sprit,Thumbs-Up)      Rs 120");
				menu_item+="\nCold Drink       Rs 120";
				total += 120;
				break;
			case 2:
				System.out.print("\nSolkadi                Rs 160");
				menu_item+="\nSolkadi                Rs 160";
				total += 160;
				break;
			case 3:
				System.out.print("\nButtermilk      Rs 100");
				menu_item+="\nButtermilk      Rs 100";
				total += 100;
				break;	
			case 4:
				System.out.print("\nSmoothie (Chocolate,Fruits,Butterscoth,Stawberry)     Rs 280");
				menu_item+="\nSmoothie      Rs 280";
				total += 280;
				break;	
				
		}
	}
}