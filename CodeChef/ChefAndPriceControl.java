import java.util.*;
class ChefAndPriceControl
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0)
		{
			t--;
			int n = sc.nextInt();
			int k = sc.nextInt();
			int ar[] = new int[n];
			int init=0,lost=0;
			for(int i=0;i<n;i++)
			{
				ar[i] = sc.nextInt();
				init = init + ar[i];
			}
			for(int i=0;i<n;i++)
			{
				if(ar[i]>k)
					ar[i] = k;
			}
			for(int i=0;i<n;i++)
				lost = lost + ar[i];
			System.out.println(init-lost);
		}
	}
}