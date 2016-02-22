/**
 * 
 */
package sg.edu.nus.iss.club;

/**
 * @author SMRT
 * @description Class holds the member information
 */
public class Member extends Person {

	/********************************************************/
	//Instance Variables
	/********************************************************/
	private int memberNumber;
	
	/********************************************************/
	//Constructors
	/********************************************************/
	public Member(String surName, String firstName, String secondName, int memberNumber){
		super(surName,firstName,secondName);
		setMemberNumber(memberNumber);
	}
	
	/********************************************************/
	//Private Methods
	/********************************************************/
	private void setMemberNumber(int memberNumber){
		this.memberNumber = memberNumber;
	}
	
	/********************************************************/
	//Public Methods
	/********************************************************/
	
	/*
	 * Getter for the surName attribute.
	 */
	public int getMemberNumber() {
		return memberNumber;
	}
	
	/*
	 * Method to get values of the attributes(non-Javadoc)
	 * @see sg.edu.nus.iss.club.Person#toString()
	 */
	@Override 
	public String toString() { 
		return super.toString() + "\nMember Number: " + memberNumber;
	}
}
