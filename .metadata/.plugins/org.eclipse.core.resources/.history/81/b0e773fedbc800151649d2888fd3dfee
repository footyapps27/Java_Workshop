package sg.edu.nus.iss.club.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sg.edu.nus.iss.club.Member;

public class MemberTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNullSecondName(){
		Member boyuan = new Member("Lin", "Boyuan", null, 1);
		assertEquals("Member First Name failed", "Boyuan", boyuan.getFirstName());
		assertEquals("Member Surname Name failed", "Lin", boyuan.getSurName());
		assertEquals("Member Second Name failed", null, boyuan.getSecondName());
		
		
	}
	
	@Test
	public void testMemberName(){
		Member joshua = new Member("Furtado", "Joshua", "Mark", 2);
		assertEquals("Member First Name failed", "Joshua", joshua.getFirstName());
		assertEquals("Member Surname Name failed", "Furtado", joshua.getSurName());
		assertEquals("Member Second Name failed", "Mark", joshua.getSecondName());
	}
	
	@Test
	public void testMemberNumber(){
		Member joshua = new Member("Joshua", "Furtado", "Mark", 2);
		assertEquals("Member First Name failed", 2, joshua.getMemberNumber());
	}
}
