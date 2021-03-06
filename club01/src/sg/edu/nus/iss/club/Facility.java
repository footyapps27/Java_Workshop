package sg.edu.nus.iss.club;

/**
 * @author SMRT
 * @description: Class depicting a particular Facility.
 */
public class Facility {

	/* Instance variables of the class declared below */
	private String name;
	private String description;
	
	/* Constructors */
	public Facility() {
		this(null, null);
	}
	
	/**
	 * @param name
	 * @throws IllegalArgumentException
	 */
	public Facility(String name) throws IllegalArgumentException {
		this(name, null);
	}
	
	/**
	 * @param name
	 * @param description
	 * @throws IllegalArgumentException
	 */
	public Facility(String name, String description) throws IllegalArgumentException {
		super();
		setName(name);
		setDescription(description);
	}

	/**
	 * @param name
	 * @throws IllegalArgumentException
	 */
	private void setName(String name) throws IllegalArgumentException {
		if (name == null) {
			throw new IllegalArgumentException("Name cannot be null.");
		}
		this.name = name;
	}
	
	/**
	 * Setter for the description attribute.
	 * @param description The description about the facility.
	 */
	private void setDescription(String description){
		this.description = description;
	}
	
	
	/* Public methods */
	
	/*
	 * Getter for the name of the facility.
	 */
	public String getName() {
		return name;
	}
	
	/*
	 * The description about the facility.
	 */
	public String getDescription() {
		return description;
	}
	
	/*
	 * Method to display the name of the method & its description if present.
	 */
	public String show() {
		return toString();
	}
	
	@Override 
	public String toString() {
		if(description != null){
			return "Facility Name: " + name + "\nDescription: " + description;
		}
		return "Facility Name: " + name;
	}
}
