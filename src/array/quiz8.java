package array;

import java.util.Arrays;

public class quiz8 {

	public static void main(String[] args) {
//		학생(student)를 정의하는 클래스
//		속성: 학번, 이름
//		학생과 이름을 초기화하는 생성자
//		학생의 정보를 출력하는 메소드
		
//		3개 크기의 student형 배열 생성, 3명의 학생정보 저장. 배열에 저장된 모든 학생의 정보 출력
		
		Student[] student = new Student[3];
		
		student[0] = new Student(1001, "둘리");
		student[1] = new Student(1002, "또치");
		student[2] = new Student(1003, "도우너");
		
		for (int i=0; i<=2; i++ ) {
			student[i].showInfo();
		}
	}

}
class Student {
	int studentNo;
	String Name;
	
	public Student(int studentNo, String name) {
		this.studentNo = studentNo;
		this.Name = name;
	}
	
	public void showInfo() {
		System.out.println("학번: " + studentNo + " 이름: " + Name);
	}
	
}