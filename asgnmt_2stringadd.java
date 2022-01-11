package january07;

import java.util.Scanner;

public class asgnmt_2stringadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string:");
		String str1=sc.next();
		System.out.println("Enter second string:");
		String str2=sc.next();
		
		String res=str1.concat(str2);
		System.out.println(res);
	}

}
