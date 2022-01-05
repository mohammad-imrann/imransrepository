package january03;

public class asgnmtMSB {

	public static void main(String[] args, Object math) {
		// TODO Auto-generated method stub
		
		int n=10;
		int count=0;
		
		while(n!=0)
		{
			n=n/2;
			count++;
		}
		System.out.println(count);
		int res=(int)Math.pow(2, count-1);
		if((n&res)==res) {
			System.out.println("1");
		}
		else
		{
		System.out.println("0");

	}

}
}
