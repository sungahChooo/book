import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookManagerTest {

	private BookManager bm;

	@BeforeEach
	void setUp() throws Exception {
		bm = new BookManager();
	}

	@Test
	void testAddBook() {
		bm.addBook(1, "열혈 C프", "Yoon", 2014);
		bm.addBook(1, "가나다라", "마바사", 1234);
	}

	@Test
	void testSearchBook() {

		bm.addBook(2, "쉽게 풀어쓴 객체 지향 프로그래밍 ", "Amy", 2014);
		bm.addBook(3, "분산 컴퓨팅", "Yoon", 2024);

		bm.searchBook(1);
		bm.searchBook(2);
		bm.searchBook(3);
		bm.searchBook(4);
		bm.addBook(1, "열혈 C프", "Yoon", 2014);
		bm.addBook(2, "쉽게 풀어쓴 객체 지향 프로그래밍", "Amy", 2014);
	}

	@Test
	void testRemoveBook() {
		bm.removeBook(1);
		bm.removeBook(1);// 이미 삭제한 것 삭제 반복
		bm.searchBook(1);// 이미 삭제한 것 검색
	}

}
