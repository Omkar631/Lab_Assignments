//WAP to Create a Food Ordering System

import java.util.*;

public class Food_Ordering_System {
	static int choice,choice1,choice2,choice3,choice4,choice5,choice6;
	static char y,n,ans;
	static double total;
	static String menu_item="";
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) 
	{
		System.out.print("!!Welcome To Tasty Tandoori!!\n");
		
		Food_Ordering_System obj= new Food_Ordering_System();
		
		do{
			
		System.out.print("\n  Menu:");
		System.out.print("\n1:Starters\r\n"+ "2:Main Course\r\n"+ "3:Breads\r\n"+ "4:Rice\r\n"+ "5:Deserts\r\n"+ "6:Drinks \n");
		System.out.print("Select Your Option: ");
		choice=sc.nextInt();
		
			switch(choice) 
			{
			
			case 1:
				do
				{
				obj.Starters();
				System.out.println("\nDo you want to add another starter y/n: ");
				ans=sc.next().charAt(0);
				}while(ans=='y'||ans=='Y');
				
				break;
				
			case 2:
				do
				{
				obj.MainCourse();
				System.out.println("\nDo you want to add another Main Course y/n: ");
				ans=sc.next().charAt(0);
				}while(ans=='y'||ans=='Y');
				break;
		
			case 3:
				do
				{
				obj.Breads();
				System.out.println("\nDo you want to add another starter y/n: ");
			        ans=sc.next().charAt(0);
				}while(ans=='y'||ans=='Y');
				break;
		
	               case 4:
		        	do
				{
		        	obj.Rice();
		        	System.out.println("\nDo you want to add another Rice y/n: ");
				ans=sc.next().charAt(0);
				}while(ans=='y'||ans=='Y');
		        	break;
	        	
		        case 5:
		        	do
				{
				obj.Deserts();
				System.out.println("\nDo you want to add another Desert y/n: ");
				ans=sc.next().charAt(0);
				}while(ans=='y'||ans=='Y');
				break;	
					
		        case 6:
		        	do
				{
		        	obj.Drinks();
		        	System.out.println("\nDo you want to add another Drink y/n: ");
				ans=sc.next().charAt(0);
				}while(ans=='y'||ans=='Y');
		        	break;
		        	
			}
				
			System.out.print("\nDo want to go to Main Menu? y/n: ");
			choice=sc.next().charAt(0);
			
			
		}while(choice=='y');
		System.out.println("\nThank You for Ordering !!!");
		
		obj.Bill();//To Display The Bill
	}
	
	
	//1.Starter's Menu
	public void Starters() 
	{
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
	
	//7.Generation of Bill
	public void Bill() 
	{
		System.out.println("\n*Your Bill*"); 
		System.out.println("\nItem You Ordered : "+menu_item);
		System.out.println("\nTotal Amount: Rs "+ total);//total Bill is Displayed
		System.out.println("\nThank You Visit us Again!!!!");
	}

}
