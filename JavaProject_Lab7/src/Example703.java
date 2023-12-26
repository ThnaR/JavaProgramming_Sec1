import java.util.*;
public class Example703 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] number = new int[5];
		//for loop input data to array number
		for(int i=0;i<number.length;i++) {
			System.out.print("Input number "+(i+1)+" : ");
			number[i] = scan.nextInt();
		}
		int totalNumber = sumOfPos(number);
		System.out.print("\nSummation of positive number is "+totalNumber);
	}//end of main()
	public static int sumOfPos(int[] nums) {
		int sum = 0;
		for (int _nums:nums) {
			if(_nums>0) {
			sum += _nums; //sum = sum+_nums
			}
		}
		return sum;
	}
}
