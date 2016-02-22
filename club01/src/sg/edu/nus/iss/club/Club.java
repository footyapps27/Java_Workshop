/**
 * 
 */
package sg.edu.nus.iss.club;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @author SMRT
 * @description: Class representing Club object in real world.
 */

public class Club {

	/********************************************************/
	//Instance Variables
	/********************************************************/
	
	/*
	 * ArrayList for holding the list of Members in the club.
	 */
	private ArrayList<Member> arrMember;
	
	private HashMap<String, Facility> dictFacilities;

	/********************************************************/
	//Constructors
	/********************************************************/
	public Club(){
		//Initialize the array list & hashmap.
		arrMember = new ArrayList<>();
		dictFacilities = new HashMap<>();
	}
	/********************************************************/
	//Public Methods
	/********************************************************/
	
	/*
	 * Method to add members to the club.
	 * @param: The surname of the member to be added.
	 * @param: The first name of the member to be added.
	 * @param: The second name of the member to be added.
	 * @return: The new member that was added to the club.
	 */
	public Member addMember(String surName, String firstName, String secondName) {
		//Membership starts with '1'.
		Member newMember = new Member(surName, firstName, secondName, arrMember.size() + 1);
		arrMember.add(newMember);
		return newMember;
	}
	
	/*
	 * Method to get the members associated with the club.
	 * @return: The list of members associated with the club.
	 */
	public ArrayList<Member> getMembers(){
		return arrMember;
	}
	
	/*
	 * Method to print the list of club members in the console.
	 */
	public void showMembers() {
		for(Member member : arrMember){
			System.out.println(member.toString());
		}
	}
	
	/*
	 * Method to get a particular member from a index.
	 * @param: Index for which we need to get the index.
	 * @Exception: If the index is not present in the array.
	 * @return: The member that was found at the index.
	 */
	public Member getMember(int index) throws ArrayIndexOutOfBoundsException{
		if(index > (arrMember.size() - 1)){
			throw new ArrayIndexOutOfBoundsException();
		}else {
			return arrMember.get(index);
		}
	}
	
	/*
	 * Method to remove a particular member based on the membership number.
	 * @param: Membership number that needs to be removed from the list of members of the club.
	 */
	public void removeMember(int membershipNumber) {
		Iterator<Member> iterator = arrMember.iterator();
		while (iterator.hasNext()) {
			Member actualMember = iterator.next();
			/* Check the membership number & then remove it from the list. */
		  if (actualMember.getMemberNumber() == membershipNumber) {
		    iterator.remove();
		  }
		}
	}
	
	/**
	 * Method to get a particular Facility object available in the Club.
	 * @param name The name of the facility that we are querying for.
	 * @return The details of the Facility, if found.
	 * 			Will return 'null' if the facility is not available.
	 */
	public Facility getFacility(String name) {
		if(dictFacilities.containsKey(name)){
			return dictFacilities.get(name);
		}
		return null;
	}
	
	/**
	 * Method to get the complete list of facilities available at the club.
	 * @return An Array List containing objects of the facilities present at the club.
	 */
	public ArrayList<Facility> getFacilities() {
		return new ArrayList<Facility>(dictFacilities.values()) ;
	}

	/**
	 * Method to add a new facility to the club.
	 * @param facility The facility that needs to be added to the club.
	 */
	public void addFacility(Facility facility) {//TODO-Create the Facility object inside this class itself.
		if(facility != null){
			dictFacilities.put(facility.getName(), facility);
		}
	}
	
	/**
	 * Method to remove a particular facility by its name.
	 * @param name The name of the facility that needs to be removed.
	 */
	public void removeFacility(String name) {
		if(dictFacilities.containsKey(name)){
			dictFacilities.remove(name);
		}
	}
	
	/**
	 * Display the list of facilities available at the club. Displays in the console.
	 */
	public void showFacilities() {
		for(Facility facility : this.getFacilities()){
			System.out.println(facility.getName());
		}
	}
}
