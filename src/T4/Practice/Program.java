package T4.Practice;

public class Program {

	public static void main(String[] args) {
		AdultStudent ad1 = new AdultStudent("Avi Cohen", "Hashoshan 10 Petah Tikva", 1982);
		AdultStudent ad2 = new AdultStudent("Eli Levi", "Herzel 21 Petah Tikva", 1981);
		
		FlowerStudent fs1 = new FlowerStudent("Shalom Lavi", "Hakozer 56 Tel Aviv", 9, "Hazamir");
		FlowerStudent fs2 = new FlowerStudent("Moshe Birnshtain", "Pinkas 18 Tel Aviv", 10, "Habrosh");

		Course course = new Course("Windows programming", "Nathan Haviv", 10);
		course.register(ad1);
		course.register(ad2);
		course.register(fs1);
		course.register(fs2);
		
		System.out.println(course.toString());
		if(course.isRegistered(ad1))
			System.out.println(ad1 + " is Registered");
			else
				System.out.println(ad1 + " is NOT Registered");
				
		System.out.println("No of registered adult students: " + course.countAdultStudents());
	}

}
