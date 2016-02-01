package sg.edu.nus.iss.club;

public class Person {

	/* Instance variables of the class declared below */
	private String surname;
	private String firstName;
	private String lastName;
	
	/* Constructors */
	public Person() {
		this(null, null, null);
	}
	
	public Person(String surname, String firstName, String lastName) {
		super();
		setFirstName(firstName);
		setSurName(surname);
		setLastName(lastName);
	}
	
	/* Private methods */
	private void setLastName(String lastName) {
		if (lastName == null) {
			lastName = "";
		}
		this.lastName = lastName;
	}
	
	private void setFirstName(String firstName) {
		if (firstName == null) {
			firstName = "";
		}
		this.firstName = firstName;
	}
	
	private void setSurName(String surname) {
		if (surname == null) {
			surname = "";
		}
		this.surname = surname;
	}
	
	/* Public methods */
	public String getSurname() {
		return surname;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String show() {
		return firstName + " " + lastName + " " + surname;
	}
}
