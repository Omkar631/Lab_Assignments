package food_order_sys;


public class Deserts extends Food_Ordering_System
{

	
	//5.Deserts Menu
	public void Deserts() 
	{
		System.out.print("\n  Deserts:                                                         Price");
		System.out.print("\n1.Khulfi (Pista,Malai,Mango,Mix)                                   Rs 180");
		System.out.print("\n2.Falooda (Royal,Pista,Badam,Gulkand)                              Rs 180");
		System.out.print("\n3.Ice-Cream (Chocolate,Vanilla,Stawberry,ButterScotch)             Rs 180");
		System.out.print("\n4.Cake (Chocolate,Fruits,Butterscoth)                              Rs 180");
		System.out.print("\nSelect Your Option: ");
		choice5=sc.nextInt();
		switch(choice5)//5.Deserts Menu
		{
		
			case 1:
				System.out.print("\nKhulfi (Pista,Malai,Mango,Mix)         Rs 180");
				menu_item+="\nKhulfi             Rs 180";
				total += 180;
				break;
			case 2:
				System.out.print("\nFalooda (Royal,Pista,Badam,Gulkand)    Rs 180");
				menu_item+="\nFalooda            Rs 180";
				total += 180;
				break;
			case 3:
				System.out.print("\nIce-Cream (Chocolate,Vanilla,Stawberry,ButterScotch)         Rs 180");
				menu_item+="\nIce-Cream          Rs 180";
				total += 180;
				break;	
			case 4:
				System.out.print("\nCake (Chocolate,Fruits,Butterscoth)    Rs 180");
				menu_item+="\nCake               Rs 180";
				total += 180;
				break;	
				
		}
		
	}
}