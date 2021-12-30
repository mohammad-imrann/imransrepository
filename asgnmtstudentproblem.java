package december29;

import java.util.Scanner;

public class asgnmtstudentproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String gen;
		System.out.println("Enter the gender: ");
		gen=sc.next();
		System.out.println("Enter your marks:");
		int marks=sc.nextInt();
		
		if(gen.equals("m"))
		{
			if(marks>=75 && marks<=100)
			{
				System.out.println("Intelligent boy");
			}
			else if(marks>=35 && marks<75)
			{
				System.out.println("Average boy");
			}
			else
			{
				System.out.println("Dull boy");
			}
		}
			
			else if(gen.equals("f"))
			{
				if(marks>=75 && marks<=100)
				{
					System.out.println("Intelligent girl");
				}
				else if(marks>=35 && marks<75)
				{
					System.out.println("Average girl");
				}
				else
				{
					System.out.println("Dull girl");
				}
			}
			}
			
		
		
	}


