package object;

/*
 object Ŭ����
 ���Ŭ������ �ֻ��� Ŭ����
 java.lang.object Ŭ����
 ��� Ŭ������ object Ŭ�������� ��ӹ���
 ��� Ŭ������ object Ŭ������ �޼��带 ����� �� ����
 ��� Ŭ������ object .Ŭ������ �Ϻθ޼��带  �������Ͽ� ����� �� �ִ�.
 
 
  
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
				Book book = new Book("����", "�ڰ渮");
				System.out.println(book);
				
				String str = new String("����");
				System.out.println(str);
				Book book2 = new (Book)book.clone();
				
			}
		}

	


