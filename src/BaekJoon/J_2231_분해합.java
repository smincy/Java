package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J_2231_������ {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		
		// 216�� �����ڴ� 198 �� �ְ�, 207 �� �ִ�
		//���� ������ �߿��� �ּڰ��� ã�� ���ؼ��� ���� �� ���� ã�ƾ� �Ѵ�
		
		for (int i = 0; i < N; i++) {
			int sum = 0;		// �ڸ��� ��
			int num = i;		// ������ ��ġ
			
			while (num!=0) {
				sum = sum + (num%10);	// �� �ڸ��� ���ϱ� (1�� �ڸ�����)
				num /= 10;				// �ڸ��� �������鼭 
			}
			
			if (sum + i == N) {			// �ڸ��� �հ� �� ��������ġ�� ���� ���� �־��� �����հ� ���� �� 
				result = i;
				break;
			}
		
		}
		System.out.println(result);
	}
											// ���Ʈ���� �˰��� ���� ��� �ڸ��ϰ� �Ұ����� ������ ���ܽ�Ű�� ������ �⼧
											// �̷��� �κ��� ����غ� �ʿ䰡 ����
}
