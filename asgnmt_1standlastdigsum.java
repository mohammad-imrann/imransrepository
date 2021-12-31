package december30;

public class asgnmt_1standlastdigsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=12345;
		
		int b=number%10;
		int a=number;
		
		while(a>=10)
		{
			a=a/10;
		}
		System.out.println("first digit is :"+ a+"last digit is :"+ b);
		int result=a+b;
		System.out.println(result);
			

	}

}
