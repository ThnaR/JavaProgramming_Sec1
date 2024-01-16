import java.util.*;
public class AuthorDemo2 {

	public static void main(String[] args) {
		String name,email;
		Scanner scan = new Scanner(System.in);
		String[] author = new String[4]; 
		for(int i =1;i<author.length;i++) {
		System.out.println("Information Author "+ i);
		System.out.print("Input author name   : ");
		name = scan.nextLine();
		System.out.print("Input author e-mail : ");
		email = scan.nextLine();
		}

	}

}
