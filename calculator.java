package task1;

import java.util.Scanner;

public class SampleCalculator {
	public class Calculator {
		
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);

			System.out.println("simple calculater");
			System.out.println("1. addition");
			System.out.println("2. substraction");
			System.out.println("3. multiplication");
			System.out.println("4. division");
			
			System.out.println("enter your choice (1/2/3/4)");
			int choice=scanner.nextInt();
			
			System.out.println("enter the first number");
			double num1=scanner.nextDouble();
			
			System.out.println("enter the second number");
			double num2=scanner.nextDouble();
			
			switch (choice )
			{
			case 1:
				System.out.println("result: " + add(num1,num2));
				
				break ;
				
			case 2:
				System.out.println("result: " + subtract(num1,num2));
				break ;
				
			case 3:
				System.out.println("result: " + multiply(num1,num2));
				break ;
				
			case 4:
				if(num2!= 0)
				{
				System.out.println("result: " + divided(num1,num2));
				}
				else 
				{
					System.out.println("divison not zero is not allowed");
				}
				break ;
				
				default :
					System.out.println("invalid choice");
			}
			 scanner.close();
		}
		
		 public static double add(double num1,double num2 ) {
		 return num1+num2; 
		 }
		 
		 public static double subtract(double num1,double num2 ) {
			 return num1-num2;
		 }
		 
		 public static double multiply (double num1,double num2 ) {
			 return num1*num2;
		 }
		 
		 public static double divided(double num1,double num2 ) {
			 return num1-num2;
		 }
		 
	}


}
