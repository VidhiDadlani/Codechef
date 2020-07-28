import java.io.*;
class ChefAndSteps 
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int t = Integer.parseInt(br.readLine());
		while(t != 0)
		{
			t--;
			String s = br.readLine();
			String ar[] = s.split(" ");
			int n = Integer.parseInt(ar[0]);
			int k = Integer.parseInt(ar[1]);
			int m;
			for(int i=0;i<n;i++)
			{
				m = Integer.parseInt(br.readLine());
				if(m%k == 0)
					System.out.print("1");
				else 
					System.out.print("0");
			}
			System.out.println();
		}
	}

}
