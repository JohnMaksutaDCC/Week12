
public class PairExample {

	public static void main(String[] args) {
		Name joe = new Name("Joe", "Java");
		String joePhone = "(401) 555-1234";
		Pair<Name, String> joeEntry = new Pair<>(joe, joePhone);
		System.out.println(joeEntry);

	}

}
