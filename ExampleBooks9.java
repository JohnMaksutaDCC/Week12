
public class ExampleBooks9 {

	public static void main(String[] args) {
		Book b1 = new Book("Thinking in Java", "Bruce Eckel", 1129);
		System.out.println(b1.description());
		System.out.println(Book.description());
	}

}
