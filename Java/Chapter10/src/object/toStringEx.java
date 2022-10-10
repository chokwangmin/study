package object;

/*
 object 클래스
 모든클래스의 최상위 클래스
 java.lang.object 클래스
 모든 클래스는 object 클래스에서 상속받음
 모든 클래스는 object 클래스의 메서드를 사용할 수 있음
 모든 클래스는 object .클래스의 일부메서드를  재정의하여 사용할 수 있다.
 
 
  
 */
		class Book extends Object{
			String title;
			String author;
			
			public book(String title, String author) {
				this.title = title;
				this.author = author;
			}

			@Override
			public String toString() {
				return title + "," + author;
			}

			@Override
			protected Object clone() throws CloneNotSupportedException {
				// TODO Auto-generated method stub
				return super.clone();
			}
			
			
			
		}
		
public class toStringEx{
			public static void main(String[] args) throws CloneNotSupportedException {
				Book book = new Book("토지", "박경리");
				System.out.println(book);
				
				String str = new String("토지");
				System.out.println(str);
				Book book2 = new (Book)book.clone();
				
			}
		}

	


