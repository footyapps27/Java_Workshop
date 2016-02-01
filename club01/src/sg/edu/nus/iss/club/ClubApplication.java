package sg.edu.nus.iss.club;

public class ClubApplication {

	public static void main(String[] args) {

		/* Test for Person class */
		ClubApplication.testPersonClass();
		
		/* Test for Facility class */
		ClubApplication.testFacilityClass();
	}

	public static void testPersonClass() {
		/* All fields present. */
		Person wayneRooney = new Person("Rooney", "Wayne", "Mark");
		System.out.println(wayneRooney.getFirstName());
		System.out.println(wayneRooney.getLastName());
		System.out.println(wayneRooney.getSurname());
		System.out.println(wayneRooney.show());
		
		/* Last Name missing */
		Person ryanGiggs = new Person("Giggs", "Ryan", null); 
		System.out.println(ryanGiggs.getFirstName());
		System.out.println(ryanGiggs.getLastName());
		System.out.println(ryanGiggs.getSurname());
		System.out.println(ryanGiggs.show());
	}
	
	public static void testFacilityClass() {
		Facility swimmingFacility = new Facility("Swimming", "Members can use the swimming pool of the club.");
		System.out.println(swimmingFacility.show());
		
		Facility footballFacility = new Facility("Football", null);
		System.out.println(footballFacility.show());
	}
}