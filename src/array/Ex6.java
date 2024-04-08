package array;

public class Ex6 {

	public static void main(String[] args) {
		
//		5개 크기의 객체 배열 생성
		Book[] library = new Book[5];
		
		for (int i = 0; i < library.length; i++) {
			System.out.print(library[i] + " ");
		}

		System.out.println();
		
//		library[0].showInfo();
		
//		각 요소에 인스턴스를 생성하고 저장
		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("데미안", "헤르만 헤세");
		library[2] = new Book("어떻게 살 것인가", "유시민");
		library[3] = new Book("토지", "박경리");
		library[4] = new Book("어린왕자", "생택쥐페리");
		
//		각 요소의 주소 출력
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i] + " ");
		}
		
//		각 요소의 정보 출력
		for (int i = 0; i < library.length; i++) {
			
			library[i].showInfo();
		}
	}
}

//도서 클래스
class Book {
	String bookName;
	String author;
	
// 제목과 저자를 초기화하는 생성자를 만드세요!
	public Book(String bookName, String author) {
		super();
		this.bookName = bookName;
		this.author = author;
	}

	public void showInfo() {
		System.out.println("책이름 : " + bookName + " 저자 : " + author);
	}

}