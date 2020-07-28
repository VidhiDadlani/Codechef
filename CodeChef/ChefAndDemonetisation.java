import java.util.*;
class ChefAndDemonetisation
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0)
		{
			t--;
			int s = sc.nextInt();
			int n = sc.nextInt();
			if(s <= n)
			{
				if(s > 1 && s%2 != 0)
					System.out.println("2");
				else
					System.out.println("1");
			}
			else
			{
				int q = s/n;
				int r = s%n;
				if(r%2 != 0 && r != 1)
					q = q + 2;
				else if(r%2 == 0 && r != 0)
					q = q + 1;
				else 
					q = q + 0;
				System.out.println(q);
			}
		}
	}
}
