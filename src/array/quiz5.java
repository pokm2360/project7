package array;

public class quiz5 {

	public static void main(String[] args) {
//		5개 크기의 정수형 배열 생성, 다음과 같이 초기화 
//		{5, 20, 100, 30, 77}
//		가장 큰 값을 가지는 인덱스의 값 출력
		
		int[] arr = {5, 20, 100, 30, 77};
		
//		for (int i=0; i<=3; i++) {
//			if (arr[i+1] > arr[i]) {
//				System.out.println(arr[i]);
//			} else {
//				System.out.println(arr[i+1]);
//			}
		
		int max = arr[0];
		
		for (int i=1; i<5; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
		
	}

}
