import java.io.*;
import java.util.*;
public class MaximumCandies 
{
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
	
	public static void main(String[] args) 
	{
		FastReader sc = new FastReader();
		int t = sc.nextInt();
		while(t != 0)
		{
			t--;
			int n = sc.nextInt();
			int m = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int product = n*m;
			int ans=0;
			if(product%2 == 0)
			{
				if(x>=y)
					ans = x*(product/2);
				else 
					ans = y*(product/2);
			}
			else
			{
				if(x>=y)
					ans = x*(product/2) + y;
				else 
					ans = y*(product/2) + x;
			}
			System.out.println(ans);
		}
	}

}
