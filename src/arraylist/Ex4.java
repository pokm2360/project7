package arraylist;

import java.util.ArrayList;

public class Ex4 {

	public static void main(String[] args) {
		
		Student2 student1 = new Student2("둘리");
		
		student1.subjectList.add(new Subject("국어", 100));
		student1.subjectList.add(new Subject("수학", 90));
		
		student1.showInfo();
		
		Student2 student2 = new Student2("도우너");
		
		student2.subjectList.add(new Subject("국어", 70));
		student2.subjectList.add(new Subject("수학", 80));
		student2.subjectList.add(new Subject("과학", 75));
		student2.subjectList.add(new Subject("사회", 85));
		
		student2.showInfo();
		
		}
	}
	
class Subject {
	String name;
	int score;
	
	public Subject(String name, int score) {
		
		this.name = name;
		this.score = score;
	}
	
	
}

class Student2 {
	
	String studentName;
	ArrayList<Subject> subjectList;
	
	public Student2(String studentName) {
		super();
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
	}
	
	public void showInfo() {
		int total = 0;
		
		for (Subject s : subjectList) {
			total = total + s.score;
		}
		System.out.println(studentName + " 학생의 총점은 " + total + " 입니다. ");
	}
	
	
}
