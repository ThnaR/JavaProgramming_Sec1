import javax.swing.*;
public class Lab705 {

	public static void main(String[] args) {
		int num[] = new int[5];
		for(int i=0;i<num.length;i++) {
		num[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number "+(i+1)+" : "));		
		}
		showEven(num);
		showOdd(num);
	}
	public static void showEven(int[] nums) {
		String display = "";
		for(int _nums:nums) 
			if(_nums%2==0)
				display += _nums+" ";
				JOptionPane.showMessageDialog(null,"List of even number:\n" +display);				
	}
	public static void showOdd(int[] nums) {
		String display = "";
		for(int _nums:nums) 
			if(_nums%2!=0)
				display += _nums+" ";
				JOptionPane.showMessageDialog(null,"List of odd number:\n" +display);			
	}

}
