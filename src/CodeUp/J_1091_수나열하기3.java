package CodeUp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J_1091_�������ϱ�3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//	���۰� a
		//	���Ұ� m
		// 	���Ұ� d
		//	���° n
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String temp = br.readLine();
		
		StringTokenizer st = new StringTokenizer(temp, " ");
		
		long a = Integer.parseInt(st.nextToken());
		long m = Integer.parseInt(st.nextToken());
		long d = Integer.parseInt(st.nextToken());
		long n = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < n-1; i++) {
			a = (a * m) + d;
		}
		  System.out.println(a);
		
		
	}

}
