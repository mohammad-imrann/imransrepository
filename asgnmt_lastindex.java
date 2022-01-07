package january06;

public class asgnmt_lastindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,3,4,5,6,7,8,9};
		int search=9;
		int lastIndex=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
			{
				lastIndex=i;
			}
		}System.out.println("the element 9 is present at :"+lastIndex+"index");

	}

}
