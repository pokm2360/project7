package arraylist;

import java.util.ArrayList;

public class quiz2 {

	public static void main(String[] args) {
		
		ArrayList<Boolean> list = new ArrayList<Boolean>();

		list.add(true);
		list.add(true);
		list.add(false);
		
		for (int i=0; i < list.size(); i++) {
			Boolean str=list.get(i);
			System.out.println(str + " ");
		}
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
		
	}

}
