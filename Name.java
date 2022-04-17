
public class Name {

	private String first;
	private String last;

	public Name() {

	}

	public Name(String firstName, String lastName) {
		this.first = firstName;
		this.last = lastName;
	}

	public void setName(String firstname, String lastName) {
		setFirst(firstname);
		setLast(lastName);
	}

	public String getName() {
		return toString();
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}
	
	

}
