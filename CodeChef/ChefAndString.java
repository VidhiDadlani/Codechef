import java.io.*;
class ChefAndString
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(ob.readLine());
		while(t!=0)
		{
			t--;
			String s;
			s = ob.readLine();
			char c[] = new char[s.length()];
			int count=0;
			for(int i=0;i<s.length();i++)
				c[i] = s.charAt(i);
			int i=0;
			while(i<=s.length()-2)
			{
				if((c[i]=='x' && c[i+1]=='y') || (c[i]=='y' && c[i+1]=='x'))
				{
					count++;
					i = i+2;
				}
				else 
					i++;
			}
			System.out.println(count);
		}
	}
}