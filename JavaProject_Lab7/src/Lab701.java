import java.util.*;
public class Lab701 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[7];
		int oddNum=0;
		for(int i=0;i<num.length;i++) {
			System.out.print("Input number "+(i+1)+" : ");
			num[i] = scan.nextInt();
			if(num[i]%2!=0) {
				oddNum++;
			}	
		}
		System.out.print("\nThere are "+oddNum+" of odd number."+
				"\nList of odd number : ");
		for (int _num:num) {
			if(_num%2!=0) {
			System.out.print(_num+" ");
			}
		}
	}

}
