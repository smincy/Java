package CodeUp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 배수는통과_1088 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= N; i++) {
			
			if (i%3==0) {
				continue;
			}
			System.out.print(i + " ");
			
		}
		
	}

}
