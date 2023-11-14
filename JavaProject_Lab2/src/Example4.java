import java.text.*;
import javax.swing.*;//1.import library for input data from dialog box
public class Example4 {
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		//2. input data from dialog box
		String productName = JOptionPane.showInputDialog("Input Product Name : ");
		
	/*	//input unit price from dialog box
		String strUnit = JOptionPane.showInputDialog("Input Product Unit : ");
		//convert string to int
		int productUnit = Integer.parseInt(strUnit); */
		
		//input and convert data from dialog box
		int productUnit = Integer.parseInt(JOptionPane.showInputDialog("Input Product Unit : "));
		
		//input price per unit from dialog box
		String strPrice = JOptionPane.showInputDialog("Input Price per unit : ");
		float pricePerUnit = Float.parseFloat(strPrice);
		
		//calculate total price
		float totalPrice = productUnit*pricePerUnit;
		
		//display data to dialog box
		double vat = totalPrice+(totalPrice*7/100);
		JOptionPane.showMessageDialog(null, "Total Price   is "+frm.format(totalPrice)+" baht."+
				"\nAdd VAT 7% is "+frm.format(vat)+" baht.");
		
		
	}

}
