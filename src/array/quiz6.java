package array;

public class quiz6 {

	public static void main(String[] args) {
//		5개 크기의 정수형 배열 생성, 다음과 같이 초기화 
//		{5, 20, 100, 30, 77}
		
		int[] arr = {5, 20, 100, 30, 77};
		
//		20이 저장되어 있는 요소의 인덱스를 찾아서 출력
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] == 20) {
				System.out.println("20을 가지는 요소의 인덱스는 " + i + " 입니다.");
				break;
			}
		}
		
	}

}
