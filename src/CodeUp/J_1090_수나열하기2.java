package CodeUp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J_1090_�������ϱ�2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// ������
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String temp = br.readLine();
		
		StringTokenizer st = new StringTokenizer(temp," ");
		
		br.close();
		
		long a = Integer.parseInt(st.nextToken());	// ���۰�
		long r = Integer.parseInt(st.nextToken());	// ���
		long n = Integer.parseInt(st.nextToken());	// ���°
		
		for (int i = 0; i < n-1; i++) {
			a = a * r;
			
		}
		
		System.out.println(a);
	}

}
