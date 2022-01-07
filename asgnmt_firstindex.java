package january06;

import java.util.Scanner;

public class asgnmt_firstindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []names= {"imran","irfan","ismail","imtiyaz"};
		int index=0;
		for(int i=0;i<names.length;i++)
		{
			if(names[i]=="imran")
			{
				index=i;
			}
		}
		System.out.println("Index for the name imran is :"+index);
		
			
	}

}
