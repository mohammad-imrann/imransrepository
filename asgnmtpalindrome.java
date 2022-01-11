package january07;

import java.util.Scanner;

public class asgnmtpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="nitin";
		int l=str.length();
		char[]arr=new char[l];
		arr=str.toCharArray();
		
		boolean flag=true;
		int i=0;
		int j=l-1;
		while(i<j)
		{
			if(arr[i]==arr[j])
			{
				i++;
				j--;
			}
			else
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
		
		
		
	}

}
