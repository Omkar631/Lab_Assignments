package food_order_sys;


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
					Starters obj1=new Starters();
					obj1.Starters();
					System.out.println("\nDo you want to add another starter y/n: ");
					ans=sc.next().charAt(0);
					}while(ans=='y'||ans=='Y');
					
					break;
					
				case 2:
					do
					{
					MainCourse obj2=new MainCourse();
					obj2.MainCourse();
					System.out.println("\nDo you want to add another Main Course y/n: ");
					ans=sc.next().charAt(0);
					}while(ans=='y'||ans=='Y');
					break;
			
				case 3:
					do
					{
					Breads obj3=new Breads();
					obj3.Breads();
					System.out.println("\nDo you want to add another Bread y/n: ");
				    ans=sc.next().charAt(0);
					}while(ans=='y'||ans=='Y');
					break;
			
		        case 4:
			        do
					{
			        Rice obj4=new Rice();
			        obj4.Rice();
			        System.out.println("\nDo you want to add another Rice y/n: ");
					ans=sc.next().charAt(0);
					}while(ans=='y'||ans=='Y');
			        break;
		        	
			    case 5:
			       	do
					{
			       	Deserts obj5=new Deserts();
					obj5.Deserts();
					System.out.println("\nDo you want to add another Desert y/n: ");
					ans=sc.next().charAt(0);
					}while(ans=='y'||ans=='Y');
					break;	
						
			    case 6:
			        do
					{
			        Drinks obj6=new Drinks();
			       	obj6.Drinks();
			       	System.out.println("\nDo you want to add another Drink y/n: ");
					ans=sc.next().charAt(0);
					}while(ans=='y'||ans=='Y');
			        	break;
			        	
				}
					
				System.out.print("\nDo want to go to Main Menu? y/n: ");
				choice=sc.next().charAt(0);
				
				
			}while(choice=='y');
			System.out.println("\nThank You for Ordering !!!");
			
			Bill obj7=new Bill();
			obj7.Bill();//To Display The Bill
			
		}
}
	

	