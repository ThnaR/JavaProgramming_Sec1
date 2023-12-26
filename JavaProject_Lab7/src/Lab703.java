import java.util.*;
public class Lab703 {

	public static void main(String[] args) {
		int num[] = {78, 36, 58, 41, 25, 92, 75};
		Scanner scan = new Scanner(System.in);
		System.out.print("Input index of array : ");
		int index = scan.nextInt();
		while(index<0||index>6) {
			System.out.print("Input index of array, again : ");
			index = scan.nextInt();
		}
		if(index!=6) {
			System.out.print("\nValue in current index is "+num[index]+
					"\nValue in next	 index is "+num[index+1]);
		}
		else {
			System.out.print("\nValue in current index is "+num[index]+
					"\nSorry, "+index+" is the last index in array.");
		}
	}

}
