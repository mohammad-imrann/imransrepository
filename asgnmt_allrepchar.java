package january25;

public class asgnmt_allrepchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="mohammed";
		int l=str.length();
		char[]arr=new char[l];
		arr=str.toCharArray();
		
		
		char ch='m';
		int count=0;
		for(int i=0;i<l;i++)
		{
			if(arr[i]==ch)
			{
				count++;
			}
		}
		System.out.println(count);
		
		

	}

}
