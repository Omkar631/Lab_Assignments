package food_order_sys;


public class Breads extends Food_Ordering_System 
{


    //3.Breads Menu
	public void Breads() 
	{
		System.out.print("\n  Breads               Price");
		System.out.print("\n1.Roti                 Rs 40");
		System.out.print("\n2.Naan                 Rs 80");
		System.out.print("\n3.Paratha              Rs 80");
		System.out.print("\n4.Kulcha               Rs 80");
		System.out.print("\nSelect Your Option: ");
		choice3=sc.nextInt();
	
		switch(choice3)//3.Breads Menu
		{
		
			case 1:
				System.out.print("\nRoti                 Rs 40");
				menu_item+="\nRoti                 Rs 40";
				total += 40;
				break;
			case 2:
				System.out.print("\nNaan                 Rs 80");
				menu_item+="\nNaan                 Rs 80";
				total += 80;
				break;
			case 3:
				System.out.print("\nParatha              Rs 80");
				menu_item+="\nParatha              Rs 80";
				total += 80;
				break;	
			case 4:
				System.out.print("\nKulcha               Rs 80");
				menu_item+="\nKulcha               Rs 80";
				total += 80;
				break;	
				
		}
		
	}
}