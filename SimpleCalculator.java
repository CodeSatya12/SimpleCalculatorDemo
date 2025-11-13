/*
 *  1.Create methods for addition, subtraction, multiplication, division.
 2.Use Scanner to get user input.
 3.Use a loop to allow multiple calculations until the user exits
 */


package satya3;
import java.util.Scanner;
public class SimpleCalculator 
{
	public static double add(double a,double b)
	{
		return a+b;
	}
	public static double substract(double a,double b)
	{
		return a-b;
	}
	public static double multiply(double a,double b)
	{
		return a*b;
	}
	public static double divide(double a,double b)
	{
		if(b==0)
		{
			System.out.println("cannot divide a no. by zero");
			return 0;
		}
		
		return a/b;
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("-----simple calculator program-------");
			
			System.out.println("1. Addition ");
			System.out.println("2. substraction");
			System.out.println("3. multiplication");
			System.out.println("4. Division");
			System.out.println("5. exit");
			System.out.println("enter choice:");
			choice=sc.nextInt();
			if(choice>=1&& choice<=4)
			{
			System.out.println("enter 1st number:");
			double x=sc.nextDouble();
			System.out.println("enter 2nd number:");
			double y=sc.nextDouble();
			double result=0;
			
				switch(choice)
				{
				case 1:	 result=add(x,y);
						System.out.println("result:"+ result);
						break;
				case 2:  result=substract(x,y);
						System.out.println("result:"+ result);
						break;
				case 3:  result=multiply(x,y);
						System.out.println("result:"+ result);
						break;
				case 4:  result=divide(x,y);
						System.out.println("result:"+ result);
						break;
				
				}
			}
				
			}while(choice!=5);
		
		System.out.println("calculator exited");
		sc.close();

	}

}
