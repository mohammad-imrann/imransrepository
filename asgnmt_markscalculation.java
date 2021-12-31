package december30;

import java.util.Scanner;

public class asgnmt_markscalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter gender:");
		String gender;
		gender=sc.next();
		System.out.println("Enter your marks:");
		int marks=sc.nextInt();
		
		String classification= (gender.equals("m"))?  (marks>=75) ? "intelligent" : (marks>35) ? "average boy" : "dull boy ":(marks>=75)? "intelligent girl":(marks>35)?"average girl":"dull girl";
		System.out.println(classification);
	}

}
