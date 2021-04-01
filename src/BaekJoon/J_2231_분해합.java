package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J_2231_분해합 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		
		// 216의 생성자는 198 도 있고, 207 도 있다
		//따라서 생성자 중에서 최솟값을 찾기 위해서는 작은 수 부터 찾아야 한다
		
		for (int i = 0; i < N; i++) {
			int sum = 0;		// 자릿수 합
			int num = i;		// 생성자 위치
			
			while (num!=0) {
				sum = sum + (num%10);	// 각 자릿수 더하기 (1의 자리부터)
				num /= 10;				// 자릿수 높혀가면서 
			}
			
			if (sum + i == N) {			// 자릿수 합과 그 생성자위치를 더한 값이 주어진 분해합과 같을 때 
				result = i;
				break;
			}
		
		}
		System.out.println(result);
	}
											// 브루트포스 알고리즘 같은 경우 자명하게 불가능한 범위를 제외시키면 성능이 향샹
											// 이러한 부분을 고민해볼 필요가 있음
}
