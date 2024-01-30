import java.time.*;
public class FictionBook implements Author, Book {
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	FictionBook(String title, int publicYear){
		this.title = title;
		this.publicYear = publicYear;
	}
	public void setAuthorName(String name) {
		this.author_name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean checkFormatName() {
		 return (this.author_name.indexOf(" ") > 0);
	}
	@Override
	public String getTitle() {
		return title;
	}
	@Override
	public String getLastName() {
		return this.author_name.substring(this.author_name.indexOf(" ")).trim().toUpperCase();
	}
	@Override
	public String getFirstName() {
		return this.author_name.substring(0, this.author_name.indexOf(" ")).toUpperCase();
	}
	@Override
	public boolean checkEmail() {
		if(this.email.endsWith("@hotmail.com")||this.email.endsWith("@windowslive.com")) return true;
		else return false;
	}
	@Override
	public int totalPublicYear() {
		return Year.now().getValue()-publicYear;
	}
	public String toString() {
		return this.title+" write by "+getLastName().charAt(0)+"."+getFirstName()
		+" ("+this.email+")"+"\nPublished for "+totalPublicYear()+" years.";
	}
}
