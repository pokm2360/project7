package array;

import java.util.Arrays;

public class quiz4 {

	public static void main(String[] args) {
	
//		5개 크기의 정수형 배열을 생성하세요
//		반복문을 사용하여, 숫자 1~10 중에서 짝수만 배열에 저장
		
		int[] Arr = new int[5];
		
		
//		for (int i=1; i<=10; i++) {
//			if (i % 2 == 0) {
//				System.out.print(i + " ");
//			}
//		}
		int cnt = 0;
		for (int i=1; i<=10; i++) {
			if (i % 2 == 0) {
				Arr[cnt] = i;
				cnt++; // 0~4
			}
		}
		System.out.println(Arrays.toString(Arr));
		
		
		
	}
}
