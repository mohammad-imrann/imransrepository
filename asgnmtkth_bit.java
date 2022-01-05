package january03;

import java.util.Scanner;

public class asgnmtkth_bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();
        System.out.println("Enter the bit:");
        int n1= sc.nextInt();
        int val=(int)Math.pow(2,n1-1);
        n=n | val;
        System.out.println(n);


	}

}
