package sg.edu.nus.iss.club;

/**
 * @author SMRT
 * @description: Class containing the main method.
 */
public class ClubApplication {

	public static void main(String[] args) {

	}

	public static void testPersonClass() {
		/* All fields present. */
		Person wayneRooney = new Person("Rooney", "Wayne", "Mark");
		System.out.println(wayneRooney.getFirstName());
		System.out.println(wayneRooney.getSecondName());
		System.out.println(wayneRooney.getSurName());
		System.out.println(wayneRooney.show());
		
		/* Last Name missing */
		Person ryanGiggs = new Person("Giggs", "Ryan", null); 
		System.out.println(ryanGiggs.getFirstName());
		System.out.println(ryanGiggs.getSecondName());
		System.out.println(ryanGiggs.getSurName());
		System.out.println(ryanGiggs.show());
	}
	
	public static void testFacilityClass() {
		Facility swimmingFacility = new Facility("Swimming", "Members can use the swimming pool of the club.");
		System.out.println(swimmingFacility.show());
		
		Facility footballFacility = new Facility("Football", null);
		System.out.println(footballFacility.show());
	}
	
	public static void testMemberClass() {
		/* All fields present. */
		Member wayneRooney = new Member("Rooney", "Wayne", "Mark", 31);
		System.out.println(wayneRooney.getFirstName());
		System.out.println(wayneRooney.getSecondName());
		System.out.println(wayneRooney.getSurName());
		System.out.println(wayneRooney.show());
	}
}
