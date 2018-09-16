public class CallingMethodConatenation {
	public static void main (String[] args) {
	sayHelloUser("Swetabh");
	sayCity("Roorkee, UK");
}	

	static void sayHelloUser(String name) {
	System.out.println("Howdy, " +name);
	//Try here without println
	//Try to make this right in one line
	}
	static void sayCity(String name1){
	System.out.println("How are you doing Nowadays in " +name1); 
	}
}