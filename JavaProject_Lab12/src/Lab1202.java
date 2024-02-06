import java.util.Scanner;
import java.io.*;
public class Lab1202 {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.print("Input: ");
		String inputEmail = input.next();
		email(inputEmail);
		}
		/*while(readFile.hasNext()) {
			readFile.next();
			readFile.next(); 
			String password = readFile.next();
			String email = readFile.next();	
			System.out.print("Input: ");
			String inputEmail = input.next();
			if (inputEmail==email) System.out.println("Your password is "+password);
		}
		readFile.close();*/
		public static void email(String inputEmail) throws IOException{
			BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//MemberLogin.txt"));
			String tmp = "";
			while((tmp = readFile.readLine())!=null) {
				String[] data = tmp.split("\t");
				String password = data[2];
				String email = data[3];
				if(inputEmail==email) {
					System.out.println("Your password is "+password);
				}
				else System.out.println("The data not found...");
			}
			readFile.close();
	}
}
