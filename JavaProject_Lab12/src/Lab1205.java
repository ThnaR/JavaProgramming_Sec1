import java.util.Scanner;
import java.io.*;
public class Lab1205 {
	public static void main(String[] args) throws IOException{
		Head();
		Scanner readFile = new Scanner(new File("d://txtFile//student.txt"));
		int i = 1;
		while(readFile.hasNext()) {
			String id = readFile.next();
			readFile.next();
			String fname = readFile.next();
			String lname = readFile.next();
			double grade = readFile.nextDouble();
			readFile.next();
			System.out.println(i+".\t"+id+"\t"+Level(id)+"\t"+fname.charAt(0)+"."
					+lname+"\t"+grade+"\t"+Status(grade));
			i++;
		}
		readFile.close();
	}
	public static String Level(String id) {
		if (id.startsWith("19")) return "3th";
		else return "4th";
	}
	public static String Status(double grade) {
		if (grade>2.00) return "Pass";
		else if (grade>=1.00&&grade<=2.00)return "Critical";
		else return "Retired";
	}
	public static void Head() {
		System.out.println("No.\tID\t\tLevel\tName\t\tGrade\tStatus");
		System.out.println("**************************************************************");

	}

}
