import java.text.*;
import java.util.Scanner;
public class Lab101 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner input = new Scanner(System.in);
		System.out.print("Input product name   : ");
		String productName = input.nextLine();
		System.out.print("Input product unit   : ");
		int productUnit = input.nextInt();
		System.out.print("Input price per unit : ");
		float priceperUnit = input.nextFloat();
		System.out.println("-----------------------------------");
		double totalPrice = productUnit*priceperUnit;
		System.out.println("Total Price is "+totalPrice+" baht.");
		System.out.println("-----------------------------------");
		System.out.print("How many discount (%) : ");
		int discount = input.nextInt();
		System.out.println("-----------------------------------");
		double dis = totalPrice*discount/100;
		System.out.println("Discount from "+discount+"%"+dis);
		
	}

}
