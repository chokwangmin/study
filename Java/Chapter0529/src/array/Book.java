package array;

public class Book {
	private String title;
	private String author;
	
	//기본 생성자
	public Book() {}
		//생성자 오브로드
		public Book(String title, String author) {
			this.title = title;
			this.title = title;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}
		
		public void showBookInfo() {
			System.out.println(title + ", " + author);
		}
	}
