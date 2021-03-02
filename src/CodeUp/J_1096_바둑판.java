package CodeUp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J_1096_¹ÙµÏÆÇ {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int tmp[][] = new int[20][20];
		
		for (int i = 0; i < N; i++) {
			String P = br.readLine();
			StringTokenizer st = new StringTokenizer(P," ");
			tmp[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())]=1;
		}
		for (int i = 1; i <= 19; i++) {
			for (int j = 1; j <= 19; j++) {
				System.out.print(tmp[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
