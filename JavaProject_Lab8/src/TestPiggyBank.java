import java.util.*;
public class TestPiggyBank {
	static Scanner scan = new Scanner(System.in);
	static PiggyBank pb = new PiggyBank();
	public static void main(String[] args) {
		/*pb.setPiggyBank(500);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTwo (34);
		System.out.println("Add 2 Bath Money : " + 34);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTen(13);
		System.out.println("Add 10 Bath Money : " + 13);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addfive(100);*/
		inputCoin();
	}
	public static void inputCoin() {
		System.out.println("Money Total : "+pb.getTotal());
		System.out.print("Please difine size of PiggyBank:");
		int sizeofPiggyBank = scan.nextInt();
		pb.setPiggyBank(sizeofPiggyBank);
		System.out.println("Size of your PiggyBank:"+pb.getPiggyBank());
		System.out.println();
		MainMenu();
	}
	public static void Line() {
		System.out.println("============================");
	}
	public static void MainMenu() {
		while(true) {
			Line();
			System.out.println("Menu of PiggyBank");
			Line();
			System.out.println("[1] one baht."
					+ "\n[2] two baht."
					+ "\n[3] five baht."
					+ "\n[4] ten baht."
					+ "\n[5] Exit");
			Line();
			System.out.print("Plese select Menu[1-5] : ");
			int menu = scan.nextInt();
			int num=0;
			if (menu == 1) num=1;
			if (menu == 2) num=2;
			if (menu == 3) num=5;
			if (menu == 4) num=10;
			if (menu == 5) {
				System.out.println("Bye Bye");
				break;
			}
			System.out.print("Insert "+num+" Baht Money: ");
			int money = scan.nextInt();
			if (money>pb.getTotal()) System.out.println("Piggy Bank Full");
			else if (menu == 1) {
				pb.addOne(money);
			}
			else if (menu == 2) {
				pb.addTwo(money);
			}
			else if (menu == 3) {
				pb.addFive(money);
			}
			else if (menu == 4) {
				pb.addTen(money);
			}			
			System.out.println("Money Total : "+pb.getTotal());
			
		}
	}
	

}
