
public class Book {

	private int id;
	private String title;
	private String author;
	private int outYear;

	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(int id, String title, String author, int outYear) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.outYear = outYear;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}public void setAuthor(String author) {
		this.author = author;
	}
	public int getOutYear() {
		return outYear;
	}
	public void setOutYear(int outYear) {
		this.outYear = outYear;
	}
	@Override
    public String toString() {
        return "Book{" +
                "id: " +'\''+ id+'\'' +
                ", 제목: '" + title + '\'' +
                ", 저자: '" + author + '\'' +
                ", 출판년도:" + outYear +
                '}';
    }
}
