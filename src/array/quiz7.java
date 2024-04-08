package array;

import java.util.Arrays;

public class quiz7 {

	public static void main(String[] args) {
//		system.arraycopy 메소드를 사용해 배열 복사
		
		char[] arr = {'a', 'b', 'c', 'd', 'e'};
		
		char[] newArr = new char[2];
	
		System.arraycopy(arr, 3, newArr, 0, 2);
		
		System.out.println("새로운 배열: " + Arrays.toString(newArr));
	}

}
