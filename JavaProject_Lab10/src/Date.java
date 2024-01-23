public class Date {
	private int dMonth;
	private int dDay;
	private int dYear;

	//Default constructor
	//PostCondition : dMonth = 1, dDay = 1, dYear = 1900
	Date(){
		dMonth = 1;
		dDay = 1;
		dYear = 1900;
	}
	
	//Constructor to set the date
	Date(int month, int day, int year){
		dMonth = month;
		dDay = day;
		dYear = year;
	}
	//Setter and Getter method
	public void setDate(int month, int day, int year) {
		dMonth = month;
		dDay = day;
		dYear = year;
	}
	//Method to return the month
	public int getMonth() {
		return dMonth;
	}
	//Method to return the day
	public int getDay() {
		return dDay;
	}
	//Method to return the year
	public int getYear() {
		return dYear;
	}
	//Method to return the date in the form mm-dd-yyyy
	public String toString() {
		return dMonth + "-" + dDay + "-" + dYear;
	}
}
