package january25;

public class asgnmt_nonrepchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="AABBCDEE";
		for(int i=0;i<str.length();i++)
		{boolean flag=true;
			for(int j=0;j<str.length();j++)
			{
				if(i!=j && str.charAt(i)==str.charAt(j))
					flag=false;
						
			}
			if(flag)
			{
				System.out.println(str.charAt(i));
				break;
			}
		}
		

	}

}
