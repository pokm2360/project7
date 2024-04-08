package array;

public class quiz2 {

	public static void main(String[] args) {
//		10개 크기의 정수형 배열을 생성, 다음과 같이 초기화
//		{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }
		
//		첫번째 요소와 마지막 요소 출력, 단, 값이 바뀌었을 때도 첫번째와 마지막 요소 출력
		
		int[] intArr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		//배열의 마지막 인덱스는 index.length - 1 
		System.out.println(intArr[0] + "과 " + intArr[intArr.length -1]);
	}

}
