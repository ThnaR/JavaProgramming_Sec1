import javax.swing.*;
import java.util.Random;
import java.text.*;
public class Withdrawal {
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Random rand = new Random();
		int balance = rand.nextInt(9)*100000;
		int withdrawMoney = Integer.parseInt(
				JOptionPane.showInputDialog("Your balance : "+frm.format(balance)+ "\nInput money to withdraw : "));
		//if/else if for check condition
		if (withdrawMoney>balance ) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than balance"
					,"ERROR",JOptionPane.ERROR_MESSAGE);		
		}
		else if (withdrawMoney>20000 ) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than 20,000"
					,"ERROR",JOptionPane.ERROR_MESSAGE);		
		}
		else if (withdrawMoney%100!=0 ) {
			int money = withdrawMoney%100;
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw "+money+" baht."
					,"ERROR",JOptionPane.ERROR_MESSAGE);		
		}
		else {
			int thousand,five,hundred;
			thousand = withdrawMoney/1000;
			five = withdrawMoney%1000/500;
			hundred = withdrawMoney%500/100;
			JOptionPane.showMessageDialog(null, "You withdraw "+withdrawMoney+" baht."+
					"\n1,000 = "+thousand+"\n500 = "+five+"\n100 = "+hundred);	
		}
	}

}
