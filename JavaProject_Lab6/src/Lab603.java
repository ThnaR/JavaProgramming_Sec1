import java.util.*;
public class Lab603 {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Please enter your name, seperate by space.\n:");
		String fullName = input.nextLine();
		System.out.println(abbreviatName(fullName));
	}//end of main()
	public static String abbreviatName(String fullname) {
		String firstName = fullname.substring(0, fullname.indexOf(' '));
		String middleName = fullname.substring(fullname.indexOf(' ') + 1, fullname.indexOf(' ')+2);
		String lastName = fullname.substring(fullname.lastIndexOf(' ')+1,fullname.lastIndexOf(' ')+2);
		return middleName + "." + lastName + "." + firstName;
	}//end of abbreviatName()

}
