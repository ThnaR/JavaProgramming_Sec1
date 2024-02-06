import java.io.*;
import java.util.Scanner;
public class Example1202 {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		System.out.print("Input Section: ");
		int section = input.nextInt(); //input data from keyboard
		Header(section);
		showListStudent(section);
		
	}
	public static void showListStudent(int sectionInput) throws IOException{
		//Read data from file using BufferedReader class
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//List107.txt"));
		String tmp = "";
		while((tmp = readFile.readLine())!=null) {
			String[] data = tmp.split("\t");
			//read midterm and final score from file to display
			double midtermScore = Double.parseDouble(data[4]);
			double finalScore = Double.parseDouble(data[5]);
			int sectionFile = Integer.parseInt(data[3]);
			if(sectionFile==sectionInput) {
				System.out.println(data[0]+"\t"+data[2]+"\t"+midtermScore
						+"\t"+finalScore+"\t"+findResult(midtermScore,finalScore));
			}
		}
		readFile.close();
	}
	public static String findResult(double midtermScore, double finalScore) {
		double totalScore = midtermScore+finalScore;
		/*if(totalScore<=40)return "Fail";
		else return "Pass";*/
		return totalScore<=40?"Fail":"Pass";
	}
	public static void Header(int sec) {
		System.out.println("************************************************************");
		System.out.println("\t\t List of Data for Section " + sec);
		System.out.println("************************************************************");

	}
}//end class
