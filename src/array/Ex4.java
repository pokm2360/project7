package array;
/*
 * 람다식 for문
 * */
public class Ex4 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		//배열에서 꺼낸 값을 저장할 변수 : 배열
		for (int value : arr) {
			System.out.println(value + " ");
		}
		
//		기존 for문
		for (int i=0; i < 10; i++) {
			System.out.println(arr[i] + " ");
		}
	}

}
