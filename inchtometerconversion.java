package dec21batchagain;

import java.util.Scanner;

public class inchtometerconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number in inches:");
		float num=sc.nextFloat();
		
		float res=(float) (num*0.0254);
		System.out.println(res);

	}

}
