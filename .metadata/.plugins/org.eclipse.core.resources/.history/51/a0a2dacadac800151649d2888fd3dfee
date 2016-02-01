package sg.edu.nus.iss.club.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sg.edu.nus.iss.club.Club;
import sg.edu.nus.iss.club.Member;

public class ClubTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddMember(){
		Member boyuan = new Member("Lin", "Boyuan", null, 1);
		Club macClub = new Club();
		assertEquals(boyuan, macClub.addMember("Lin", "Boyuan", null));
		
		Member joshua = new Member("Furtado", "Joshua", "Mark", 2);
		assertEquals(joshua, macClub.addMember("Furtado", "Joshua", "Mark"));
	}
}
