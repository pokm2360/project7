package arraylist;

import java.util.ArrayList;

public class quiz3 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();

		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("DD");
		list.add("EE");
		
//		for (int i = 0; i < 5; i++) {
//			System.out.print(list.get(i) + " ");
//		}
		
		System.out.println(list);
		
		list.remove(4);
		list.remove(3);
		list.remove(2);
		list.remove(1);
		list.remove(0);
		
		System.out.println("배열 요소의 개수: " + list.size());
	}

}
