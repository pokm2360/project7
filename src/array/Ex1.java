package array;

public class Ex1 {

	public static void main(String[] args) {
		
//		숫자 3개를 저장하기 위해 배열 생성
		int[] arr = new int[3];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
//		arr[3] = 40; // 에러
		int value = arr[1];
		System.out.println(value);
	}

}
