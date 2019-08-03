class maxGroupHappiness{

  static int maxHappiness(int A, int N, String[] v){
		String str;

		int[] val = new int[N];
		int[] wt = new int[N];
		int c = 0;
		for (int i = 0; i < N; i++){
			str = v[i];

			c = 0;
			for (int j = 0; j < str.length(); j++){
				if (str.charAt(j) == 'c'){
					c += 4;
        }
				else if (str.charAt(j) == 'w'){
					c += 3;
        }
				else if (str.charAt(j) == 'm') {
					c += 2;
        }
				else{
					c++;
        }
			}

			c *= str.length();
			val[i] = c;
			wt[i] = str.length();
		}

		int[][] k = new int[N + 1][A + 1];
		for (int i = 0; i <= N; i++)
		{
			for (int w = 0; w <= A; w++)
			{ 
				if (i == 0 || w == 0){
					k[i][w] = 0;
        }
				else if (wt[i - 1] <= w)
				{
					k[i][w] = Math.max(val[i - 1]+ k[i - 1][w - wt[i - 1]], k[i-1][w]);
				}
				else
				{
					k[i][w] = k[i - 1][w];
				}
			}
		}
		return k[N][A];
	}

	public static void main(String[] args)
	{
		int A = 5;

		String[] v = { "mmo", "oo", "cmw", "cc", "c" };
		int N = v.length;
		System.out.println(maxHappiness(A, N, v));
	}
}
