//This program will call Methods in different ways
//Date - 16 Sep 2018
//Author - @swetabhsuman8
//CallingMethodConatenation

public class CallingMethodConatenation {
	public static void main (String[] args) {
	//This is method
	sayHelloUser("Swetabh");
	sayCity("Roorkee, UK");
	
	int DOB = returnDOB ();
	System.out.print(". Come soon, we will celebrate your birthday on March - " +DOB);
}
	//This method returns an int type with the DOB (Date of Birth)
	static int returnDOB() {
		return 13;
	}
	//This method will say Hello User or whatver name is passed when called
	static void sayHelloUser(String name) {
	System.out.println("Howdy, " +name);
	
	}
	//This Method will say city name of the user.
	static void sayCity(String city){
	System.out.print("How are you doing Nowadays in " +city); //here I added different String - city
	}
}
