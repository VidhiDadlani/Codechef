import java.util.*;
import java.lang.*;
class TheTomAndJerryGame
{
		static int FactorIsTwo(long t)
		{
			int count=0;
			while(t%2==0)
			{
				t=t/2;
				count++;
			}
			return count;
		}
		static boolean OddFactorExists(long t)
		{
			while(t%2==0)
				t = t/2;
			return t!=1;
		}

		public static void main(String args[])
		{
		Scanner sc = new Scanner(System.in); 
		int test = sc.nextInt();
		while(test!=0)
		{
			test--;
			long t = sc.nextLong();
			long j=0;
			if(t%2!=0)
			{
				j = t/2;
			}
			else 
			{
				int x = FactorIsTwo(t);
				if(OddFactorExists(t))
				{
					long f = (long)Math.pow(2,x+1);
					j = t/f;
				}
				else
					j = 0;
			}
			System.out.println(j);
		}
		
	}
}