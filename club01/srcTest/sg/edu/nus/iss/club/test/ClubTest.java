package sg.edu.nus.iss.club.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sg.edu.nus.iss.club.Club;
import sg.edu.nus.iss.club.Facility;
import sg.edu.nus.iss.club.Member;

/**
 * @author SMRT
 *
 */

public class ClubTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddMember(){
		Member boyuan = new Member("Lin", "Boyuan", null, 1);
		Club macClub = new Club();
		assertEquals(boyuan, macClub.addMember("Lin", "Boyuan", null));

		Member joshua = new Member("Furtado", "Joshua", "Mark", 2);
		assertEquals(joshua, macClub.addMember("Furtado", "Joshua", "Mark"));
	}

	@Test
	public void testGetMembers(){

		/* Add the members to the club */
		Club macClub = new Club();
		macClub.addMember("Lin", "Boyuan", null);
		macClub.addMember("Furtado", "Joshua", "Mark");
		macClub.addMember("Choomandal", "Sanjay", "Thomas");

		/* Test the members against the getMembers method.*/
		ArrayList<Member> arrTest = macClub.getMembers();

		/* Test 1: Check the number of members returened. */
		assertEquals(3, arrTest.size());

		/* Test 2: Check any of the members */
		for(Member newMember : arrTest){
			if(newMember.getMemberNumber() == 3){
				assertEquals(newMember.getFirstName(), "Sanjay");
			}
			break;
		}
	}

	@Test
	public void testGetMemberAtIndex(){

		/* Add the members to the club */
		Club macClub = new Club();
		macClub.addMember("Lin", "Boyuan", null);
		macClub.addMember("Furtado", "Joshua", "Mark");
		macClub.addMember("Choomandal", "Sanjay", "Thomas");

		/* Test 1: Check the number of members returned. */
		assertEquals("Joshua", macClub.getMember(1).getFirstName());
	}

	@Test
	public void testRemoveMemberWithMemberNumber(){
		/* Add the members to the club */
		Club macClub = new Club();
		macClub.addMember("Lin", "Boyuan", null);
		macClub.addMember("Furtado", "Joshua", "Mark");
		macClub.addMember("Choomandal", "Sanjay", "Thomas");

		assertEquals(macClub.getMembers().size(), 3);

		/* Remove the last member */
		macClub.removeMember(3);

		/* Test 1: The count should decrease */
		assertEquals(macClub.getMembers().size(), 2);

		/* Test 2: The last member should be updated */
		assertEquals(macClub.getMembers().get(1).getFirstName(), "Joshua");
	}

	@Test
	public void testGetFacility() {
		Facility swimming = new Facility("Swimming", "Pool for club members");
		/* Add the facilities to the club */
		Club macClub = new Club();
		macClub.addFacility(swimming);

		assertEquals(macClub.getFacility("Swimming"), swimming);
	}

	@Test
	public void testGetFacilities() {
		Facility swimming = new Facility("Swimming", "Pool for club members");
		Facility pingPong = new Facility("PingPong", "Table tennis");
		Facility gymnasium = new Facility("Gymnasium", "For fitness freaks");
		/* Add the facilities to the club */
		Club macClub = new Club();
		macClub.addFacility(swimming);
		macClub.addFacility(pingPong);
		macClub.addFacility(gymnasium);

		assertEquals(macClub.getFacilities().size(), 3);

		//Remove one of the facilities now
		macClub.removeFacility(swimming.getName());

		//Count Decreases
		assertEquals(macClub.getFacilities().size(), 2);

		//Object is successfully removed
		assertEquals(macClub.getFacility(swimming.getName()), null);
	}

	@Test
	public void testAddFacility() {
		Facility swimming = new Facility("Swimming", "Pool for club members");
		Facility pingPong = new Facility("PingPong", "Table tennis");
		Facility gymnasium = new Facility("Gymnasium", "For fitness freaks");
		/* Add the facilities to the club */
		Club macClub = new Club();
		macClub.addFacility(swimming);
		assertEquals(macClub.getFacilities().size(), 1);

		macClub.addFacility(pingPong);
		assertEquals(macClub.getFacilities().size(), 2);

		macClub.addFacility(gymnasium);
		assertEquals(macClub.getFacilities().size(), 3);
		
		//Check if we add null, then it should not be added.
		macClub.addFacility(null);
		assertEquals(macClub.getFacilities().size(), 3);
	}

	@Test
	public void testRemoveFacility() {
		Facility swimming = new Facility("Swimming", "Pool for club members");
		Facility pingPong = new Facility("PingPong", "Table tennis");
		Facility gymnasium = new Facility("Gymnasium", "For fitness freaks");
		/* Add the facilities to the club */
		Club macClub = new Club();
		macClub.addFacility(swimming);
		macClub.addFacility(pingPong);
		
		//Remove one of the facilities now (which is present)
		macClub.removeFacility(swimming.getName());
		assertEquals(macClub.getFacilities().size(), 1);
		
		//Add one more facility
		macClub.addFacility(gymnasium);
		assertEquals(macClub.getFacilities().size(), 2);

		//Remove one of the facilities now (which is NOT present)
		macClub.removeFacility(swimming.getName());
	}
}
