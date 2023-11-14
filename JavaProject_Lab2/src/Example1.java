
public class Example1 {
	public static void main(String[] args) {
		String isbn="IB2-6325-85-4-1", title="Basic Java Programming";
		int unit=5;
		double price = 225.75;
		System.out.println("Book ISBN  : "+ isbn);
		System.out.println("Book Title : "+ title);
		System.out.println("Book Unit  : "+ unit +" Book.");
		System.out.println("Book Price : "+ price+ " Baht.");
		System.out.println("-----------------------------------");
		double totalPrice = unit*price;
		System.out.println("Total Price is "+ totalPrice);
		double vat = totalPrice+(totalPrice*7/100);
		System.out.println("Add VAT 7%  is "+ vat);
	}

}
