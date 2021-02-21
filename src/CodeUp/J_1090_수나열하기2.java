package CodeUp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J_1090_수나열하기2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// 등비수열
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String temp = br.readLine();
		
		StringTokenizer st = new StringTokenizer(temp," ");
		
		br.close();
		
		long a = Integer.parseInt(st.nextToken());	// 시작값
		long r = Integer.parseInt(st.nextToken());	// 등비
		long n = Integer.parseInt(st.nextToken());	// 몇번째
		
		for (int i = 0; i < n-1; i++) {
			a = a * r;
			
		}
		
		System.out.println(a);
	}

}
