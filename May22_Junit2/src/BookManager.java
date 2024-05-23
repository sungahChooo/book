import java.util.ArrayList;

public class BookManager {

	private Book b;
	private ArrayList<Book> bookList;

	public BookManager() {
		bookList = new ArrayList<>();
	}

	public void addBook(int id, String title, String author, int year) {
		// 이미 책이 존재하는 경우
		for (Book book : bookList) {
			 if (book.getId() == id) {
				System.out.println("해당 ID(" + id + ")" + " 는 이미 존재합니다");
				return;
			}
		}
		Book b = new Book(id, title, author, year);
		bookList.add(b);
		System.out.println(b.toString() + "도서가 추가되었습니다.");
	}

	public void searchBook(int id) {

		for (Book book : bookList) {
			if (book.getId() == id) {
				System.out.println("검색 결과:\n" + book.toString());
				return;
			}
		}
		System.out.println("검색된 도서가 없습니다.");
	}

	public void removeBook(int id) {
		
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getId() == id) {
				Book removedBook = bookList.remove(i);
				System.out.println(removedBook.toString() + "도서를 삭제하였습니다.");
				return;
			}
		}
		
		System.out.println("해당 ID(" + id + ")" + "의 도서를 찾을 수 없습니다.");
	}
}
