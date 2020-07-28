import java.util.*;
class CacheHits

{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0)
		{
			t--;
			int n = sc.nextInt();
			int b = sc.nextInt();
			int m = sc.nextInt();
			int arr;
			int q=0,count=0;
			for(int i=0;i<m;i++)
			{
				arr = sc.nextInt();
				if(arr/b!=q)
				{
					q = arr/b;
					count++;
				}
				if(arr/b==q && i==0)
				{
				    count++;
				}
			}
			if(count==0)
			{
			    System.out.println("1");
			}
			else 
		    	System.out.println(count);
		}
	}
}