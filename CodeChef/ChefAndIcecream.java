import java.util.*;
class ChefAndIcecream
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in); 
		int t = sc.nextInt();
		while(t!=0)
		{
			t--;
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++)
				a[i] = sc.nextInt();
			int change[] = new int[3];
			String ans = " ";
			for(int i=0;i<n;i++)
			{
				if(a[i]==5)
				{
					change[0]++;
                    				ans = "YES";
				}
				else if(a[i]==10 && change[0]>=1)
				{
					change[0]--;
					change[1]++;
					ans = "YES";
				}
				else if(a[i]==15 && (change[0]>=2 || change[1]>=1))
				{
					change[2]++;
					if(change[1]>=1)
						change[1]--;
					else if(change[0]>=2)
						change[0] = change[0]-2;
					ans = "YES";
				}
				else
				{
					ans = "NO";
                    				break;
				}
			}
			System.out.println(ans);
		}
	}
}