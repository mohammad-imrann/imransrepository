package january07;

import java.util.Scanner;

public class asgnmt_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string");
		String str=sc.next();
		int length=str.length();
		char[]ch=str.toCharArray();
		int count=0;
		for(int i=0;i<length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
