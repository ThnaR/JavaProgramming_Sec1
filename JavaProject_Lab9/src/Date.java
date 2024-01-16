
public class Date {
	//The private attribute
	private int year,month,day;
	//Constructor with parameter
	Date(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	//Setters and Getters method
	public int getYear() {
		return this.year;
	}
	public int getMonth() {
		return this.month;
	}
	public int getDay() {
		return this.day;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setday(int day) {
		this.day = day;
	}
	//toString() method
	public String toString() {
		//built-in function String.format() to formatted string
		//Specifier "0" to print leading zeros
		return String.format("%02d/%02d/%02d",month,day,year);
	}
	public void setDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
}
