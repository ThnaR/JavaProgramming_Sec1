import java.util.*;
import java.io.*;
import java.text.*;
public class ATMBanking {
	public static void main(String[] args) throws IOException {
		String pattern = "#-###-###-##-#";
	    DecimalFormat numberFormat = new DecimalFormat(pattern);
		Scanner input = new Scanner(System.in);
		System.out.print("Enter account number\t: ");
		String accountNum = input.next(pattern);
		while(accountNum!=pattern) {
		System.out.print("Input wrong type, Enter account number\t: ");
		accountNum = input.next(pattern);
		}
		/*System.out.print("Enter account number\t: ");
	 	Scanner readFile = new Scanner(new File("D:\txtFile\\ATMBookBank.txt"));
		String accoutNum, pass;
		double money;
		while(readFile.hasNext()) {
			accoutNum = readFile.next();
			pass = readFile.next();
			money = readFile.nextDouble();
		}*/
		
	}

}
