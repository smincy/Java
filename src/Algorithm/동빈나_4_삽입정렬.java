package Algorithm;

public class ����_4_�������� {

	// https://www.youtube.com/watch?v=16I9Z7bS1iM&t=4s
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp = 0;

		int array[] = { 1, 10, 5, 8, 7, 6, 4, 3, 2, 9 };
		int j;
		for (int i = 0; i < 9; i++) {
			j = i;
			while (array[j] > array[j + 1]) {
				temp = array[j];
				array[j] = array[j + 1];
				array[j + 1] = temp;
				j--;
			}

		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}

}

					// ���� ���ҵ��� �̹� ���ĵǾ� �ִٴ� ���� �Ͽ� ���� ����� ���� ���ҿ� ���Ͽ� �ڸ��̵�
					// �ð����⵵ O(N^2) ���� �߿����� ���� ȿ������ �˰���