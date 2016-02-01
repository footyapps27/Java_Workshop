package sg.edu.nus.iss.club;

public class Facility {

	/* Instance variables of the class declared below */
	private String name;
	private String description;
	
	/* Constructors */
	public Facility() {
		this(null, null);
	}
	
	public Facility(String name) {
		this(name, null);
	}
	
	public Facility(String name, String description) throws IllegalArgumentException {
		super();
		setName(name);
		setDescription(description);
	}
	/* Private methods */
	private void setName(String name) throws IllegalArgumentException {
		if (name == null) {
			throw new IllegalArgumentException("Name cannot be null.");
		}
		this.name = name;
	}
	
	private void setDescription(String description) throws IllegalArgumentException {
		if (description == null) {
			throw new IllegalArgumentException("Description cannot be null.");
		}
		this.description = description;
	}
	
	
	/* Public methods */
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String show() {
		String returnValue = name;
		if(description != null){
			returnValue = returnValue + " " + description;
		}
		return returnValue;
	}
}
