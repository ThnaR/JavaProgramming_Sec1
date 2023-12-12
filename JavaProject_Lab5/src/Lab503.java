import java.util.*;
public class Lab503 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Message : ");
		String mes = input.nextLine();
		String mess;
		mess = mes.toLowerCase();
		if (mess.indexOf("nichi")>=0) {
			System.out.print("Nichi is a sentence");	
		}
		else {
			System.out.print(mes);
			
		}
	}

}
