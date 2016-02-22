package sg.edu.nus.iss.club.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.time.LocalDateTime;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sg.edu.nus.iss.club.BadBookingException;
import sg.edu.nus.iss.club.Booking;
import sg.edu.nus.iss.club.Facility;
import sg.edu.nus.iss.club.Member;

public class BookingTest {

	/********************************************************/
	// Initial Setup & TearDown
	/********************************************************/
	Member boyuan;
	Member sanjay;
	Facility swimming;
	Facility tennis;
	LocalDateTime now;

	@Before
	public void setUp() throws Exception {
		boyuan = new Member("Lin", "Boyuan", null, 0);
		sanjay = new Member("Choo", "Sanjay", null, 1);
		swimming = new Facility("Swimming");
		tennis = new Facility("Tennis");
		now = LocalDateTime.now();
	}

	@After
	public void tearDown() throws Exception {
		boyuan = null;
		sanjay = null;
		swimming = null;
		tennis = null;
		now = null;
	}

	/********************************************************/
	// Test for Overlaps
	/********************************************************/
	@Test
	public void testOverlapsForNoOverlapping() {
		Booking bookingForBoyuan = null;
		Booking bookingForSanjay = null;
		try {
			bookingForBoyuan = new Booking(boyuan, swimming, now, now.plusHours(1));
			bookingForSanjay = new Booking(sanjay, swimming, now.plusHours(2), now.plusHours(3));
			assertEquals(false, bookingForSanjay.overlaps(bookingForBoyuan));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testOverlapsForSameTimeButDifferentFacility() {
		Booking bookingForBoyuan = null;
		Booking bookingForSanjay = null;
		try {
			bookingForBoyuan = new Booking(boyuan, swimming, now, now.plusHours(1));
			bookingForSanjay = new Booking(sanjay, tennis, now, now.plusHours(1));
			assertEquals(false, bookingForSanjay.overlaps(bookingForBoyuan));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testOverlapsForSameStartDate() {
		Booking bookingForBoyuan = null;
		Booking bookingForSanjay = null;
		try {
			bookingForBoyuan = new Booking(boyuan, swimming, now, now.plusHours(1));
			bookingForSanjay = new Booking(sanjay, swimming, now, now.plusHours(2));
			assertEquals(true, bookingForSanjay.overlaps(bookingForBoyuan));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testOverlapsForStartDateInBetweenTwoDates() {
		Booking bookingForBoyuan = null;
		Booking bookingForSanjay = null;
		try {
			bookingForBoyuan = new Booking(boyuan, swimming, now, now.plusHours(3));
			bookingForSanjay = new Booking(sanjay, swimming, now.plusHours(1), now.plusHours(2));
			assertEquals(true, bookingForSanjay.overlaps(bookingForBoyuan));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testOverlapsForStartDateEqualToEndDate() {
		Booking bookingForBoyuan = null;
		Booking bookingForSanjay = null;
		try {
			bookingForBoyuan = new Booking(boyuan, swimming, now, now.plusHours(3));
			bookingForSanjay = new Booking(sanjay, swimming, now.plusHours(3), now.plusHours(4));
			assertEquals(false, bookingForSanjay.overlaps(bookingForBoyuan));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testOverlapsForEndDateEqualToStartDate() {
		Booking bookingForBoyuan = null;
		Booking bookingForSanjay = null;
		try {
			bookingForBoyuan = new Booking(boyuan, swimming, now, now.plusHours(3));
			bookingForSanjay = new Booking(sanjay, swimming, now.minusHours(3), now);
			assertEquals(false, bookingForSanjay.overlaps(bookingForBoyuan));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testOverlapsForBookingCompletelyInBetweenAnotherBooking() {
		Booking bookingForBoyuan = null;
		Booking bookingForSanjay = null;
		try {
			bookingForBoyuan = new Booking(boyuan, swimming, now, now.plusHours(3));
			bookingForSanjay = new Booking(sanjay, swimming, now.minusHours(1), now.plusHours(6));
			assertTrue(bookingForSanjay.overlaps(bookingForBoyuan));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/********************************************************/
	// Tests for Constructor
	/********************************************************/
	@Test
	public void testConstructorForEmptyMember() {
		Booking booking = null;
		try {
			booking = new Booking(null, swimming, now, now.plusDays(1));
			booking.getClass();
			fail("Exception not thrown for null Member Name");
		} catch (BadBookingException e) {
			assertNotNull(e);
		}
	}

	@Test
	public void testConstructorForEmptyFacility() {
		Booking booking = null;
		try {
			booking = new Booking(boyuan, null, now, now.plusDays(1));
			booking.getClass();
			fail("Exception not thrown for null Facility Name");
		} catch (BadBookingException e) {
			assertNotNull(e);
		}
	}

	@Test
	public void testConstructorForEmptyStartDate() {
		Booking booking = null;
		try {
			booking = new Booking(boyuan, swimming, null, now);
			booking.getClass();
			fail("Exception not thrown for null Start Date");
		} catch (BadBookingException e) {
			assertNotNull(e);
		}
	}

	@Test
	public void testConstructorForEmptyEndDate() {
		Booking booking = null;
		try {
			booking = new Booking(boyuan, swimming, now, null);
			booking.getClass();
			fail("Exception not thrown for null End Date");
		} catch (BadBookingException e) {
			assertNotNull(e);
		}
	}

	@Test
	public void testConstructorForEndDateBeforeStartDate() {
		Booking booking = null;
		try {
			booking = new Booking(boyuan, swimming, now, now.minusDays(1));
			booking.getClass();
			fail("Exception not thrown for start date later than end date.");
		} catch (BadBookingException e) {
			assertNotNull(e);
		}
	}

	/********************************************************/
	// Tests for ToString
	/********************************************************/
	@Test
	public void testToString() {
	}// TODO - Is this required
}
