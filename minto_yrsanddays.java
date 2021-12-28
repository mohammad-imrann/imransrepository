package dec21batchagain;

import java.util.Scanner;

public class minto_yrsanddays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter minutes:");
		int min=sc.nextInt();
		int years=min/525600;
		int days=min/1440;
		
		System.out.println(min+" "+"minutes is"+" "+years+"years and"+" "+days+"days");

	}

}
