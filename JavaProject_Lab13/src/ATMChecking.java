
public class ATMChecking extends ATMData{
	private int money;
	public ATMChecking(String num, String pass, int money) {
		super(num,pass);
		this.money = money;
	}
}
