package CodeUp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class �������ϱ�_1089 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String temp = br.readLine();
		
		StringTokenizer st = new StringTokenizer(temp," ");
		
		int a = Integer.parseInt(st.nextToken());	// ����
		int d = Integer.parseInt(st.nextToken());	// ����
		int n = Integer.parseInt(st.nextToken());	// ���°
		int out = 0;
		
		for (int i = 0; i < n; i++) {
			out = a + (d*i);
		}
		System.out.println(out);
		
	}

}
