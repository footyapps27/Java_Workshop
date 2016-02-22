package sg.edu.nus.iss.club;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class BookingRegister {// TODO - Documentation

	/********************************************************/
	// Instance Variables
	/********************************************************/
	private HashMap<Facility, ArrayList<Booking>> dictBookingsForFacility;

	/********************************************************/
	// Getters & Setters
	/********************************************************/
	public HashMap<Facility, ArrayList<Booking>> getDictBookingsForFacility() {
		return dictBookingsForFacility;
	}

	public void setDictBookingsForFacility(HashMap<Facility, ArrayList<Booking>> dictBookingsForFacility) {
		this.dictBookingsForFacility = dictBookingsForFacility;
	}

	/********************************************************/
	// Constructors
	/********************************************************/
	public BookingRegister(HashMap<Facility, ArrayList<Booking>> dictBookingsForFacility) {
		this.dictBookingsForFacility = dictBookingsForFacility;
	}

	/********************************************************/
	// Public Methods
	/********************************************************/
	public void addBooking(Member member, Facility facility, LocalDateTime startDate, LocalDateTime endDate)
			throws BadBookingException {

		Booking newBooking = new Booking(member, facility, startDate, endDate);
		if ((dictBookingsForFacility.containsKey(facility)) && (dictBookingsForFacility.get(facility)) != null) {
			
		}
	}

	public ArrayList<Booking> getBookings(Facility facility, LocalDateTime startDate, LocalDateTime endDate) {
		return null;
	}

	public void removeBooking(Booking booking) {

	}

}
