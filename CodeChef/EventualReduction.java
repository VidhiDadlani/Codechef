import java.io.BufferedReader;
import java.io.InputStreamReader;
public class EventualReduction 
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(br.readLine());
		while(q != 0)
		{
			q--;
			int flag=1;
			int n = Integer.parseInt(br.readLine());
			String s = br.readLine();
			int ar[] = new int[26];
			for(int i=0;i<s.length();i++)
			{
				ar[s.charAt(i)-'a']++;
			}
			for(int i=0;i<26;i++)
			{
				if(ar[i]%2 != 0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
				System.out.println("YES");
			else 
				System.out.println("NO");
		}
	}

}
