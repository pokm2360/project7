package array;

public class Ex3 {

	public static void main(String[] args) {
		
		// 10개 크기의 정수형 배열 생성
		int[] intArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		// 배열의 요소를 직접 하나씩 출력하기
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		
		//반복문을 사용하여 배열의 요소를 하나씩 출력하기
		for (int i=0; i<=9; i++) { // i를 인덱스로 사용
			System.out.println(intArr[i]);
		}
		// 조건식을 배열의 크기를 바로 알 수 있도록 쓰는게 좋음!!
		for (int i=1; i<10; i++) { // i를 인덱스로 사용 
			System.out.println(intArr[i]);
		}
		
		// 배열의 길이를 나타낼 때는 length 속성 사용
		
		System.out.println("배열의 길이:" + intArr.length);
		
		for (int i=0; i < intArr.length; i++) { // 다음과 같은 식으로 쓰는게 유지보수에 용이!!
			System.out.println(intArr[i]);
		}
		
		
		
		
	}

}
