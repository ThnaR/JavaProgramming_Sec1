import javax.swing.*;
public class Example601 {

	public static void main(String[] args) {
		//1.input email from dialog box
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail:");
		//2.ส่งตัวแปร input email ไปยังเมธอด checkEmail และ return ค่ากลับ
		while(inputEmail.startsWith("@")||inputEmail.startsWith(" ")) {
			inputEmail = JOptionPane.showInputDialog("Input your e-mail again:");
			
		}
		boolean validateEmail = checkEmail(inputEmail);
		if (validateEmail) {
			JOptionPane.showMessageDialog(null, 
					"Your e-mail is " + inputEmail.toLowerCase());
				}
		else {
			JOptionPane.showMessageDialog(null, 
					"Your e-mail id not hotmail or gmail dot com");	
		}
		
	}
	public static boolean checkEmail(String email) {
		if (email.endsWith("hotmail.com")||email.endsWith("gmail.com")) {
			return true;
		}
		else return false;
	}
}
