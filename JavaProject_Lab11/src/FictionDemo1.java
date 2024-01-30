import java.util.*;
public class FictionDemo1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input book title : ");
		String title = scan.nextLine();
		System.out.print("Input publish year : ");
		int year = scan.nextInt();
		FictionBook book = new FictionBook(title,year);
		System.out.print("Input name : ");
		String name = scan.next();
		
		System.out.print("Input email : ");
		String email = scan.next();
		book.setAuthorName(name);
		book.setEmail(email);
		while(!book.checkFormatName()||book.checkEmail()) {
			System.out.print("Input name : ");
			name = scan.nextLine();
			System.out.print("Input email : ");
			email = scan.nextLine();
			book.setAuthorName(name);
			book.setEmail(email);
		}
		System.out.println(book);

	}

}
