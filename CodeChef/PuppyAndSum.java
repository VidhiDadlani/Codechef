import java.io.*;
import java.util.*;
public class PuppyAndSum 
{	
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t != 0)
		{
			t--;
			int d = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int sum = 0;
			for(int j=1;j<=d;j++)
			{
				sum =0;
				for(int i=1;i<=n;i++)
					sum = sum + i;
				n = sum;
			}
			System.out.println(sum);
		}
	}

}
