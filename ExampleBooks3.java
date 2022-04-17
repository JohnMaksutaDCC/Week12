
public class ExampleBooks3 {

	public static void main(String[] args) {
		Book b1, b2;
		b1 = new Book("Thinking in Java", "Bruce Eckel", 1129);
		System.out.println(b1.title + " : " + b1.author + " : "
				+ b1.numberOfPages + " : " + b1.ISBN);
		b2 = new Book("Thinking in Java", "Bruce Eckel", 1129, "0-13-027363-5");
		System.out.println(b2.title + " : " + b2.author + " : "
				+ b2.numberOfPages + " : " + b2.ISBN);
	}

}
