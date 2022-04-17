
public class Pair<S1, T> {
	private S1 first;
	private T second;

	public Pair(S1 firstItem, T secondItem) {
		first = firstItem;
		second = secondItem;
	}

	@Override
	public String toString() {
		return "(" + first + "," + second + ")";
	}

}
