package january07;

import java.util.Scanner;

public class asgnmt_stringsare_equalornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string:");
		String str1=sc.next();
		System.out.println("Enter second string:");
		String str2=sc.next();
		
		if(str1.equals(str2))
		{
			System.out.println("strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}

	}

}
