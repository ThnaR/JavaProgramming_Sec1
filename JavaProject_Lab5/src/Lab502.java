import java.util.*;
public class Lab502 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String sentence = input.nextLine();
		while(!sentence.endsWith(".")) {
			System.out.print("The sentence must end with full stop point : ");
			sentence = input.nextLine();
			}
		System.out.println();
		int sen = 0;
		for (int i = 0;i<sentence.length();i++) {
			if (sentence.charAt(i)==' '||i == sentence.length()-1) {
				System.out.println(sentence.substring(sen,i+1).trim());
				
				sen=i+1;	
			}	
		}
	}

}
