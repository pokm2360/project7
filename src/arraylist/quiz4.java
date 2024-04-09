package arraylist;

import java.util.ArrayList;

public class quiz4 {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student(1001, "둘리"));
		list.add(new Student(1002, "또치"));
		list.add(new Student(1003, "도우너"));
		
		Student student1 = list.get(0);
		student1.showInfo();
		Student student2 = list.get(1);
		student2.showInfo();
		Student student3 = list.get(2);
		student3.showInfo();
		
		for (int i = 0; i < 3; i++) {
			Student student = list.get(i);
			student.showInfo();	
			}
	}

}

class Student {
	int studentID;
	String name;
	
	public Student(int studentID, String name) {
		
		this.studentID = studentID;
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("학번: " + studentID + " 이름: " + name);
	}
	
	
}