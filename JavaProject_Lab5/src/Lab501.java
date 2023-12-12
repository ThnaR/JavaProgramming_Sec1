import java.util.*;
public class Lab501 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Full Name: ");
		String name = input.nextLine();
		String firstName,lastName;
		int space;
		space = name.indexOf(' ');
		if (space == -1) {
			System.out.print("Incorrect Name");
		}
		else {
		firstName = name.substring(0, space);
		lastName = name.substring(space+1);
		System.out.println("First Name: "+firstName.toUpperCase());
		System.out.println("Last Name: "+lastName.toLowerCase());
		}
		
	}

}
