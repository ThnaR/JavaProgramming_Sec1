import java.util.*;
import java.io.*;
public class SaveandOpen extends Employee{
	private String name;
	private String dept;
	
	public void insert() throws IOException{
		//create object for input data from keyboard(console)
		Scanner input = new Scanner(System.in);
		//create object for write data to file
		PrintStream writeFile = new PrintStream((new File("d://txtFile//employee.txt")));
		String answer;
		do {
			header();//call header() method from employee class
			System.out.print("Enter name : ");
			name = input.next();
			System.out.print("Enter department : ");
			dept = input.next();
			//save all data to file employee.txt
			writeFile.println(name+"\t"+dept);
			System.out.print("Enter data again? : ");
			answer = input.next().toLowerCase();
		}while(answer.equalsIgnoreCase("y"));
		writeFile.close();
	}
	public void read() {
		try {
			Scanner readFile = new Scanner(new File("d://txtFile//employee.txt"));
			boolean check = false;
			header();//call header() method from employee class
			int i=0;
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next();
				if(dept.equalsIgnoreCase(super.getDept())) {
					System.out.println(i+1+") "+name);
					check = true;
					i++;
				}
				
			}
			header();//call header() method from employee class
			System.out.print("Employee in dept "+super.getDept()+" is "+i+" person.");
			if(check==false) {
				header();//call header() method from employee class
				System.out.print("\nSorry, no dept : "+super.getDept()+" in file.");
			}
		}catch(IOException e) {
			System.out.println("Sorry, file not found");
		}
	}
}
