package array;

public class quiz3 {

	public static void main(String[] args) {
//		5개 크기인 정수형 배열을 생성, 다음과 같이 초기화 { 10, 15, 20, 25, 30 }
//		반복문을 사용하여 배열요소의 합을 구하고 출력 합계: 100
		
		int[] intArr = new int[] { 10, 15, 20, 25, 30};
		
		int sum = 0;
		for (int i=0; i<=4; i++) {
			sum += intArr[i];
		}
		System.out.println(sum);
	}

}
