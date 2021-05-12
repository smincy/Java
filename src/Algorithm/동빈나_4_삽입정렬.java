package Algorithm;

public class 동빈나_4_삽입정렬 {

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

					// 왼쪽 원소들은 이미 정렬되어 있다는 가정 하에 가장 가까운 왼쪽 원소와 비교하여 자리이동
					// 시간복잡도 O(N^2) 정렬 중에서는 가장 효율적인 알고리즘