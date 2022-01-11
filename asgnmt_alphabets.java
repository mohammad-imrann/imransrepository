package january07;

import java.util.Scanner;

public class asgnmt_alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int length=str.length();
		char[]ch=str.toCharArray();
		int count=0;
		for(int i=0;i<length;i++)
		{
			if((ch[i]>=65 && ch[i]<=90)&& ch[i]>=97 && ch[i]<=122)
			{
				count++;
			}
		}
		System.out.println(count);
		
		
	}

}
