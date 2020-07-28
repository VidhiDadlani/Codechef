import java.util.Scanner;
class EvenMatrix
{
	static int SomeFunction(int i,int n,int k)
	{
		if(i%2==0)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			k--;	
		}
		else
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(k+" ");
				k--;
			}
			k++;
		}
		System.out.println();
		k = k + n;
		return k;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); 
		int test = sc.nextInt();
		while(test!=0)
		{
			test--;
			int n = sc.nextInt();
			int k=1;
			
			for(int i=0;i<n;i++)
			{
				k = SomeFunction(i,n,k);		
			}
		}
	}
}